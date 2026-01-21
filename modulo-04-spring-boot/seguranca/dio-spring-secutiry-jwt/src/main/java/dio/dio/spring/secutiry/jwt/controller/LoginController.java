package dio.dio.spring.secutiry.jwt.controller;

import dio.dio.spring.secutiry.jwt.dtos.Login;
import dio.dio.spring.secutiry.jwt.dtos.Sessao;
import dio.dio.spring.secutiry.jwt.model.User;
import dio.dio.spring.secutiry.jwt.repository.UserRepository;
import dio.dio.spring.secutiry.jwt.security.JWTCreator;
import dio.dio.spring.secutiry.jwt.security.JWTObject;
import dio.dio.spring.secutiry.jwt.security.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class LoginController {

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private UserRepository repository;

    @Autowired
    private SecurityConfig securityConfig;

    @PostMapping("/login")
    public Sessao logar(@RequestBody Login login) {
        User user = repository.findByUsername(login.getUsername());

        if (user == null) {
            throw new RuntimeException("Erro ao tentar fazer login: usuário não encontrado");
        }

        if (!encoder.matches(login.getPassword(), user.getPassword())) {
            throw new RuntimeException("Senha inválida para o login: " + login.getUsername());
        }

        // Criando o JWT
        JWTObject jwtObject = new JWTObject();
        jwtObject.setSubject(user.getUsername());
        jwtObject.setIssuedAt(Instant.now());
        jwtObject.setExpiration(Instant.now().plusMillis(securityConfig.getExpiration()));
        jwtObject.setRoles(user.getRoles());

        // Montando a sessão de retorno
        Sessao sessao = new Sessao();
        sessao.setLogin(user.getUsername());
        sessao.setToken(JWTCreator.create(securityConfig.getPrefix(), securityConfig.getKey(), jwtObject));

        return sessao;
    }
}


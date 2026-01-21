package dio.dio.spring.secutiry.jwt.service;

import dio.dio.spring.secutiry.jwt.model.User;
import dio.dio.spring.secutiry.jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder encoder;

    public void createUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        repository.save(user);
    }

}

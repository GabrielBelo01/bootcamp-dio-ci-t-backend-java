package dio.web.api.repository;

import dio.web.api.handler.BusinessException;
import dio.web.api.handler.CampoObrigatorioExecption;
import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario){
        if(usuario.getLogin() == null) throw new CampoObrigatorioExecption("login");

        if(usuario.getPassword() == null) throw new CampoObrigatorioExecption("login");

        if(usuario.getId() == null){
            System.out.println("SAVE - Recebendo o usuario na camada repositorio");
        }
        else {
            System.out.println("UPDATE - Recebendo o usuario na camada repositorio");
        }

        System.out.println(usuario);

    }

    public void deleteById (Integer id){
        System.out.println("DELETE/id - Recebendo o id: "+ id +" para excluir um usuario");
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(1,"gabriel", "password"));
        usuarios.add(new Usuario(2,"frank", "masterpass"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println("FIND/id - Recebendo o id: %d para localizar um usuario" + id);
        return new Usuario (1,"gabriel", "password");
    }

    public Usuario findByUsername(String username){
        System.out.println("FIND/username - Recebendo o username: " + username + " para localizar um usuario");

        return new Usuario(2,"frank", "masterpass");
    }
}

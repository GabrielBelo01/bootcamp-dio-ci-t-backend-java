package dio.spring.security.repository;

import dio.spring.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);

}
package springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootdemo.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
}

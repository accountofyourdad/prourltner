package hosting.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<MyUser, Integer> {

}

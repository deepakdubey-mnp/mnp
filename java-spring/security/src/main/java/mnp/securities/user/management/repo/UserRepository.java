package mnp.securities.user.management.repo;

import mnp.securities.user.management.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, String> {

    public User findByEmailAllIgnoreCase(String email);

}
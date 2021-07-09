package mnp.securities.user.management.repo;

import mnp.securities.user.management.entities.UserAuthority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAuthorityRepository extends JpaRepository<UserAuthority, Integer> {
}
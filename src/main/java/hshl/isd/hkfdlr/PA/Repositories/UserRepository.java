package hshl.isd.hkfdlr.PA.Repositories;

import hshl.isd.hkfdlr.PA.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    List<User> findUserByUserId(Long id);
}

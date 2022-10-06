package hshl.isd.hkfdlr.PA.Repositories;

import hshl.isd.hkfdlr.PA.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//    @Query("{id: '?0'}")
    List<User> findUserByUserId(Long id);
}

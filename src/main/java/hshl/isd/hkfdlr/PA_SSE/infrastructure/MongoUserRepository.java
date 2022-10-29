package hshl.isd.hkfdlr.PA_SSE.infrastructure;

import hshl.isd.hkfdlr.PA_SSE.Domain.Entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoUserRepository extends
        MongoRepository<User, Long> {
}

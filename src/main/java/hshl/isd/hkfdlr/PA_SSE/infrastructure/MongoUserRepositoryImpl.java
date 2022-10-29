package hshl.isd.hkfdlr.PA_SSE.infrastructure;

import com.mongodb.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import com.querydsl.core.types.dsl.BooleanExpression;
import hshl.isd.hkfdlr.PA_SSE.Domain.Entities.Repositories.UserRepository;
import hshl.isd.hkfdlr.PA_SSE.Domain.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.core.ExecutableFindOperation;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public class MongoUserRepositoryImpl implements UserRepository {

    MongoOperations mongoOps = new MongoTemplate(new SimpleMongoClientDatabaseFactory((MongoClient) MongoClients.create(), "Projektarbeit"));

    @Autowired
    MongoUserRepository userRepository;

    @Override
    public boolean isAuthenticated(Long userId, String phoneNumber) {
        Optional<User> result = userRepository.findById(userId);
        return result.isPresent();
    }

    @Override
    @Query("{'phoneNumber': ?0}")
    public boolean registerUser(String phoneNumber) {
        return false;
    }
}

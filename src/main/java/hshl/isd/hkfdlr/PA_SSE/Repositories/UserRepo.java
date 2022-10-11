package hshl.isd.hkfdlr.PA_SSE.Repositories;

import hshl.isd.hkfdlr.PA_SSE.Dtos.MessageView;
import hshl.isd.hkfdlr.PA_SSE.Entities.Message;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface UserRepo extends ReactiveMongoRepository<Message, Long> {

    @Tailable
    Flux<MessageView> findWithTailableCursorByRoom(String room);

}

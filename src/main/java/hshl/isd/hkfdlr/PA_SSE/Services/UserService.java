package hshl.isd.hkfdlr.PA_SSE.Services;

import hshl.isd.hkfdlr.PA_SSE.Dtos.MessageView;
import hshl.isd.hkfdlr.PA_SSE.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.LocalDateTime;

@Service
public class UserService {

//    @Autowired
//    UserRepo userRepo;
//
//    public Flux<MessageView> findWithTailableCursorByRoom(String room) {
//        return userRepo.findWithTailableCursorByRoom(room)
//                .map(msg -> new MessageView(msg.getText(), "anon", LocalDateTime.now()));
//    };

//    public newMessage(MessageBody messageBody) {
//        this.userRepo.save(Message(null, messageBody.text, messageBody.room)).subscribe();
//    }

}

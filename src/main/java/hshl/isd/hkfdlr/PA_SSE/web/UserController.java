package hshl.isd.hkfdlr.PA_SSE.web;

import hshl.isd.hkfdlr.PA_SSE.Dtos.MessageView;
import hshl.isd.hkfdlr.PA_SSE.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/messages")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<MessageView> getAllMessages(@RequestParam String room) {
        return userService.findWithTailableCursorByRoom(room);
    }

}

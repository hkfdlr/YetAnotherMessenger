package hshl.isd.hkfdlr.PA.web;

import hshl.isd.hkfdlr.PA.Entities.User;
import hshl.isd.hkfdlr.PA.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

import java.util.List;
import java.util.UUID;

//@EnableWebSocket
@Controller
@RequestMapping("users")
public class RestController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<User>> getUsers(@RequestParam Long id) {
        List<User> userList = userRepository.findUserByUserId(id);

        return ResponseEntity.ok(userList);
    }
}
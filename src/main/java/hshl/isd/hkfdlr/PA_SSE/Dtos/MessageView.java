package hshl.isd.hkfdlr.PA_SSE.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MessageView {

    String text;
    String user;
    LocalDateTime timestamp;
}

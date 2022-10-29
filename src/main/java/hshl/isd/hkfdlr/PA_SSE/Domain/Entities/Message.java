package hshl.isd.hkfdlr.PA_SSE.Domain.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Message {

    private final Long messageId;
    private final Long fromUser;
    private final Long toUser;
    private final String messageText;

}

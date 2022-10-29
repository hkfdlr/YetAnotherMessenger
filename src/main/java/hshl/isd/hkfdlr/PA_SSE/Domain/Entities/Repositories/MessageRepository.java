package hshl.isd.hkfdlr.PA_SSE.Domain.Entities.Repositories;

import hshl.isd.hkfdlr.PA_SSE.Domain.Entities.Message;

import java.util.List;

public interface MessageRepository {
    List<Message> getAllPendingMessagesForUser(Long userId);

    void sendMessage();
}

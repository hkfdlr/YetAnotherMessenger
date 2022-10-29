package hshl.isd.hkfdlr.PA_SSE.Domain.Entities.Repositories;

public interface UserRepository {

    boolean isAuthenticated(Long userId, String phoneNumber);

    boolean registerUser(String phoneNumber);
}

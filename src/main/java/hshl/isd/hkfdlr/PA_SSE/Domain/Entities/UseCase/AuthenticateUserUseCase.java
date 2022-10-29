package hshl.isd.hkfdlr.PA_SSE.Domain.Entities.UseCase;

import hshl.isd.hkfdlr.PA_SSE.application.ports.AuthenticateUserCommand;

public interface AuthenticateUserUseCase {

    boolean isAuthenticated(AuthenticateUserCommand command);

}

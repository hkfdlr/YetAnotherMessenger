package hshl.isd.hkfdlr.PA_SSE.application.ports;

import hshl.isd.hkfdlr.PA_SSE.Domain.Entities.UseCase.AuthenticateUserUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AuthenticateUserService implements AuthenticateUserUseCase {

    @Override
    public boolean isAuthenticated(AuthenticateUserCommand command) {
        return false;
    }
}

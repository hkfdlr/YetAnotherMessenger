package hshl.isd.hkfdlr.PA_SSE.application.ports;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.jetbrains.annotations.NotNull;

@Value
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = false)
public class AuthenticateUserCommand {

    @NotNull
    private final Long userId;

}

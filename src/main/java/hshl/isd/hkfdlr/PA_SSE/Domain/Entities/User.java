package hshl.isd.hkfdlr.PA_SSE.Domain.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.util.Optional;

@Getter
@AllArgsConstructor
public class User {

    @Field("userId")
    private final Long userId;
    @Field(name = "username", targetType = FieldType.STRING)
    private final String username;
    @Field(name = "phoneNumber", targetType = FieldType.STRING)
    private final String phoneNumber;

}

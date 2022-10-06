package hshl.isd.hkfdlr.PA.Entities;

import lombok.*;
//import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "USERS")
//@Document("users")
public class User {

//    UUID userId;
//    String firstName;
//    String lastName;
//    String userName;
//    Number phoneNumber;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    UUID userId;

    @Column(name = "firstName")
    String firstName;

    @Column(name = "lastName")
    String lastName;

    @Column(name = "userName")
    String userName;

    @Column(name = "phoneNumber")
    Number phoneNumber;

//    Contact[] contacts;

//    @Id
//    String id;
}

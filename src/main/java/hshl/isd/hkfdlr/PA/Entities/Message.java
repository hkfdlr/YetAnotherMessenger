package hshl.isd.hkfdlr.PA.Entities;

import lombok.*;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.UUID;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "MESSAGES")
public class Message {
    // primary key
//    Number senderNumber;
//    Number receiverNumber;
    // foreign key
//    UUID contactId;
//    SimpleDateFormat timestamp;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "message")
    String message;

    @Column(name = "fromId")
    String from;

    @Column(name = "toId")
    String to;

    @Column(name = "timestamp")
    SimpleDateFormat timestamp;
}

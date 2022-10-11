package hshl.isd.hkfdlr.PA_SSE;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class PaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		XMPPTCPConnectionConfiguration config = XMPPTCPConnectionConfiguration.builder()
//				.setUsernameAndPassword("hkfdlr", "z21t18i20t")
//				.setXmppDomain("jabb3r.org")
//				.setHost("jabb3r.org")
//				.build();
//
//		AbstractXMPPConnection connection = new XMPPTCPConnection(config);
//		connection.connect();
//		connection.login();
	}
}

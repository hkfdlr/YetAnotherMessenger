package hshl.isd.hkfdlr.PA_SSE;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"hshl.isd.hkfdlr.PA_SSE.Repositories"})
//@EnableMongoRepositories
public class PaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaApplication.class, args);
	}
}

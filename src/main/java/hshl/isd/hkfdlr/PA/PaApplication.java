package hshl.isd.hkfdlr.PA;

import com.zaxxer.hikari.HikariConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class PaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		HikariConfig config = new HikariConfig();
//		config.setJdbcUrl("postgres://imthyegl:tJeUCKe4TdheqoORu3OshOSPGSS0waQi@lucky.db.elephantsql.com/imthyegl");
//		config.setDataSourceClassName("org.postgresql.ds.PGSimpleDataSource");
	}
}

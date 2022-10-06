package hshl.isd.hkfdlr.PA;

import hshl.isd.hkfdlr.PA.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
@EnableMongoRepositories
public class PaApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(PaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		HikariConfig config = new HikariConfig();
//		config.setJdbcUrl("postgres://imthyegl:tJeUCKe4TdheqoORu3OshOSPGSS0waQi@lucky.db.elephantsql.com/imthyegl");
//		config.setDataSourceClassName("org.postgresql.ds.PGSimpleDataSource");

//		ConnectionString connectionString = new ConnectionString("mongodb+srv://hkfdlr:<password>@projektarbeit.3qm6rxx.mongodb.net/?retryWrites=true&w=majority");
//		MongoClientSettings settings = MongoClientSettings.builder()
//				.applyConnectionString(connectionString)
//				.serverApi(ServerApi.builder()
//						.version(ServerApiVersion.V1)
//						.build())
//				.build();
//		MongoClient mongoClient = MongoClients.create(settings);
//		MongoDatabase database = mongoClient.getDatabase("test");

	}
}

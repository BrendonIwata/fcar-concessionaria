package iwata.brendon.fcarconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FcarConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(FcarConfigserverApplication.class, args);
	}

}

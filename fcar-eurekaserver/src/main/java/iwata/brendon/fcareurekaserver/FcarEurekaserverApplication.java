package iwata.brendon.fcareurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FcarEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(FcarEurekaserverApplication.class, args);
	}

}

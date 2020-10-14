package ningyuan.pan.spring.cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ningyuan.pan.spring.cloud.eureka.server.config.ApplicationConfig;

/**
 * @author ningyuan
 *
 */
@SpringBootApplication
public class EurekaServerApp {

	public static void main(String[] args) {
		SpringApplication bootstrap = new SpringApplication(ApplicationConfig.class);
		
		bootstrap.run(args);
	}

}

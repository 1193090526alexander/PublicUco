package co.edu.uco.publiuco.api.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@SpringBootApplication
@EnableAutoConfiguration
@EntityScan("/co.edu.uco.publiuco.entity")
public class PubliucoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PubliucoApiApplication.class, args);
	}

}

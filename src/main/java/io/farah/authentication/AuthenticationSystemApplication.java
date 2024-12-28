package io.farah.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AuthenticationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationSystemApplication.class, args);
	}

}

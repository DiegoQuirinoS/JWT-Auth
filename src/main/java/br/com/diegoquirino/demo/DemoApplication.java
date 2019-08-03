package br.com.diegoquirino.demo;

import br.com.diegoquirino.demo.security.model.Usuario;
import br.com.diegoquirino.demo.security.repository.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	PasswordEncoder passwordEncoder;

	@Bean
	public CommandLineRunner demo(UserDetailRepository repository) {
		return (args) -> {
			// save a couple of customers
			Usuario user = new Usuario("user", passwordEncoder.encode("javainuse"));
			repository.save(user);
		};
	}

}

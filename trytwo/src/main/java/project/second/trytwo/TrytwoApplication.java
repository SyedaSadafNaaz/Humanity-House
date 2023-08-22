package project.second.trytwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"project.second.trytwo.controller","project.second.trytwo.service"})
@EntityScan(basePackages = {"project.second.trytwo.entity"})
@EnableJpaRepositories(basePackages = {"project.second.trytwo.repository"})
public class TrytwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrytwoApplication.class, args);
	}

}

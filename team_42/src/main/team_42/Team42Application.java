package main.team_42;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Team42Application {

	public static void main(String[] args) {
		SpringApplication.run(Team42Application.class, args);
	}
}

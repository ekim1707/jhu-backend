package practice.JHUBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public abstract class JhuBackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(JhuBackendApplication.class, args);
		returnString();
	}

	public static void returnString() {
		System.out.println("Hello");
	}

}

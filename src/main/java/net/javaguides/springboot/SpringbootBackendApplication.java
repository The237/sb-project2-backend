package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
<<<<<<< HEAD
import org.springframework.context.annotation.Configuration;
=======
>>>>>>> 07-deleteEmployee
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringbootBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	// Managing CORS
<<<<<<< HEAD
	@Bean(name = "corsConfigurer")
=======
	@Bean
>>>>>>> 07-deleteEmployee
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry
<<<<<<< HEAD
						.addMapping("/api/v1/employees/**")
						.allowedOrigins("http://localhost:4200")
						.allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH");
=======
						.addMapping("/api/v1/employees/**");
>>>>>>> 07-deleteEmployee
			}
		};
	}
}

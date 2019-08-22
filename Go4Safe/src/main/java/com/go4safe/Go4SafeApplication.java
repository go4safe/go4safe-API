package com.go4safe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan("com.go4safe")
//@EnableJpaRepositories("com.go4safe.repository")
@EntityScan(basePackages = "com.go4safe.model")
@EnableSwagger2
@SpringBootApplication
public class Go4SafeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Go4SafeApplication.class, args);
	}

}

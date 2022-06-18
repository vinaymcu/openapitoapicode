package com.myapp.gradleapp;

//import io.swagger.v3.oas.annotations.OpenAPIDefinition;
//import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@OpenAPIDefinition(info = @Info(title = "Student API", version = "2.0", description = "Student Information"))
public class GradleappApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleappApplication.class, args);
	}

}

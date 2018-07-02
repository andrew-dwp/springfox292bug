package app.main;

import app.api.PersonApi;
import app.config.SwaggerConfig;
import app.controller.PersonController;
import app.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {PersonController.class, SwaggerConfig.class, Person.class, PersonApi.class})
public class  PersonApp {

    public static void main(String[] args) {
        SpringApplication.run(PersonApp.class, args);
    }
}

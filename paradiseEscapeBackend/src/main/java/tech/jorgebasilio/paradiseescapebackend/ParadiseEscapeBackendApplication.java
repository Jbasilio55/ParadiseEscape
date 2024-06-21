package tech.jorgebasilio.paradiseescapebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ParadiseEscapeBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParadiseEscapeBackendApplication.class, args);
    }

}

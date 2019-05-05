package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
public class ReadingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadingApplication.class, args);
    }

}

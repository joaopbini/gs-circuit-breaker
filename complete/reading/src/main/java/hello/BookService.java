package hello;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class BookService {

    private static final String DEFAULT_RETURN = "Cloud Native Java (O'Reilly)";

    private final RestTemplate restTemplate;

    public BookService(RestTemplate rest) {
        this.restTemplate = rest;
    }

    @HystrixCommand(fallbackMethod = "reliable")
    String readingList() {
        URI uri = URI.create("http://localhost:8090/recommended");
        return this.restTemplate.getForObject(uri, String.class);
    }

    String reliable() {
        return DEFAULT_RETURN;
    }

}

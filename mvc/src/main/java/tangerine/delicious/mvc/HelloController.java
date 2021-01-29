package tangerine.delicious.mvc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        log.info("hello");
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/hello", String.class);
        log.info("bye");
        return response.getBody();
    }
}

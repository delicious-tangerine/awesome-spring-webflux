package tangerine.delicious.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        log.info("hello!");
        Thread.sleep(3000);
        return "hello";
    }
}

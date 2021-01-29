package tangerine.delicious.webflux;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Mono<String> hello() {
        log.info("hello");
        WebClient webClient = WebClient.builder().baseUrl("http://localhost:8080").build();
        Mono<String> resultMono = webClient.get().uri("/hello").retrieve().bodyToMono(String.class);

        return resultMono.doOnNext(s -> log.info("bye"));
    }
}

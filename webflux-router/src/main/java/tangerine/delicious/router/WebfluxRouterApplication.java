package tangerine.delicious.router;

import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import reactor.netty.DisposableChannel;
import reactor.netty.http.server.HttpServer;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

public class WebfluxRouterApplication {
    public static void main(String[] args) {
        HttpHandler httpHandler = RouterFunctions.toHttpHandler(routes());
        ReactorHttpHandlerAdapter reactorHttpHandlerAdapter = new ReactorHttpHandlerAdapter(httpHandler);
        HttpServer.create()
                .port(8083)
                .handle(reactorHttpHandlerAdapter)
                .bind()
                .flatMap(DisposableChannel::onDispose)
                .block();
    }

    static RouterFunction<ServerResponse> routes() {
        return route(GET("/hello"), request -> {
            Mono<String> helloResponse = Mono.just("hello");
            return ServerResponse.ok().body(helloResponse, String.class);
        });
    }
}

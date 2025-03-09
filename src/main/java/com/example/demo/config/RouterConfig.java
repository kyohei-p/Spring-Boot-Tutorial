package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;
// import reactor.core.publisher.Mono;
// import reactor.core.publisher.Flux;

@Configuration
public class RouterConfig {
  @Bean
  // public RouterFunction<ServerResponse> routes() {
  //     // Helloの文字列を含むMono（Flux）を生成。0個または1個（n個）の要素を非同期的に返す
  //     return RouterFunctions.route(GET("/"), req -> ok().body(Mono.just("Hello"), String.class));
        // return RouterFunctions.route(GET("/"), req -> ok().body(Flux.just("Hello", "Page"), String.class));
  // }
  public RouterFunction<ServerResponse> routes() {
    return RouterFunctions.route(GET("/"), req -> ok().bodyValue(req));
  }
}

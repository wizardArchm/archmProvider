package ren.wizard.archm.provider.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

/**
 * @author uyangjie
 */
@RestController
@RequestMapping("/test/")
public class TestController {
    @GetMapping("/rest/")
    public ResponseEntity<String> testGet() {
        return new ResponseEntity<>("hello world", HttpStatus.OK);
    }

    @GetMapping("/rest/echo/{word}/")
    public ResponseEntity<String> testEcho(@PathVariable("word") String word) {
        return new ResponseEntity<>(word, HttpStatus.OK);
    }

    @GetMapping("/flux/")
    public Flux<String> testFluxGet() {
        return Flux.just("hello world from webflux");
    }

    @GetMapping("/flux/echo/{word}/")
    public Flux<String> testFluxEcho(@PathVariable("word") String word) {
        return Flux.just(word);
    }

    @GetMapping("/flux/sleep/")
    public Flux<String> testFluxSleep() {
        return Flux.just("sleep").delayElements(Duration.ofMillis(500));
    }

    @GetMapping("/rest/sleep/")
    public ResponseEntity<String> testSleep() throws InterruptedException {
        Thread.sleep(500);
        return new ResponseEntity<>("sleep", HttpStatus.OK);
    }
}

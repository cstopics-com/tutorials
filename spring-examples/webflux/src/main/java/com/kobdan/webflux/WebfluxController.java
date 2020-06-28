package com.kobdan.webflux;

import org.reactivestreams.Publisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kobdan.webflux.user.User;
import com.kobdan.webflux.user.UserRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class WebfluxController {

	private UserRepository userRepository;

    public WebfluxController(UserRepository employeeRepository) {
        this.userRepository = userRepository;
    }
    
    @GetMapping("/")
    public Publisher<String> home() {
        return Mono.just("Home page");
    }

    @GetMapping("/{id}")
    private Mono<User> getUserById(@PathVariable String id) {
        return userRepository.findUserById(id);
    }

    @GetMapping("/all")
    private Flux<User> getAllUsers() {
        return userRepository.findAllUsers();
    }
}

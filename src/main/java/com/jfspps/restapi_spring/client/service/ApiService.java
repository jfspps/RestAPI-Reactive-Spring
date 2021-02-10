package com.jfspps.restapi_spring.client.service;

import com.jfspps.restapi_spring.api.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);

    Flux<User> getUsers(Mono<Integer> limit);
}

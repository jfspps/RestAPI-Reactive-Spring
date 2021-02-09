package com.jfspps.restapi_spring.client.service;

import com.jfspps.restapi_spring.api.model.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}

package com.example.test.User.dbo;

import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface UserHttpClient {

    @GetExchange("/users")
    List<User> getUsers();

    @GetExchange("/users/{id}")
    User getUser(Integer id);
}

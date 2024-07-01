package com.example.test.User;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class UserRestClient {
    private final RestClient restClient;

    public UserRestClient(RestClient restClient) {
        this.restClient = restClient;
    }
}

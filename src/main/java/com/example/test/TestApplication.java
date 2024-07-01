package com.example.test;

import com.example.test.Student.Student;
import com.example.test.User.UserRepository;
import com.example.test.User.UserRestClient;
import com.example.test.User.dbo.User;
import com.example.test.User.dbo.UserHttpClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class TestApplication {

    private static final Logger logger = LoggerFactory.getLogger(TestApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @Bean
    UserHttpClient userHttpClient() {
        RestClient restClient = RestClient.create("https://jsonplaceholder.typicode.com");
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(RestClientAdapter.create(restClient)).build();
        return factory.createClient(UserHttpClient.class);
    }

    @Bean
    CommandLineRunner commandLineRunner(UserRestClient client) {
        return args -> {
            List<User> users = client.findAll();
            System.out.println(Arrays.toString(users.toArray()));
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                System.out.println(objectMapper.writeValueAsString(users));
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
    }

//    @Bean
//    CommandLineRunner commandLineRunner() {
//        return args -> {
//          Student student = new Student();
//          logger.info("Student :{}", student);
//        };
//    }
}

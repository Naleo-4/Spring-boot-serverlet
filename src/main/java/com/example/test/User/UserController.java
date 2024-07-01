package com.example.test.User;

import com.example.test.User.dbo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id,@RequestBody User user) {
        userService.updateUser(id,user);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
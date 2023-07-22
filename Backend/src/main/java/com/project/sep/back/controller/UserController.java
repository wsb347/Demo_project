package com.project.sep.back.controller;

import com.project.sep.back.Entity.User;
import com.project.sep.back.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public User signup(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    // TODO: Implement socialLogin logic
    public String socialLogin(User user) {
        return "소셜 로그인 로직이 아직 구현되지 않았습니다!";
    }

    // TODO: Implement logout logic
    public String logout() {
        return "로그아웃 로직이 아직 구현되지 않았습니다!";
    }

    // TODO: Implement login logic
    public String login(User user) {
        return "로그인 로직이 아직 구현되지 않았습니다!";
    }
}

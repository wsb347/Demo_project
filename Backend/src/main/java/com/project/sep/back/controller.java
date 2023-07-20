package com.project.sep.back;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    User = null;
    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/social-login")
    public ResponseEntity<?> socialLogin(@RequestBody User user) {
        // Temp Logic
        String result = userService.socialLogin(user);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logout() {
        // Temp Logic
        String result = userService.logout();
        return ResponseEntity.ok(result);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody User user) {
        // Temp Logic
        String result = userService.signup(user);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        // Temp Logic
        String result = userService.login(user);
        return ResponseEntity.ok(result);
    }
}

@Service
public class UserService {

    public String socialLogin(User user) {
        // SNS 인증 정보를 이용한 로그인 처리
    }

    public String logout() {
        // 로그아웃 처리
    }

    public String signup(User user) {
        // 회원가입 처리
    }

    public String login(User user) {
        // 일반 로그인 처리
    }
}
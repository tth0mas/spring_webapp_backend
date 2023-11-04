package com.thomas.bruker.user;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Allow requests from this origin
@RequestMapping(path = "api/v1/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "register")
    public String register(@RequestBody User user) {
        userService.register(user);
        return "registered";

    }

    @PostMapping(path = "login")
    public String login(@RequestBody User user) {
        userService.login(user);
        return "logged in";
    }

}

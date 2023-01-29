package org.nox7.userregistrationdemo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/list")
    public List<User> listUsers(){
        return userService.listUsers();
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user){
        userService.addNewUser(user);
    }

}

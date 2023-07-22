package hashenjanu.example.springsecurity.contoller;

import hashenjanu.example.springsecurity.entity.User;
import hashenjanu.example.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping({"register-new-user"})
    public User registerNewUser(@RequestBody User user){

        return userService.registerNewUser(user);
    }

    @PostConstruct
    public void initRoleAndUser(){
        userService.initRoleAndUser();
    }

    @GetMapping({"for-admin"})
    public String forAdmin(){
        return "this url is only acssesible to admin";
    }

    @GetMapping({"for-user"})
    public String forUser(){
        return "this url is only acssesible to user";
    }
}

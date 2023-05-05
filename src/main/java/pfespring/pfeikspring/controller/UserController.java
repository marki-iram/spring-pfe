package pfespring.pfeikspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pfespring.pfeikspring.service.UserService;
import pfespring.pfeikspring.entity.User;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }
    @PostMapping("/")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }
}

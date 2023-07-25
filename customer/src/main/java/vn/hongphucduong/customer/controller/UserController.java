package vn.hongphucduong.customer.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vn.hongphucduong.customer.model.User;
import vn.hongphucduong.customer.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository repo;

    @PostMapping("/users")
    public void listAll(@RequestBody User user) {
//        User user = new User();
//        user.setEmail("dasd");
//        user.setPassword("1234");
        List<User> listUsers = new ArrayList<>();
        listUsers.add(user);
        repo.saveAll(listUsers);
    }
}

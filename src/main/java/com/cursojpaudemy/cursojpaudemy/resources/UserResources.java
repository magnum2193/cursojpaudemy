package com.cursojpaudemy.cursojpaudemy.resources;

import com.cursojpaudemy.cursojpaudemy.entities.User;
import com.cursojpaudemy.cursojpaudemy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        var list = userService.findAll();
        return ResponseEntity.ok().body(list);
    }
}

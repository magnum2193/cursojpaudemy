package com.cursojpaudemy.cursojpaudemy.resources;

import com.cursojpaudemy.cursojpaudemy.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value ="/users")
public class UserResources {

    @GetMapping
    public ResponseEntity <User> findAll(){
        var u = new User(1L,"Rodrigo","magnum@gmail.com","9999999","123456");
        return ResponseEntity.ok().body(u);
    }
}

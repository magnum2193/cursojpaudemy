package com.cursojpaudemy.cursojpaudemy.config;

import com.cursojpaudemy.cursojpaudemy.entities.User;
import com.cursojpaudemy.cursojpaudemy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria", "maria@gmail.com", "8888888", "123456");
        User u2 = new User(null, "Bob", "bob@gmail.com", "7777777", "123456");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}

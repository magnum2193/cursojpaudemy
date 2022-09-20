package com.cursojpaudemy.cursojpaudemy.services;

import com.cursojpaudemy.cursojpaudemy.entities.User;
import com.cursojpaudemy.cursojpaudemy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service    //  Registrando a classe como componete do spring
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {   //  Metodo para buscar todos os usuarios
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }
}

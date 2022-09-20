package com.cursojpaudemy.cursojpaudemy.repositories;

import com.cursojpaudemy.cursojpaudemy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
}

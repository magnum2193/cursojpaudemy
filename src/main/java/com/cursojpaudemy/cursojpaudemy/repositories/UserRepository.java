package com.cursojpaudemy.cursojpaudemy.repositories;

import com.cursojpaudemy.cursojpaudemy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository     //  Opcional pois o JpaRepository ja é um componente do spring
public interface UserRepository extends JpaRepository<User,Long> {
}

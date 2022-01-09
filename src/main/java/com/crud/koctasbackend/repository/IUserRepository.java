package com.crud.koctasbackend.repository;

import com.crud.koctasbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserName(String username);


}

package com.crud.koctasbackend.service;

import com.crud.koctasbackend.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    Optional<User> findByUsername(String userName);

    List<User> findAllUsers();
}

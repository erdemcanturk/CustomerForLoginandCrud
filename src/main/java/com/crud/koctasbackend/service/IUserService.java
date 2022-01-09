package com.crud.koctasbackend.service;

import com.crud.koctasbackend.model.User;


import java.util.List;
import java.util.Optional;


public interface IUserService
{
    User saveUser(User user);



    Optional<User> findByUserName(String username);

    List<User> findAllUsers();
}

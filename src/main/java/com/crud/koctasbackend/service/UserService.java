package com.crud.koctasbackend.service;

import com.crud.koctasbackend.model.User;
import com.crud.koctasbackend.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserRepository userRepository;

@Autowired
    private PasswordEncoder passwordEncoder;


    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
    return userRepository.save(user);
    }

    @Override
    public Optional<User> findByUsername(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

}

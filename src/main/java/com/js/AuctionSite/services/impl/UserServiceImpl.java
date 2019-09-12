package com.js.AuctionSite.services.impl;

import com.js.AuctionSite.model.User;
import com.js.AuctionSite.repositories.UserRepository;
import com.js.AuctionSite.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public boolean isUserExist(String login) {

        return userRepository.existsById(login);
    }

    @Override
    public Optional<User> returnUserById(String login) {
        return userRepository.findById(login);
    }


}

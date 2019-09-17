package com.js.AuctionSite.services.impl;

import com.js.AuctionSite.model.Authority;
import com.js.AuctionSite.model.User;
import com.js.AuctionSite.repositories.AuthorityRepository;
import com.js.AuctionSite.repositories.UserRepository;
import com.js.AuctionSite.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    AuthorityRepository authorityRepository;

    @Override
    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        user.setAuthority(new Authority(user,user.getLogin(),"USER"));
        user.setEnabled(true);
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

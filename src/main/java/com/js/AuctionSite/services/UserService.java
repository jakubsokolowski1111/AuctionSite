package com.js.AuctionSite.services;

import com.js.AuctionSite.model.User;

import java.util.Optional;

public interface UserService {
    void saveUser(User user);
    boolean isUserExist(String login);
    Optional<User> returnUserById (String login);
}

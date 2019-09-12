package com.js.AuctionSite.controllers;

import com.js.AuctionSite.model.User;
import com.js.AuctionSite.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping("loginSite")
    public String login() {
        return "loginSite";
    }

    @PostMapping(value = "/loginSubmit", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String loginSubmit(@RequestBody MultiValueMap<String, String> dataForm) {
        Map<String, String> data = dataForm.toSingleValueMap();

        String login = data.get("login");
        String password = data.get("password");

        if (userService.isUserExist(login)) {
            User user = userService.returnUserById(login).get();
            if (user.getHashedPassword().equals(password)) {

                return "userView";
            }
        }
        return "redirect:/loginError";
    }

    @GetMapping("loginError")
    public String loginError() {
        return "loginError";
    }
}

package com.js.AuctionSite.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {


    @RequestMapping("login")
    public String login() {
        return "login";
    }

    @RequestMapping("loginError")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }


}

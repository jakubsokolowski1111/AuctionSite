package com.js.AuctionSite.controllers;

import com.js.AuctionSite.model.Address;
import com.js.AuctionSite.model.User;
import com.js.AuctionSite.services.AddressService;
import com.js.AuctionSite.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.awt.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

@Controller
public class RegisterController {

    @Autowired
    AddressService addressService;
    @Autowired
    UserService userService;

    @GetMapping("/register")
    public String registerView() {
        return "register";
    }

    @GetMapping("/registerError")
    public String registerError() {
        return "registerError";
    }

    @PostMapping(value = "/registerSubmit", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String registerSubmit(@RequestBody MultiValueMap<String, String> dataForm) {
        Map<String, String> data = dataForm.toSingleValueMap();
        String login = data.get("login");
        String password = data.get("password");
        String name = data.get("name");
        String province = data.get("province");
        String city = data.get("city");
        String street = data.get("street");
        String houseNumber = data.get("houseNumber");
        String postalCode = data.get("postalCode");

        Address address = new Address(street, houseNumber, postalCode);

        Date today = Calendar.getInstance().getTime();
        User user = new User(login, password, name, province, city, address, today);
        if (userService.isUserExist(login)) {
            return "redirect:/registerError";
        }
        addressService.saveAddress(address);
        userService.saveUser(user);
        return "registerSuccess";
    }


}

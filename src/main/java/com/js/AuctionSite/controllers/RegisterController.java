package com.js.AuctionSite.controllers;

import com.js.AuctionSite.forms.RegisterFrom;
import com.js.AuctionSite.model.Address;
import com.js.AuctionSite.model.User;
import com.js.AuctionSite.services.AddressService;
import com.js.AuctionSite.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.Date;

@Controller
public class RegisterController {

    @Autowired
    AddressService addressService;
    @Autowired
    UserService userService;


    @GetMapping("/register")
    public String registerView(Model model, RegisterFrom registerFrom) {
        model.addAttribute(registerFrom);
        return "register";
    }

    @GetMapping("/register-error")
    public String registerError() {
        return "registerError";
    }

    @PostMapping(value = "/register-submit")
    public String registerSubmit(@Valid RegisterFrom registerFrom, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "register";
        }

        String login = registerFrom.getLogin();
        String password = registerFrom.getPassword();
        String name = registerFrom.getName();
        String province = registerFrom.getProvince();
        String city = registerFrom.getCity();
        String street = registerFrom.getStreet();
        String houseNumber = registerFrom.getHouseNumber();
        String postalCode = registerFrom.getPostalCode();

        Address address = new Address(street, houseNumber, postalCode);

        Date today = Calendar.getInstance().getTime();
        User user = new User(login, password, name, province, city, address, today);
        if (userService.isUserExist(login)) {
            return "redirect:/register-error";
        }
        addressService.saveAddress(address);
        userService.saveUser(user);
        return "registerSuccess";
    }


}

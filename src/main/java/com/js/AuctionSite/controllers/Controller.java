package com.js.AuctionSite.controllers;

import com.js.AuctionSite.model.Auction;
import com.js.AuctionSite.services.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    AuctionService auctionService;


    @GetMapping({"/home", "/"})
    public String mainSite(Model model) {

        List<Auction> auctions = auctionService.getAllAuctions();
        model.addAttribute("auctions", auctions);
        return "index";
    }

    @GetMapping("/temp")
    public String loadTemplate() {
        return "redirect:/home";
    }


}

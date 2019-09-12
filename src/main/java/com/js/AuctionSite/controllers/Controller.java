package com.js.AuctionSite.controllers;

import com.js.AuctionSite.factory.AuctionFactory;
import com.js.AuctionSite.model.Auction;
import com.js.AuctionSite.repositories.AuctionRepository;
import com.js.AuctionSite.services.AuctionService;
import com.js.AuctionSite.services.impl.AuctionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    AuctionService auctionService;

    @GetMapping("/")
    public String index(){
        return "index.html";
    }

    @GetMapping({"/home","home"})
    public String  mainSite(Model model){

        List<Auction> auctions = auctionService.getAllAuctions();
        model.addAttribute("auctions",auctions);
        return "mainSite";
    }

    @GetMapping("/temp")
    public String loadTemplate(){
        new AuctionFactory().createSomeAuctions(auctionService);
        return "redirect:/home";
    }


}

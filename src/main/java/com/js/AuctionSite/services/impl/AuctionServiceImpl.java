package com.js.AuctionSite.services.impl;

import com.js.AuctionSite.model.Auction;
import com.js.AuctionSite.repositories.AuctionRepository;
import com.js.AuctionSite.services.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuctionServiceImpl implements AuctionService {

    @Autowired AuctionRepository auctionRepository;

    public AuctionServiceImpl() {
    }

    @Override
    public List<Auction> getAllAuctions() {
        List<Auction> auctions = (List<Auction>) auctionRepository.findAll();
        return auctions;
    }

    @Override
    public void saveAuction(Auction auction) {
        auctionRepository.save(auction);
    }

    @Override
    public void saveAll(List<Auction> list) {
        auctionRepository.saveAll(list);
    }
}

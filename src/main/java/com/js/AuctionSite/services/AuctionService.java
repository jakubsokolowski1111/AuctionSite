package com.js.AuctionSite.services;

import com.js.AuctionSite.model.Auction;

import java.util.List;

public interface AuctionService {
    List<Auction> getAllAuctions();

    void saveAuction(Auction auction);

    void saveAll(List<Auction> list);
}

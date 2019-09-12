package com.js.AuctionSite.repositories;

import com.js.AuctionSite.model.Auction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuctionRepository extends CrudRepository<Auction,String> {

}

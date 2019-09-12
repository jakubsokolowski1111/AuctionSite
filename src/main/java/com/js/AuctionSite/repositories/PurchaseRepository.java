package com.js.AuctionSite.repositories;

import com.js.AuctionSite.model.Purchase;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<Purchase, Long> {
}

package com.js.AuctionSite.repositories;

import com.js.AuctionSite.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,String> {
}

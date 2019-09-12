package com.js.AuctionSite.repositories;

import com.js.AuctionSite.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String> {
}

package com.js.AuctionSite.repositories;

import com.js.AuctionSite.model.Authority;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends CrudRepository<Authority,String> {

}

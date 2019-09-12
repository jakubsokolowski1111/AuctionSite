package com.js.AuctionSite.factory;

import com.js.AuctionSite.model.Address;
import com.js.AuctionSite.model.Auction;
import com.js.AuctionSite.model.Category;
import com.js.AuctionSite.model.User;
import com.js.AuctionSite.services.AuctionService;
import com.js.AuctionSite.services.impl.AuctionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class AuctionFactory {

    public void createSomeAuctions(AuctionService auctionService){
        Address address = new Address("Kujawska", "123","15-548");


       /* Auction auction = new Auction("Pies","sprzedam owczarka niemieckiego",
                new Category("Animals","zwierzeta domowe"),100,500,false,
                "Bialystok","24.08.2019","30.08.2019",
                new User("sokol1","sokol","Sokolmix","Podlaskie","Bialystok",
                        new Address("Kujawska","50","15-554"),"normal"));
        Auction auction2 = new Auction("Pies2","sprzedam owczarka niemieckiego",
                new Category("Animals","zwierzeta domowe"),100,500,false,
                "Bialystok","24.08.2019","30.08.2019",
                new User("sokol2","sokol3","Sokolmix","Podlaskie","Bialystok",
                        new Address("Kujawska","50","15-554"),"normal"));
        Auction auction3 = new Auction("Pies4","sprzedam owczarka niemieckiego",
                new Category("Animals","zwierzeta domowe"),100,500,false,
                "Bialystok","24.08.2019","30.08.2019",
                new User("sokol3","sokol","Sokolmix","Podlaskie","Bialystok",
                        new Address("Kujawska","50","15-554"),"normal"));
        List<Auction> auctions = new ArrayList<>();
        auctions.add(auction);
        auctions.add(auction2);
        auctions.add(auction3);
        auctionService.saveAll(auctions);*/
    }
}

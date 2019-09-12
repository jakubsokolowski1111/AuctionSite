package com.js.AuctionSite.model;

import javax.persistence.*;

@Entity
public class Bidding {
    @Id
    private long id;
    @OneToOne
    @JoinColumn(name = "auction_id")
    private Auction auction;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private double price;

    public Bidding() {
    }

    public Auction getAuction() {
        return auction;
    }

    /*public User getUser() {
        return user;
    }*/

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bidding{" +
                "auction=" + auction +
                ", user=" + user +
                ", price=" + price +
                '}';
    }
}

package com.js.AuctionSite.model;

import javax.persistence.*;

@Entity
public class Purchase {
    @Id
    @GeneratedValue
    private long id;
    @OneToOne
    @JoinColumn(name = "auction_id")
    private Auction auction;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private double price;


    public Purchase() {
    }

    public Auction getAuction() {
        return auction;
    }

    public User getUser() {
        return user;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "auction=" + auction +
                ", user=" + user +
                ", price=" + price +
                '}';
    }
}

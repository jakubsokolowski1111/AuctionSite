package com.js.AuctionSite.model;

import javax.persistence.*;

@Entity
public class AuctionObservation {
    @Id
    @GeneratedValue
    private long id;
    @OneToOne
    @JoinColumn(name = "auction_id")
    private Auction auction;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public AuctionObservation() {
    }

    public Auction getAuction() {
        return auction;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "AuctionObservation{" +
                "auction=" + auction +
                ", user=" + user +
                '}';
    }
}

package com.js.AuctionSite.model;

import javax.persistence.*;

@Entity
public class PurchaseRating {
    @Id
    @GeneratedValue
    private long id;
    @OneToOne
    @JoinColumn(name = "purchase_id")
    private Purchase purchase;
    private int sellerRating;
    private String sellerComment;
    private int buyerRating;
    private String buyerComment;

    public PurchaseRating() {
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public int getSellerRating() {
        return sellerRating;
    }

    public String getSellerComment() {
        return sellerComment;
    }

    public int getBuyerRating() {
        return buyerRating;
    }

    public String getBuyerComment() {
        return buyerComment;
    }

    @Override
    public String toString() {
        return "PurchaseRating{" +
                "purchase=" + purchase +
                ", sellerRating=" + sellerRating +
                ", sellerComment='" + sellerComment + '\'' +
                ", buyerRating=" + buyerRating +
                ", buyerComment='" + buyerComment + '\'' +
                '}';
    }
}

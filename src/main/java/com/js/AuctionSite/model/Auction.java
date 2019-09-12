package com.js.AuctionSite.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Auction {
    @Id
    private String auctionTitle;
    private String description;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    private double minPrice;
    private double buyNowPrice;
    private boolean isPromoted;
    private String city;
    private String startDate;
    private String endDate;
    private int numberOfViews;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne(mappedBy = "auction", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Bidding bidding;
    @OneToOne(mappedBy = "auction")
    private AuctionObservation auctionObservation;


    public Auction() {
    }

    public Auction(String auctionTitle, String description, Category category, double minPrice,
                   double buyNowPrice, boolean isPromoted, String city, String startDate,
                   String endDate, User user) {
        this.auctionTitle = auctionTitle;
        this.description = description;
        this.category = category;
        this.minPrice = minPrice;
        this.buyNowPrice = buyNowPrice;
        this.isPromoted = isPromoted;
        this.city = city;
        this.startDate = startDate;
        this.endDate = endDate;
        this.user = user;
    }

    public String getAuctionTitle() {
        return auctionTitle;
    }

    public void setAuctionTitle(String auctionTitle) {
        this.auctionTitle = auctionTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getBuyNowPrice() {
        return buyNowPrice;
    }

    public void setBuyNowPrice(double buyNowPrice) {
        this.buyNowPrice = buyNowPrice;
    }

    public boolean isPromoted() {
        return isPromoted;
    }

    public void setPromoted(boolean promoted) {
        isPromoted = promoted;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String  startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }
}

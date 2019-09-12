package com.js.AuctionSite.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
    @Id
    private String categoryName;
    private String description;
    @OneToMany(mappedBy = "category")
    private List<Auction> auction = new ArrayList<>();

    public String getCategoryName() {
        return categoryName;
    }

    public String getDescription() {
        return description;
    }

    public Category() {
    }

    public Category(String categoryName, String description) {
        this.categoryName = categoryName;
        this.description = description;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Auction> getAuction() {
        return auction;
    }

    public void setAuction(List<Auction> auction) {
        this.auction = auction;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

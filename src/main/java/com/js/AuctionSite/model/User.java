package com.js.AuctionSite.model;


import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class User {
    @Id
    private String login;
    private String hashedPassword;
    private String accountName;
    private String province;
    private String city;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
    private Date date;
    private String type;

    @OneToMany(mappedBy = "user")
    private List<Auction> auction = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<Bidding> bidding = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<Purchase> purchase = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<AuctionObservation> auctionObservation = new ArrayList<>();

    @Transient
    @Value("${auction.imagestorage}")
    String avatarPath;

    String avatarFileName;


    public User(String login, String hashedPassword, String accountName) {
        this.login = login;
        this.hashedPassword = hashedPassword;
        this.accountName = accountName;
    }

    public User(String login, String password, String accountName, String province,
                String city, Address address, Date date) {
        this.login = login;
        this.hashedPassword = password;/*new SHA256().hashPassword(password);*/
        this.accountName = accountName;
        this.province = province;
        this.city = city;
        this.address = address;
        this.date = date;
    }

    public User() {
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Auction> getAuction() {
        return auction;
    }

    public void setAuction(List<Auction> auction) {
        this.auction = auction;
    }

    public List<Bidding> getBidding() {
        return bidding;
    }

    public void setBidding(List<Bidding> bidding) {
        this.bidding = bidding;
    }

    public List<Purchase> getPurchase() {
        return purchase;
    }

    public void setPurchase(List<Purchase> purchase) {
        this.purchase = purchase;
    }

    public List<AuctionObservation> getAuctionObservation() {
        return auctionObservation;
    }

    public void setAuctionObservation(List<AuctionObservation> auctionObservation) {
        this.auctionObservation = auctionObservation;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLogin() {
        return login;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public Address getAddress() {
        return address;
    }

    public Date getDate() {
        return date;
    }

    public String getAvatarFullPathName() {
        return String.join("/", avatarPath, avatarFileName);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", hashedPassword='" + hashedPassword + '\'' +
                ", accountName='" + accountName + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", address=" + address +
                ", date=" + date +
                ", type='" + type + '\'' +
                '}';
    }
}

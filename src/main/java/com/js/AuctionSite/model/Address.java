package com.js.AuctionSite.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private long id;
    private String street;
    private String hauseNumber;
    private String postalCode;
    @OneToMany(mappedBy = "address")
    private List<User> users = new ArrayList<>();

    public Address(String street, String hauseNumber, String postalCode) {
        this.street = street;
        this.hauseNumber = hauseNumber;
        this.postalCode = postalCode;
    }

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public String getHauseNumber() {
        return hauseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", hauseNumber='" + hauseNumber + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}

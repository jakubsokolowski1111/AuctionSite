package com.js.AuctionSite.forms;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class RegisterFrom {
    @Size(min = 1, message = "Mandatory field.")
    private String login;
    @Size(min = 1, message = "Mandatory field.")
    private String name;
    @Size(min = 6, message = "Password must be at least 6 characters.")
    private String password;
    @Size(min = 1, message = "Mandatory field.")
    private String province;
    @Size(min = 1, message = "Mandatory field.")
    private String city;
    @Size(min = 1, message = "Mandatory field.")
    private String street;
    @Size(min = 1, message = "Mandatory field.")
    @Pattern(regexp = "\\d{1,4}", message = "Enter number.")
    private String houseNumber;
    @Size(min = 1, message = "Mandatory field.")
    @Pattern(regexp = "\\d{2}-\\d{3}", message = "Incorrect postal number(correct form ##-###)")
    private String postalCode;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}

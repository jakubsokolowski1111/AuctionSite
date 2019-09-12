package com.js.AuctionSite.services;


import com.js.AuctionSite.model.Address;

public interface AddressService {
    void saveAddress(Address address);
    boolean isAddressExist(Long id);
}

package com.js.AuctionSite.services.impl;

import com.js.AuctionSite.model.Address;
import com.js.AuctionSite.repositories.AddressRepository;
import com.js.AuctionSite.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressRepository addressRepository;

    @Override
    public void saveAddress(Address address) {
        addressRepository.save(address);
    }

    @Override
    public boolean isAddressExist(Long id) {
        return addressRepository.existsById(id);
    }
}

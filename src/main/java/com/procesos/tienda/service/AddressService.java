package com.procesos.tienda.service;

import com.procesos.tienda.model.Address;
import com.procesos.tienda.model.User;
import com.procesos.tienda.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private UserService userService;

    public Address createAddress(Address address, Long idUser){
        User userBd = userService.getUserById(idUser);
        if(userBd == null){
            throw new RuntimeException("User not found");
        }
        address.setUser(userBd);
        return addressRepository.save(address);
    }

    public Address updateStatusAddress(Long id){
        Optional<Address> addressBd = addressRepository.findById(id);
        if(addressBd.isEmpty()){
            throw new RuntimeException("Address not found");
        }
        addressBd.get().setStatus(Boolean.FALSE);
        return  addressRepository.save(addressBd.get());
    }

    public List<Address> finAllAddress(){
        return  (List<Address>) addressRepository.findAll();
    }

    public Address getAddressById(Long id){
        Optional<Address> addressBd = addressRepository.findById(id);
        if(addressBd.isEmpty())
            throw new RuntimeException("Address not found");
        return addressBd.get();
    }
}

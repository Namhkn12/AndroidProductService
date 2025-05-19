package com.makemyhomevn.webapi.Services;

import com.makemyhomevn.webapi.DTO.ShopDTO;
import com.makemyhomevn.webapi.Model.Shop;
import com.makemyhomevn.webapi.Repository.ShopRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopService {
    @Autowired
    private ShopRepository shopRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<ShopDTO> viewAllShop(){
        List<Shop> shops = shopRepository.findAll();
        List<ShopDTO> shopdtos = shops.stream().map(shop -> modelMapper.map(shop, ShopDTO.class))
                .toList();
        return shopdtos;
    }

    public ShopDTO viewShop(Integer shopId){
        Optional<Shop> shop = shopRepository.findById(shopId);
        if(shop.isEmpty()){
            return null;
        }
        return modelMapper.map(shop.get(), ShopDTO.class);
    }
}

package com.makemyhomevn.webapi.Controllers;

import com.makemyhomevn.webapi.DTO.ShopDTO;
import com.makemyhomevn.webapi.Services.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/shop")
public class ShopController {
    @Autowired
    private ShopService shopService;

    @GetMapping("/list")
    public List<ShopDTO> getAllShops(){
        return shopService.viewAllShop();
    }

    @GetMapping("/{id}")
    public ShopDTO getShop(@PathVariable("id") Integer id){
        return shopService.viewShop(id);
    }

}

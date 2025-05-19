package com.makemyhomevn.webapi.Controllers;

import com.makemyhomevn.webapi.DTO.SellingDTO;
import com.makemyhomevn.webapi.DTO.SellingListDTO;
import com.makemyhomevn.webapi.Services.SellingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/selling")
public class SellingController {
    @Autowired
    private SellingService sellingService;

    @GetMapping("/shop/{id}")
    public SellingListDTO viewShopSelling(@PathVariable("id") Integer id){
        return sellingService.getSellingByShopId(id);
    }

    @GetMapping("/product/{id}")
    public List<SellingDTO> getSellingByProduct(@PathVariable("id") Integer id) {
        return sellingService.getSellingByProduct(id);
    }
}

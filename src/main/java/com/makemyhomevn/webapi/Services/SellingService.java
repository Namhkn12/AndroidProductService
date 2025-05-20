package com.makemyhomevn.webapi.Services;

import com.makemyhomevn.webapi.DTO.ProductDTO;
import com.makemyhomevn.webapi.DTO.SellingDTO;
import com.makemyhomevn.webapi.DTO.SellingListDTO;
import com.makemyhomevn.webapi.DTO.ShopDTO;
import com.makemyhomevn.webapi.Model.Selling;
import com.makemyhomevn.webapi.Repository.SellingRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellingService {
    @Autowired
    public SellingRepository sellingRepository;
    @Autowired
    public ModelMapper modelMapper;

//    public SellingListDTO getSellingByShopId(Integer shopId) {
//        List<Selling> sellingList = sellingRepository.findByShopShopId(shopId);
//
//        if (sellingList.isEmpty()) {
//            return null;
//        }
//
//        ShopDTO shopDTO = modelMapper.map(sellingList.get(0).getShop(), ShopDTO.class);
//
//        List<SellingListDTO.ProductSell> productSells = sellingList.stream()
//                .map(selling -> {
//                    ProductDTO productDTO = modelMapper.map(selling.getProduct(), ProductDTO.class);
//                    return new SellingListDTO.ProductSell(productDTO, selling.getAmount());
//                })
//                .collect(Collectors.toList());
//
//        return new SellingListDTO(shopDTO, productSells);
//    }

    public List<SellingDTO> getSellingByProduct(Integer id) {
        List<Selling> sellingList = sellingRepository.findAll();
        List<SellingDTO> res = new ArrayList<>();
        for (Selling selling : sellingList) {
            if (selling.getProduct().getProductId().equals(id)) {
                SellingDTO sellingDTO = modelMapper.map(selling, SellingDTO.class);
                res.add(sellingDTO);
            }
        }
        return res;
    }
}

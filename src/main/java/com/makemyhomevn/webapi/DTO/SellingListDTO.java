package com.makemyhomevn.webapi.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SellingListDTO {
    private ShopDTO shop;
    private List<ProductSell> sells;

    @Getter
    @Setter
    @AllArgsConstructor
    public static class ProductSell {
        private ProductDTO product;
        private Integer amount;
    }
}



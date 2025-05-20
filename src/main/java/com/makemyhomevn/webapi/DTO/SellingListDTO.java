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

        public ProductDTO getProduct() {
            return product;
        }

        public Integer getAmount() {
            return amount;
        }
    }

    public ShopDTO getShop() {
        return shop;
    }

    public List<ProductSell> getSells() {
        return sells;
    }

    public void setShop(ShopDTO shop) {
        this.shop = shop;
    }

    public void setSells(List<ProductSell> sells) {
        this.sells = sells;
    }
}



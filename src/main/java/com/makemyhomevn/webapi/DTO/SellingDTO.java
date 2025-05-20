package com.makemyhomevn.webapi.DTO;

import com.makemyhomevn.webapi.Model.Product;
import com.makemyhomevn.webapi.Model.Shop;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SellingDTO {
    private ShopDTO shop;

    private ProductDTO product;

    private int amount;

    public ShopDTO getShop() {
        return shop;
    }

    public ProductDTO getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public void setShop(ShopDTO shop) {
        this.shop = shop;
    }

    public void setProduct(ProductDTO product) {
        this.product = product;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

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
    private Shop shop;

    private Product product;

    private int amount;
}

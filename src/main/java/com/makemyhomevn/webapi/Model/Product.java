package com.makemyhomevn.webapi.Model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    private String productName;
    @OneToOne(mappedBy = "categoryId")
    private Category productCategory;
    private String productDescription;
    private Long productCost;
    private String imagePath;

    @OneToMany(mappedBy = "product")
    private List<Selling> sellings;
}

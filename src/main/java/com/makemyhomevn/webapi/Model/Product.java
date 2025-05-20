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
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category productCategory;
    private String productDescription;
    private Long productCost;
    private String imagePath;

    @OneToMany(mappedBy = "product")
    private List<Selling> sellings;

    public Integer getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public Category getProductCategory() {
        return productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public Long getProductCost() {
        return productCost;
    }

    public String getImagePath() {
        return imagePath;
    }

    public List<Selling> getSellings() {
        return sellings;
    }
}

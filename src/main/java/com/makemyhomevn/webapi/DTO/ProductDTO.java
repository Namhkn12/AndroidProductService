package com.makemyhomevn.webapi.DTO;

import com.makemyhomevn.webapi.Model.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Integer productId;
    private String productName;
    private CategoryDTO productCategory;
    private String productDescription;
    private Long productCost;

    public Integer getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public CategoryDTO getProductCategory() {
        return productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public Long getProductCost() {
        return productCost;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCategory(CategoryDTO productCategory) {
        this.productCategory = productCategory;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductCost(Long productCost) {
        this.productCost = productCost;
    }
}

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
    private Category productCategory;
    private String productDescription;
    private Long productCost;
}

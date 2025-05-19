package com.makemyhomevn.webapi.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShopDTO {
    private Integer shopId;
    private String shopName;
    private String shopLocation;
    private String shopPhoneNumber;
}

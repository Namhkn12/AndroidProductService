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

    public Integer getShopId() {
        return shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopLocation() {
        return shopLocation;
    }

    public String getShopPhoneNumber() {
        return shopPhoneNumber;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setShopLocation(String shopLocation) {
        this.shopLocation = shopLocation;
    }

    public void setShopPhoneNumber(String shopPhoneNumber) {
        this.shopPhoneNumber = shopPhoneNumber;
    }
}

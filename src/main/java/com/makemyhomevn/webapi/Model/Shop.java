package com.makemyhomevn.webapi.Model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer shopId;

    private String shopPhoneNumber;
    private String shopLocation;
    private String shopName;

    @OneToMany(mappedBy = "shop")
    private List<Selling> sellings;
}


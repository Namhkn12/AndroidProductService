package com.makemyhomevn.webapi.Repository;

import com.makemyhomevn.webapi.Model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShopRepository extends JpaRepository<Shop, Integer> {
    @Override
    List<Shop> findAllById(Iterable<Integer> integers);
}

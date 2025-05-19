package com.makemyhomevn.webapi.Repository;

import com.makemyhomevn.webapi.Model.Selling;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SellingRepository extends JpaRepository<Selling, Integer> {
    List<Selling> findByShopShopId(Integer shopId);
}

package com.makemyhomevn.webapi.Repository;

import com.makemyhomevn.webapi.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Override
    List<Product> findAll();

    @Override
    Optional<Product> findById(Integer integer);

    List<Product> findByProductNameContainingIgnoreCase(String keyword);
}

package com.makemyhomevn.webapi.Repository;

import com.makemyhomevn.webapi.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}

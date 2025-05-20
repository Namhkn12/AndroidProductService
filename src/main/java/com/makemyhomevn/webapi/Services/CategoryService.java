package com.makemyhomevn.webapi.Services;

import com.makemyhomevn.webapi.DTO.CategoryDTO;
import com.makemyhomevn.webapi.Model.Category;
import com.makemyhomevn.webapi.Repository.CategoryRepository;
import com.makemyhomevn.webapi.Repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<CategoryDTO> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream().map(category -> modelMapper.map(category, CategoryDTO.class)).toList();
    }
}

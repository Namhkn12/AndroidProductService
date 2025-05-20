package com.makemyhomevn.webapi.Services;

import com.makemyhomevn.webapi.DTO.ProductDTO;
import com.makemyhomevn.webapi.Model.Product;
import com.makemyhomevn.webapi.Repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<ProductDTO> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(product -> modelMapper.map(product, ProductDTO.class))
                .toList();
    }

    public ProductDTO getProductById(Integer id) {
        Product product = productRepository.findById(id).orElse(null);
        if (product == null) {
            return null;
        }
        // Map entity sang DTO
        ProductDTO productDTO = modelMapper.map(product, ProductDTO.class);
        return productDTO;
    }

    public String getProductImagePath(int id) {
        Product product = productRepository.findById(id).orElse(null);
        if (product == null) {
            return null;
        }
        return product.getImagePath();
    }

    Random random = new Random();
    public List<ProductDTO> getRandomProduct() {
        List<Product> products = productRepository.findAll();
        List<Integer> repeatId = new ArrayList<>();
        List<ProductDTO> productDTOS = new ArrayList<>();
        while (repeatId.size() < 4 && products.size() > 4) {
            int f = random.nextInt(0, products.size());
            if (!repeatId.contains(f)) {
                repeatId.add(f);
                Product product = products.get(f);
                ProductDTO productDTO = modelMapper.map(product, ProductDTO.class);
                productDTOS.add(productDTO);
            }
        }
        return productDTOS;
    }

    public List<ProductDTO> getProductByCategory(int id) {
        List<Product> products = productRepository.findAll();
        List<ProductDTO> productDTOS = new ArrayList<>();
        for (Product product : products) {
            if (product.getProductCategory().getCategoryId() == id) {
                ProductDTO productDTO = modelMapper.map(product, ProductDTO.class);
                productDTOS.add(productDTO);
            }
        }
        return productDTOS;
    }

    public List<ProductDTO> searchProduct(String query, List<Integer> category) {
        List<Product> products = productRepository.findByProductNameContainingIgnoreCase(query);
        return products.stream()
                .filter(p -> query == null || p.getProductName().toLowerCase().contains(query.toLowerCase()))
                .filter(p -> category == null || category.isEmpty()
                        || category.contains(p.getProductCategory().getCategoryId()))
                .map(p -> modelMapper.map(p, ProductDTO.class))
                .collect(Collectors.toList());
    }

}

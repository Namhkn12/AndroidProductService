package com.makemyhomevn.webapi.Controllers;

import com.makemyhomevn.webapi.DTO.ProductDTO;
import com.makemyhomevn.webapi.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Value("${file.image-dir}")
    private String uploadDir;

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public List<ProductDTO> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ProductDTO getProductById(@PathVariable Integer id){
        return productService.getProductById(id);
    }

    @GetMapping("/image/{id}")
    public ResponseEntity<?> getProductImage(@PathVariable("id") int id) {
        try {
            String imgPathStr = productService.getProductImagePath(id);
            Path imgPath = Path.of(uploadDir + "\\" + imgPathStr);
            String contentType = Files.probeContentType(imgPath);
            byte[] imgBytes = Files.readAllBytes(imgPath);
            if (contentType != null) {
                return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType)).body(imgBytes);
            }
            return ResponseEntity.ok().contentType(MediaType.APPLICATION_OCTET_STREAM).body(imgBytes);

        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Error getting product image: " + e.getMessage());
        }
    }

    @GetMapping("/popular")
    public List<ProductDTO> getRandomProduct() {
        return productService.getRandomProduct();
    }

    @GetMapping("/category/{id}")
    public List<ProductDTO> getProductByCategory(@PathVariable("id") int id) {
        return productService.getProductByCategory(id);
    }

    @GetMapping("/search")
    public List<ProductDTO> searchProduct(@RequestParam("query") String query, @RequestParam(value = "category", required = false) List<Integer> categories) {
        return productService.searchProduct(query, categories);
    }

}

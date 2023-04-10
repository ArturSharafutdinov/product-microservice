package ru.tkoinform.products.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.tkoinform.products.persistence.dto.ProductDto;
import ru.tkoinform.products.service.product.ProductService;

import java.util.List;

@RestController
public class ProductsController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<ProductDto> fetchProducts() {
        return productService.fetchProducts();
    }

    @GetMapping("/product")
    public ProductDto fetchProducts(@RequestParam(required = true) Long productId) {
        return productService.fetchProductById(productId);
    }

}

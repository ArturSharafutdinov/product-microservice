package ru.tkoinform.products.service.product;

import ru.tkoinform.products.persistence.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> fetchProducts();
    ProductDto fetchProductById(Long id);
}

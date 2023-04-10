package ru.tkoinform.products.mapper.product;

import ru.tkoinform.products.persistence.domain.Product;
import ru.tkoinform.products.persistence.dto.ProductDto;

public class ProductMapper {

    public ProductDto mapToDto(Product product) {
        ProductDto dto = new ProductDto();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setDescription(product.getDescription());
        dto.setPrice(product.getPrice());
        dto.setRating(product.getRating());

        return dto;
    }

}

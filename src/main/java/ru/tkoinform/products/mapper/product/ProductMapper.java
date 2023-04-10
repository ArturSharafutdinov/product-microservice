package ru.tkoinform.products.mapper.product;

import org.springframework.stereotype.Component;
import ru.tkoinform.products.mapper.Mapper;
import ru.tkoinform.products.persistence.domain.Product;
import ru.tkoinform.products.persistence.dto.ProductDto;

@Component
public class ProductMapper implements Mapper<Product, ProductDto> {

    public ProductDto mapToDto(Product product) {
        ProductDto dto = new ProductDto();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setDescription(product.getDescription());
        dto.setPrice(product.getPrice());
        dto.setRating(product.getRating());

        return dto;
    }

    @Override
    public Product mapToEntity(ProductDto dto) {
        return null;
    }
}

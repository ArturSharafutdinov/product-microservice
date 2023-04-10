package ru.tkoinform.products.service.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tkoinform.products.mapper.product.ProductMapper;
import ru.tkoinform.products.persistence.domain.Product;
import ru.tkoinform.products.persistence.dto.ProductDto;
import ru.tkoinform.products.repository.product.ProductRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    private ProductMapper productMapper = new ProductMapper();

    @Override
    public List<ProductDto> fetchProducts() {
        return productRepository.findAll().stream().map(product -> productMapper.mapToDto(product)).collect(Collectors.toList());
    }

    @Override
    public ProductDto fetchProductById(Long id) {
        Product product = productRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        return productMapper.mapToDto(product);
    }
}

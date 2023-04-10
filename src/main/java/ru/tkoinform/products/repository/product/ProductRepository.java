package ru.tkoinform.products.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tkoinform.products.persistence.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

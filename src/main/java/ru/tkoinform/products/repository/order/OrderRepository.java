package ru.tkoinform.products.repository.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tkoinform.products.persistence.domain.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}

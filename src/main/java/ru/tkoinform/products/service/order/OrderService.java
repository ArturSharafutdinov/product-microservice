package ru.tkoinform.products.service.order;

import ru.tkoinform.products.persistence.dto.OrderDto;

public interface OrderService {

    Long order(OrderDto orderDto);

    OrderDto fetchById(Long id);

}

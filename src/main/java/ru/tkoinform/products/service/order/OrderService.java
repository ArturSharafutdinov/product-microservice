package ru.tkoinform.products.service.order;

import ru.tkoinform.products.persistence.dto.OrderDto;

import java.util.List;

public interface OrderService {

    Long order(OrderDto orderDto);

    OrderDto fetchById(Long id);

    List<OrderDto> fetchAll();

}

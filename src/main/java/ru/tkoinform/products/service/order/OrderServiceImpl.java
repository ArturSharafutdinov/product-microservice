package ru.tkoinform.products.service.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tkoinform.products.mapper.order.OrderMapper;
import ru.tkoinform.products.persistence.domain.Order;
import ru.tkoinform.products.persistence.dto.OrderDto;
import ru.tkoinform.products.repository.order.OrderRepository;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Long order(OrderDto orderDto) {

        Order order = orderMapper.mapToEntity(orderDto);
        order.setOrderDate(new Date());
        order = orderRepository.saveAndFlush(order);

        return order.getId();
    }

    @Override
    public OrderDto fetchById(Long id) {
        Order order = orderRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        return orderMapper.mapToDto(order);
    }

    @Override
    public List<OrderDto> fetchAll() {
        List<Order> orders = orderRepository.findAll();
        return orders.stream().map(order -> orderMapper.mapToDto(order)).collect(Collectors.toList());
    }
}

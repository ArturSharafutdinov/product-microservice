package ru.tkoinform.products.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.tkoinform.products.persistence.dto.OrderDto;
import ru.tkoinform.products.service.order.OrderService;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/order")
    public Long order(@RequestBody OrderDto orderDto) {
        return orderService.order(orderDto);
    }

    @GetMapping("/order")
    public OrderDto fetchOrderById(@RequestParam Long orderId) {
        return orderService.fetchById(orderId);
    }

}

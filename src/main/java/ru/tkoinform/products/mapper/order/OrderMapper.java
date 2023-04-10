package ru.tkoinform.products.mapper.order;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.tkoinform.products.mapper.Mapper;
import ru.tkoinform.products.mapper.product.ProductMapper;
import ru.tkoinform.products.persistence.domain.Order;
import ru.tkoinform.products.persistence.domain.Product;
import ru.tkoinform.products.persistence.dto.OrderDto;
import ru.tkoinform.products.persistence.dto.ProductDto;
import ru.tkoinform.products.repository.product.ProductRepository;

@Component
public class OrderMapper implements Mapper<Order, OrderDto> {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Order mapToEntity(OrderDto dto) {
        Order order = new Order();
        order.setOrderDate(dto.getOrderDate());

        for (ProductDto productDto : dto.getProducts()) {
            Product product = productRepository.findById(productDto.getId()).orElseThrow(IllegalArgumentException::new);
            order.getProducts().add(product);
        }

        return order;
    }

    @Override
    public OrderDto mapToDto(Order order) {

        OrderDto orderDto = new OrderDto();
        orderDto.setId(order.getId());
        orderDto.setOrderDate(order.getOrderDate());

        for (Product product : order.getProducts()) {
            orderDto.getProducts().add(productMapper.mapToDto(product));
        }

        return orderDto;
    }
}

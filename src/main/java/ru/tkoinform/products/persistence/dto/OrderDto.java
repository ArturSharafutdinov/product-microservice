package ru.tkoinform.products.persistence.dto;

import ru.tkoinform.products.persistence.common.LongIdDto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDto extends LongIdDto {

    private Date orderDate;
    private List<ProductDto> products = new ArrayList<>();

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }
}

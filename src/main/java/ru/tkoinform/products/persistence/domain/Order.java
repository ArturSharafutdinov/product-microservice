package ru.tkoinform.products.persistence.domain;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import ru.tkoinform.products.persistence.common.LongIdEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ORDERS")
@AttributeOverride(name = "id", column = @Column(name = "ORDER_ID"))
public class Order extends LongIdEntity {

    @Column(name = "ORDER_DATE")
    private Date orderDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "ORDER_PRODUCTS",
            joinColumns = {@JoinColumn(name = "ORDER_ID")},
            inverseJoinColumns = {@JoinColumn(name = "PRODUCT_ID")}
    )
    List<Product> products = new ArrayList<>();

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

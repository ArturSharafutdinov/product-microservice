package ru.tkoinform.products.persistence.domain;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import ru.tkoinform.products.persistence.common.LongIdEntity;

@Entity
@Table(name = "PRODUCT")
@AttributeOverride(name = "id", column = @Column(name = "PRODUCT_ID"))
public class Product extends LongIdEntity {

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "RATING")
    private Integer rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}

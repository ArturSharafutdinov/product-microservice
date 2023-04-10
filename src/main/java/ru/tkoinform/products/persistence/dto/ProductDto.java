package ru.tkoinform.products.persistence.dto;

import ru.tkoinform.products.persistence.common.LongIdDto;

public class ProductDto extends LongIdDto {
    private String name;
    private String description;
    private Double price;
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

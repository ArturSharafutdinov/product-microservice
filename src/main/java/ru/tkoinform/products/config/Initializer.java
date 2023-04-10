package ru.tkoinform.products.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import ru.tkoinform.products.persistence.domain.Product;
import ru.tkoinform.products.repository.product.ProductRepository;

@Component
public class Initializer implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        long count = productRepository.count();
        if (count > 0) {
            return;
        }

        for (long i =0;i<10;i++){
            Product product = new Product();
            product.setName("Product "+ i);
            product.setDescription("Description "+ i);
            product.setPrice(Math.floor(Math.random() * 10000 + 1000));
            product.setRating((int)(Math.floor(Math.random() * 4)) + 1);
            productRepository.save(product);
        }
    }
}

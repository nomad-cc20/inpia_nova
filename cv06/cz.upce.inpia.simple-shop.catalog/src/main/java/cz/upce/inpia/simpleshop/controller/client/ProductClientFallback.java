package cz.upce.inpia.simpleshop.controller.client;

import org.springframework.stereotype.Component;

@Component
public class ProductClientFallback implements ProductClient {

    @Override
    public Integer findById(Integer productId) {
        return 0;
    }
}

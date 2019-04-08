package cz.upce.inpia.simpleshop.controller.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "inventory", fallback = ProductClientFallback.class)
public interface ProductClient {

    @RequestMapping(method = RequestMethod.GET, value = "api/inventory/{productId}")
    Integer findById(@PathVariable("productId") Integer productId);
}
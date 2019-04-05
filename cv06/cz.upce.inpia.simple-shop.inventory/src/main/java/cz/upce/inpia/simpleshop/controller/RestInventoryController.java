package cz.upce.inpia.simpleshop.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/inventory")
@CrossOrigin
public class RestInventoryController {

    @Value("${server.port}")
    private Integer serverPort;

    @Value("${name}")
    String name;

    @GetMapping("{productId}")
    public Integer getProductById(@PathVariable Integer productId) {
//        InventoryDto inventory = new InventoryDto();
//        inventory.setId(productId);
//        inventory.setQuantity(serverPort);
//
//        return inventory;

        return productId;
    }

    @GetMapping("/hello")
    public String wave() {
        return "Hello " + name;
    }
}

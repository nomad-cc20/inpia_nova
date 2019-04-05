package cz.upce.inpia.simpleshop.controller;

import cz.upce.inpia.simpleshop.dto.InventoryDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/inventory")
@EnableAutoConfiguration
@CrossOrigin
public class RestInventoryController {

    @Value("${server.port}")
    private Integer serverPort;

    @Value("nomad")
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

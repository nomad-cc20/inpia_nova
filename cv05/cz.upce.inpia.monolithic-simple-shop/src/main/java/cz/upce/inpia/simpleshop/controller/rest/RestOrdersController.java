package cz.upce.inpia.simpleshop.controller.rest;

import cz.upce.inpia.simpleshop.entity.OrderForm;
import cz.upce.inpia.simpleshop.service.OrderFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/orders")
@CrossOrigin
public class RestOrdersController {

    private final OrderFormService orderFormService;

    @Autowired
    public RestOrdersController(OrderFormService orderFormService) {
        this.orderFormService = orderFormService;
    }

    @GetMapping
    public List<OrderForm> getAllOrders() {
        return orderFormService.findAll();
    }

}
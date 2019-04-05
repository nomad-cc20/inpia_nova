package cz.upce.inpia.simpleshop.controller;

import cz.upce.inpia.simpleshop.service.OrderFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderFormController {

    private final OrderFormService orderFormService;

    @Autowired
    public OrderFormController(OrderFormService orderFormService) {
        this.orderFormService = orderFormService;
    }

    @GetMapping("/orderlist")
    public String showAllProducts(Model model) {
        model.addAttribute("orders", orderFormService.findAll());
        return "order-list";
    }
}

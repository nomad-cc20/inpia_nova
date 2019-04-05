package cz.upce.inpia.simpleshop.service;

import cz.upce.inpia.simpleshop.entity.OrderForm;

import java.util.List;

public interface OrderFormService {
    List<OrderForm> findAll();
}

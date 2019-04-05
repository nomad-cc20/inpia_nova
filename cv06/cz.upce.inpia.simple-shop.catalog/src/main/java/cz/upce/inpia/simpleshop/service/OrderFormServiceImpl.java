package cz.upce.inpia.simpleshop.service;

import cz.upce.inpia.simpleshop.dao.OrderFormDao;
import cz.upce.inpia.simpleshop.entity.OrderForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderFormServiceImpl implements OrderFormService {

    private final OrderFormDao orderFormDao;

    @Autowired
    public OrderFormServiceImpl(OrderFormDao orderFormDao) {
        this.orderFormDao = orderFormDao;
    }

    @Override
    public List<OrderForm> findAll() {
        return orderFormDao.findAll();
    }
}

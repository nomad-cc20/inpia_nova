package cz.upce.inpia.simpleshop.dao;

import cz.upce.inpia.simpleshop.entity.OrderForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderFormDao extends JpaRepository<OrderForm, Integer> {
}

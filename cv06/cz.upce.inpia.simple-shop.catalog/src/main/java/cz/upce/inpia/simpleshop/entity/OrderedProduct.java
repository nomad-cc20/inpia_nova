package cz.upce.inpia.simpleshop.entity;

import cz.upce.inpia.simpleshop.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class OrderedProduct extends BaseEntity {

    @ManyToOne
    private OrderForm order;

    @ManyToOne
    private Product product;

    @Column
    private Integer amount;

    public void setOrder(OrderForm order) {
        this.order = order;
    }

    public OrderForm getOrder() {
        return order;
    }

    public void setProduct(Product key) {

    }

    public void setAmount(Integer value) {

    }
}

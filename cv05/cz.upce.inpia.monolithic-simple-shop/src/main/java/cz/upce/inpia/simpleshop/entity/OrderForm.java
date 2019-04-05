package cz.upce.inpia.simpleshop.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import cz.upce.inpia.simpleshop.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class OrderForm extends BaseEntity {

    @OneToMany(mappedBy = "id")
    @JsonIgnore
    private Set<OrderedProduct> orderedProducts;

    @Enumerated(EnumType.STRING)
    private OrderState orderState;

    public void setOrderState(OrderState aNew) {
    }


}

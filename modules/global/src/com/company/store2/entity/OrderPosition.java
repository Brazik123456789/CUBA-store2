package com.company.store2.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "STORE2_ORDER_POSITION")
@Entity(name = "store2_OrderPosition")
public class OrderPosition extends StandardEntity {
    private static final long serialVersionUID = 1860367446180797621L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @NotNull
    @Column(name = "COUNT_", nullable = false)
    private Long count;

    @JoinTable(name = "STORE2_ORDER_POSITION_ORDER_LINK",
            joinColumns = @JoinColumn(name = "ORDER_POSITION_ID"),
            inverseJoinColumns = @JoinColumn(name = "ORDER_ID"))
    @ManyToMany
    private List<Order> order;

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
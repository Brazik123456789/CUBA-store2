package com.company.store2.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "STORE2_ORDER")
@Entity(name = "store2_Order")
public class Order extends StandardEntity {

    private static final long serialVersionUID = -1257707021799021114L;

    @NotNull
    @Column(name = "ORDER_NUMBER", nullable = false, unique = true)
    private Long orderNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    @JoinTable(name = "STORE2_ORDER_POSITION_ORDER_LINK",
            joinColumns = @JoinColumn(name = "ORDER_ID"),
            inverseJoinColumns = @JoinColumn(name = "ORDER_POSITION_ID"))
    @ManyToMany
    private List<OrderPosition> orderPositions;

    @Transient
    @MetaProperty(mandatory = true)
    @NotNull
    public Long getSum() {
        Long sum = 0L;
        for (OrderPosition o: orderPositions){
            sum += o.getProduct().getPrice() * o.getCount();
        }
        return sum;
    }

    public List<OrderPosition> getOrderPositions() {
        return orderPositions;
    }

    public void setOrderPositions(List<OrderPosition> orderPositions) {
        this.orderPositions = orderPositions;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }
}
package com.company.store2.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.store2.entity.Order;

@UiController("store2_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
}
package com.company.store2.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.store2.entity.Order;

@UiController("store2_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}
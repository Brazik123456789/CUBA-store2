package com.company.store2.web.screens.orderposition;

import com.haulmont.cuba.gui.screen.*;
import com.company.store2.entity.OrderPosition;

@UiController("store2_OrderPosition.edit")
@UiDescriptor("order-position-edit.xml")
@EditedEntityContainer("orderPositionDc")
@LoadDataBeforeShow
public class OrderPositionEdit extends StandardEditor<OrderPosition> {
}
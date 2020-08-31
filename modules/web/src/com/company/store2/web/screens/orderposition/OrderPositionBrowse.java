package com.company.store2.web.screens.orderposition;

import com.haulmont.cuba.gui.screen.*;
import com.company.store2.entity.OrderPosition;

@UiController("store2_OrderPosition.browse")
@UiDescriptor("order-position-browse.xml")
@LookupComponent("orderPositionsTable")
@LoadDataBeforeShow
public class OrderPositionBrowse extends StandardLookup<OrderPosition> {
}
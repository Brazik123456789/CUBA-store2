package com.company.store2.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.store2.entity.Product;

@UiController("store2_Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
@LoadDataBeforeShow
public class ProductEdit extends StandardEditor<Product> {
}
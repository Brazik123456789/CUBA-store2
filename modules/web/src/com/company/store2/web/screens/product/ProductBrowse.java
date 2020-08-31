package com.company.store2.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.store2.entity.Product;

@UiController("store2_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
public class ProductBrowse extends StandardLookup<Product> {
}
package com.company.store2.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.store2.entity.Client;

@UiController("store2_Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
@LoadDataBeforeShow
public class ClientEdit extends StandardEditor<Client> {
}
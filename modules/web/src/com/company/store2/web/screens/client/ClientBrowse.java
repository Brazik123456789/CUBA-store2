package com.company.store2.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.store2.entity.Client;

@UiController("store2_Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
@LoadDataBeforeShow
public class ClientBrowse extends StandardLookup<Client> {
}
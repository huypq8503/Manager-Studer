package com.company.managerstuder.view.studer;

import com.company.managerstuder.entity.Studer;
import com.company.managerstuder.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "studers", layout = MainView.class)
@ViewController(id = "Studer.list")
@ViewDescriptor(path = "studer-list-view.xml")
@LookupComponent("studersDataGrid")
@DialogMode(width = "64em")
public class StuderListView extends StandardListView<Studer> {

}
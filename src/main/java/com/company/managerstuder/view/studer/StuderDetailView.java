package com.company.managerstuder.view.studer;

import com.company.managerstuder.entity.Studer;
import com.company.managerstuder.view.main.MainView;
import com.vaadin.flow.component.HasValue;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.view.*;

import java.time.LocalDate;

@Route(value = "studers/:id", layout = MainView.class)
@ViewController(id = "Studer.detail")
@ViewDescriptor(path = "studer-detail-view.xml")
@EditedEntityContainer("studerDc")
public class StuderDetailView extends StandardDetailView<Studer> {
//    @ViewComponent
//    private TypedTextField<Integer> ageField;
//
//    @Subscribe("dobField")
//    public void onDateBirthFieldValueChange(HasValue.ValueChangeEvent<LocalDate> event) {
//        ageField.setValue(String.valueOf(getEditedEntity().getAge()));
//    }
}
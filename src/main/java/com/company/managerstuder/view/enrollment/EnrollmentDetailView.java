package com.company.managerstuder.view.enrollment;

import com.company.managerstuder.entity.Enrollment;
import com.company.managerstuder.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "enrollments/:id", layout = MainView.class)
@ViewController(id = "Enrollment.detail")
@ViewDescriptor(path = "enrollment-detail-view.xml")
@EditedEntityContainer("enrollmentDc")
public class EnrollmentDetailView extends StandardDetailView<Enrollment> {
}
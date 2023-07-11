package com.company.onboarding.view.component.dropdownbutton;


import com.company.onboarding.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.dropdownbutton.DropdownButtonItem;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "DropdownButtonView", layout = MainView.class)
@ViewController("DropdownButtonView")
@ViewDescriptor("dropdown-button-view.xml")
public class DropdownButtonView extends StandardView {
    @Autowired
    private Notifications notifications;

    // tag::callAction[]
    @Subscribe("callAction")
    public void onCallAction(final ActionPerformedEvent event) {
        notifications.create("Phone number: +6(876)5463")
                .show();
    }
    // end::callAction[]
    // tag::emailIt[]
    @Subscribe("callBtn.emailIt")
    public void onEmailItClick(final DropdownButtonItem.ClickEvent event) {
        notifications.create("Email: test@river.net")
                .show();
    }
    // end::emailIt[]
}
package com.company.onboardingmaps.view.step;

import com.company.onboardingmaps.entity.Step;

import com.company.onboardingmaps.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "steps", layout = MainView.class)
@ViewController("Step.list")
@ViewDescriptor("step-list-view.xml")
@LookupComponent("stepsDataGrid")
@DialogMode(width = "50em", height = "37.5em")
public class StepListView extends StandardListView<Step> {
}
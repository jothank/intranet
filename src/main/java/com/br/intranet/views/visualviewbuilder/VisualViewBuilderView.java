package com.br.intranet.views.visualviewbuilder;

import com.br.intranet.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.RolesAllowed;

@PageTitle("Visual View Builder")
@Route(value = "visual-view-builder", layout = MainLayout.class)
@RolesAllowed("ADMIN")
@Uses(Icon.class)
public class VisualViewBuilderView extends Composite<VerticalLayout> {

    public VisualViewBuilderView() {
        H1 h1 = new H1();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        getContent().setHeightFull();
        getContent().setWidthFull();
        h1.setText("Heading");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, h1);
        textField.setLabel("Text field");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, textField);
        textField2.setLabel("Text field");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, textField2);
        layoutRow.setWidthFull();
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setAlignItems(Alignment.START);
        layoutRow.setJustifyContentMode(JustifyContentMode.CENTER);
        buttonPrimary.setText("Salvar");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary);
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Cancelar");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, buttonSecondary);
        getContent().add(h1);
        getContent().add(textField);
        getContent().add(textField2);
        getContent().add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(buttonSecondary);
    }
}

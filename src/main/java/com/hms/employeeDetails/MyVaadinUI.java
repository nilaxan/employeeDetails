package com.hms.employeeDetails;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickEvent;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class MyVaadinUI extends UI
{
    private VerticalLayout layout = new VerticalLayout();
    private FormLayout form = new FormLayout();

      @Override
    protected void init(VaadinRequest request) {

        initLayout();

   }
    private void initLayout() {

        layout.setMargin(true);
        setContent(layout);

        form.setCaption("Employee Registration ");
        layout.addComponent(form);
	    layout.setSizeFull();


        Label eName = new Label("Employee Name : ");
        form.addComponent(eName);

        TextField eNameField = new TextField();
        form.addComponent(eNameField);

        Label eAddress = new Label("Employee Address : ");
        form.addComponent(eAddress);

        TextField eAddressField = new TextField();
        form.addComponent(eAddressField);

        Label eAge = new Label("Age : ");
        form.addComponent(eAge);

        TextField eAgeField = new TextField();
        form.addComponent(eAgeField);

        Label eNic = new Label("NIC No : ");
        form.addComponent(eNic);

        TextField eNicField = new TextField();
        form.addComponent(eNicField);

        Label eEmail = new Label("E-mail : ");
        form.addComponent(eEmail);

        TextField eEmailField = new TextField();
        form.addComponent(eEmailField);

        Label eMobile = new Label("Mobile No : ");
        form.addComponent(eMobile);

        TextField eMobileField = new TextField();
        form.addComponent(eMobileField);

        Button button = new Button("Register Now");
        button.addClickListener(new Button.ClickListener() {
            public void buttonClick(ClickEvent event) {


                Window sub = new Window("You have Register Successfully ! ");
                UI mainWindow = MyVaadinUI.getCurrent();
                mainWindow.addWindow(sub);

                sub.center();

            }
        });
        form.addComponent(button);



    }
}

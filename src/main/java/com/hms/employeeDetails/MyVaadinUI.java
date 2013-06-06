package com.hms.employeeDetails;

import com.vaadin.data.util.ObjectProperty;
import com.vaadin.data.util.PropertysetItem;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Form;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class MyVaadinUI extends UI
{
    private VerticalLayout layout = new VerticalLayout();
    private Form reader = new Form();
    private Form form=new Form();

      @Override
    protected void init(VaadinRequest request) {

        initLayout();

   }
    private void initLayout() {

        layout.setMargin(true);
        setContent(layout);

        //Set the Property items for employee
        PropertysetItem item = new PropertysetItem();
        item.addItemProperty("name",  new ObjectProperty<String>(""));
        item.addItemProperty("address",new ObjectProperty<String>(""));
        item.addItemProperty("age",new ObjectProperty(""));
        item.addItemProperty("nic",new ObjectProperty<String>(""));
        item.addItemProperty("email", new ObjectProperty<String>(""));
        item.addItemProperty("mobile no",new ObjectProperty<String>(""));

        form.setItemDataSource(item);
        form.setCaption("Employee Registration ");


        Button ok = new Button("OK");
        form.commit();
        form.getFooter().addComponent(ok);

        Button reset = new Button("Reset");
        form.discard();
        form.getFooter().addComponent(reset);


        // Display the employee details

        reader.setItemDataSource(item);
        reader.setCaption("Employee Registered details");
        reader.setReadOnly(true);

        layout.addComponent(form);
        layout.addComponent(reader);
	    layout.setSizeFull();

     /*
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

           */

    }
}

package com.frontend.client;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;

public class NavigationHeader extends Composite {

    public NavigationHeader() {
        FlowPanel panel = new FlowPanel();
        panel.setStyleName("navigation");
        Label label = new Label("Header");
        panel.add(label);

        Button button = new Button("Test Compile");
        button.addClickHandler(event -> Window.alert("Test"));

        panel.add(button);

        initWidget(panel);
    }

}

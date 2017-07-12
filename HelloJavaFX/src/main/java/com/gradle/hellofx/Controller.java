package com.gradle.hellofx;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label label;

    @FXML
    private Button button;


    public void buttonClicked() {
        if (label.isVisible()) {
            label.setVisible(false);
        } else {
            label.setVisible(true);
        }
    }


}

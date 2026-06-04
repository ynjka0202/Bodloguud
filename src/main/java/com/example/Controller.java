package com.example;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button convertBtn;

    @FXML
    private TextField inputField;

    @FXML
    private Label resultLabel;

    @FXML
    void onConvert(ActionEvent event) {
  int hours = Integer.parseInt(inputField.getText());

        int day = hours / 24;
        int remainHour = hours % 24;

        resultLabel.setText(day + " " + remainHour);
    }

}

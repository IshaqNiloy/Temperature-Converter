package com.ali.temperatureconverter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {

    @FXML private Label label,label1;
    @FXML private TextField xField, yField;

    @FXML
    public void handleButtonAction(ActionEvent event) {
        Test Ob = new Test();
        double x = Double.parseDouble(xField.getText());
        double y = Double.parseDouble(yField.getText());
        Ob.setTemperature(x);
        label.setText("" +Ob.getTemperature());
        Ob.setTemperature1(y);
        label1.setText("" +Ob.getTemperature());
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }
}
   
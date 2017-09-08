/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit.converter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author tinov
 */

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField inchesField;
    @FXML
    private TextField centimetersField;
    @FXML
    private TextField poundsField;
    @FXML
    private TextField kilogramsField;
    
    boolean operationLength = true;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void lengthConvertAction(ActionEvent event) {
        if(!inchesField.getText().equals("")) {
            double inches = Double.parseDouble(inchesField.getText());
            double centimeters = inches * 2.54;
            centimetersField.setText("" + centimeters);
        } else {
            double centimeters = Double.parseDouble(centimetersField.getText());
            double inches = centimeters / 2.54;
            inchesField.setText("" + inches);
        }
    }

    @FXML
    private void massConvertAction(ActionEvent event) {
        if(!poundsField.getText().equals("")) {
            double pounds = Double.parseDouble(poundsField.getText());
            double kilograms = pounds / 2.20;
            kilogramsField.setText("" + kilograms);
        } else {
            double kilograms = Double.parseDouble(kilogramsField.getText());
            double pounds = kilograms * 2.20;
            poundsField.setText("" + pounds);
        }
    }
    
}

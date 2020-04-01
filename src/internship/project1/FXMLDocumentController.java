/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internship.project1;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Platform.exit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Legop
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Button closeButton;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World! Test!");
    }
    
    @FXML
    private void openButtonAction(ActionEvent event)
    {
        
    }
    
    @FXML
    private void saveButtonAction(ActionEvent event)
    {
        //Runs the RenameSTD X function
        //RunRename.RenameSTD();
        //Once it is saved...
        label.setText("Your new file name is 4/1/JWheel.std");
        
    }
    
    @FXML
    private void closeButtonAction(ActionEvent event)
    {
        exit();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

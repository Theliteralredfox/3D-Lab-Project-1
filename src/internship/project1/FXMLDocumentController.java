/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internship.project1;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import static javafx.application.Platform.exit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;

/**
 *
 * @author Legop
 */
public class FXMLDocumentController implements Initializable {
    
    final private DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    final private LocalDate localDate = LocalDate.now();
    
    @FXML
    private Label label;
    
    @FXML
    private Button closeButton;
    
    @FXML
    private Button openButton;
    
    @FXML
    private Button saveButton;
    
    @FXML
    private File stdFileField;
    
    @FXML
    private TextField nameTextField;
    
    @FXML
    private TextField capitalTextField;
    
    @FXML
    private TextField dateTextField;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Penguin");
    }
    
    @FXML
    private void openButtonAction(ActionEvent event)
    {
        //Test Openner Code
        Stage stage = new Stage();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.showOpenDialog(stage);

        System.out.println("File uploaded!");
        dateTextField.setText(currentDate.format(localDate));
    }
    
    @FXML
    private void saveButtonAction(ActionEvent event)
    {
        //Runs the RenameSTD X function
        //RunRename.RenameSTD();
        //Once it is saved...
        System.out.println("You clicked saved button!");
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
        assert dateTextField != null : "fx:id=\"dateTextField\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert openButton != null : "fx:id=\"openButton\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert saveButton != null : "fx:id=\"saveButton\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert closeButton != null : "fx:id=\"closeButton\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
    }    
    
    public void renameFile()
    {
      String DTF = TextField.getText(dateTextField);
      String CTF = TextField.getText(capitalTextField);
      String NTF = TextField.getText(nameTextField);
      File oldfile = stdFileField;
      File newfile = new File(NTF + CTF + DTF);
      
      if(oldfile.renameTo(newfile)) {
           System.out.println("Your file is now " + newfile);
           
      } 
      else {
         System.out.println("Error");
        }
      }
    }
    
    

    public File getStdFileField(stdFileField) {
        return stdFileField;
    }

    public void setStdFileField(File stdFileField) {
        this.stdFileField = stdFileField;
    }

    public TextField getNameTextField() {
        return nameTextField;
    }

    public void setNameTextField(TextField nameTextField) {
        this.nameTextField = nameTextField;
    }

    public TextField getCapitalTextField() {
        return capitalTextField;
    }

    public void setCapitalTextField(TextField capitalTextField) {
        this.capitalTextField = capitalTextField;
    }

    public TextField getDateTextField() {
        return dateTextField;
    }

    public void setDateTextField(TextField dateTextField) {
        this.dateTextField = dateTextField;
    }
    
    
}

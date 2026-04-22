package JAVA_FX.Communication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

//when we click on send we have to
//  -get the data from text field
//  -create a new scene
//  -show the new text in there

public class Controller {

    @FXML
    private TextField inputField;

    @FXML
    private Label displayText;

    public String getInput() {
        return inputField.getText();
    }

    public void sendBtn(ActionEvent e) {
        try {
            String userInput = getInput();

            FXMLLoader loader = new FXMLLoader(getClass().getResource("UI_2.fxml"));
            Parent root = loader.load();

            Controller scene2 = loader.getController();
            scene2.displayText.setText(userInput);

            //so now we have the switch the scene with the new text

            //1. get the Node that contains it
            Node targetNode = (Node) e.getSource();

            //2. now get the stage
            Stage stage = (Stage) targetNode.getScene().getWindow(); //got the stage
            stage.setScene(new Scene(root));

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public void goBack(ActionEvent e) {

        try {

            //so now we have the switch the scene with the new text

            FXMLLoader loadScene_display = new FXMLLoader(getClass().getResource("UI.fxml"));

            //1. get the Node that contains it
            Node targetNode = (Node) e.getSource();

            //2. now get the stage
            Stage stage = (Stage) targetNode.getScene().getWindow(); //got the stage
            stage.setScene(new Scene(loadScene_display.load()));

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public void closeApp(ActionEvent e) {
        System.out.println("Clicked on the close App button");

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

        alert.setTitle("Do you want to close the App?");
        alert.setHeaderText("You're about to logout");
        alert.setContentText("so this is the content text");

        if (alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("you are closing");
            Stage currentStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            currentStage.close();
        }
    }

}

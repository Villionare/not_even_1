package JAVA_FX.SCENE_SWITCH;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {

    @FXML
    Button nextButtonscene2;

    @FXML
    Button btnBack;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switch2scene1(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void switch2scene2(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

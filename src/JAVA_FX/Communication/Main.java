package JAVA_FX.Communication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Main extends Application {
    static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("UI.fxml"));

        stage.setOnCloseRequest(event -> {
            event.consume();
            closeApp(stage);
        });
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void closeApp(Stage stage) {
        System.out.println("Clicked on the close App button");

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

        alert.setTitle("Do you want to close the App?");
        alert.setHeaderText("You're about to logout");
        alert.setContentText("so this is the content text");

        if (alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("you are closing");
            stage.close();
        } else {
            return;
        }
    }
}

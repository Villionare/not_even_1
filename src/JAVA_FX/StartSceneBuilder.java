package JAVA_FX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartSceneBuilder extends Application {

    static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("check.fxml"));
            Scene scene = new Scene(loader.load());

            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}

package JAVA_FX.CSS;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/JAVA_FX/CSS/file.fxml"));

        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Using external style sheet");
        stage.show();
    }
}

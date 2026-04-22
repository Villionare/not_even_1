package JAVA_FX.WebView;

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

        FXMLLoader root = new FXMLLoader(getClass().getResource("UI.fxml"));

        stage.setScene(new Scene(root.load()));
        stage.setTitle("WebView Tutorial");
        stage.show();
    }
}

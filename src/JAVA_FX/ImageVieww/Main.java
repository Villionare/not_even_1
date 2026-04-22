package JAVA_FX.ImageVieww;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("UI.fxml"));
        Scene scene = new Scene(loader.load());

        stage.setTitle("ImageView");
        stage.setScene(scene);
        stage.show();
    }
}

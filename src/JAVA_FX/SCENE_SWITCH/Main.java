package JAVA_FX.SCENE_SWITCH;

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

        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene1.fxml"));

        Scene scene = new Scene(loader.load());
        stage.setTitle("Switch scenes");
        stage.setScene(scene);
        stage.show();
    }
}

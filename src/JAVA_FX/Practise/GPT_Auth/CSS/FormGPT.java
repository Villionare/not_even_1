package JAVA_FX.Practise.GPT_Auth.CSS;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FormGPT extends Application {
    static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/JAVA_FX/Practise/GPT_Auth/CSS/GPT_Login.fxml")
        );
        Scene scene = new Scene(fxmlLoader.load());

        stage.setMaxWidth(500);
        stage.setMaxHeight(700);
        stage.setScene(scene);
        stage.setTitle("ChatGPT Login.");
        stage.show();
    }
}



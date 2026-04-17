package JAVA_FX.ContainerNodes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

//Pane = a blank canvas
//You place things wherever you want using coordinates.

public class PaneFX extends Application {

    static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Button btn = new Button("Click");
        btn.setLayoutX(100);
        btn.setLayoutY(50);

        Pane pane = new Pane(btn);

        stage.setScene(new Scene(pane, 300, 100));
        stage.show();
    }
}

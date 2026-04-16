package JAVA_FX.ContainerNodes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StackPaneFX extends Application {

    static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        Rectangle rectangle1 = new Rectangle(400, 200, Color.TOMATO);
        Rectangle rectangle2 = new Rectangle(300, 150, Color.BLUE);
        Rectangle rectangle3 = new Rectangle(200, 100, Color.LIGHTGRAY);
        Rectangle rectangle4 = new Rectangle(100, 50, Color.ALICEBLUE);

        StackPane stackPane = new StackPane(rectangle1, rectangle2, rectangle3, rectangle4);

        stage.setScene(new Scene(stackPane));
        stage.show();
    }
}

package JAVA_FX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class HandlingEvents extends Application {

    static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        Circle circle = new Circle();

        BorderPane borderPane = new BorderPane(); //root node
        borderPane.getChildren().add(circle); //adding node circle to the root node

        Scene scene = new Scene(borderPane); //creating a scene

        stage.setScene(scene); //adding scene to stage
        stage.setTitle("Event Handling"); //adding title to the stage
    }
}

package JAVA_FX.ContainerNodes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//🧠 What is ScrollPane?
//
//In JavaFX, a ScrollPane is a container that lets you add scrolling to any content.
//
//👉 Think of it like:
//
//“If content is bigger than the visible area → allow user to scroll to see the rest.”
//
//📦 Basic Idea
//It holds one child node
//If that child is too big → scrollbars appear
//Supports:
//Vertical scrolling
//Horizontal scrolling
//Both

public class ScrollPaneFX extends Application {
    static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        ScrollPane scrollPane = new ScrollPane();

        VBox content = new VBox();
        for (int i = 1; i <= 20; i++) {
            content.getChildren().add(new Button("Button " + i));
        }

        scrollPane.setContent(content);

        stage.setScene(new Scene(scrollPane, 300, 100));

        stage.show();
    }
}

package JAVA_FX.ContainerNodes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

//🧠 What is AnchorPane?
//AnchorPane is a layout container in JavaFX where you “anchor” (fix) the position of child nodes relative to the edges of the pane.
//Instead of saying “put this at x=100, y=50”, you say:

//        👉 “Keep this 20px from the top”
//        👉 “Keep this 10px from the right”

//So it becomes responsive automatically when the window resizes.
//Basic Idea
//
//Each child node can have 4 anchors:
//
//        Top
//        Bottom
//        Left
//        Right
//
//You set these using static methods:
//
//AnchorPane.setTopAnchor(node, value);
//AnchorPane.setBottomAnchor(node, value);
//AnchorPane.setLeftAnchor(node, value);
//AnchorPane.setRightAnchor(node, value);


public class AnchorPaneFX extends Application {
    static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane root = new AnchorPane();

        Button btn1 = new Button("increase");
        Button btn2 = new Button("decrease");
        TextArea textArea = new TextArea();

        root.getChildren().addAll(btn1, btn2, textArea);

        //setting the positions of text field
        AnchorPane.setTopAnchor(textArea, 10.0);
        AnchorPane.setRightAnchor(textArea, 100.0);
        AnchorPane.setBottomAnchor(textArea, 10.0);
        AnchorPane.setLeftAnchor(textArea, 10.0);

        //setting the position of buttons
        AnchorPane.setRightAnchor(btn1, 10.0);
        AnchorPane.setTopAnchor(btn1, 10.0);
        AnchorPane.setRightAnchor(btn2, 10.0);
        AnchorPane.setBottomAnchor(btn2, 10.0);

        stage.setScene(new Scene(root));
        stage.show();
    }
}

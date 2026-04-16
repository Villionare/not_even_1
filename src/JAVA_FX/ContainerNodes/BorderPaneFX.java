package JAVA_FX.ContainerNodes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

//BorderPane is a layout container that divides your UI into 5 fixed regions:
//
//Top
//        Bottom
//Left
//        Right
//Center
//
//Think of it like a screen split into sections.
//
//📐 Visual Structure
//5
//        🎯 How It Works
//

//Each region can hold only ONE node.
//        BorderPane root = new BorderPane();

//root.setTop(node);
//root.setBottom(node);
//root.setLeft(node);
//root.setRight(node);
//root.setCenter(node);

//💡 Important Behavior

//1. Center is the boss 👑
//It takes all remaining space
//Automatically resizes when window changes

//2. Top & Bottom
//Stretch horizontally
//Height depends on content

//3. Left & Right
//Stretch vertically
//Width depends on content

public class BorderPaneFX extends Application {
    static void main(String[] args) {
        launch(args);
    }

    private static Button createButton(String str) {
        Button button = new Button(str);
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        //setting the margin on buttons
        BorderPane.setMargin(button, new Insets(5.0));

        //set the alignment of each button.
//        BorderPane.setAlignment(button, Pos.CENTER);

        return button;
    }

    public void start(Stage stage) {

        Button btn1 = createButton("top");
        Button btn2 = createButton("right");
        Button btn3 = createButton("bottom");
        Button btn4 = createButton("left");
        Button btn5 = createButton("center");

        BorderPane root = new BorderPane();

        //if we wanna set the padding as well
        root.setPadding(new Insets(10.0, 20.0, 30.0, 40.0)); //rotational dir.

        root.setTop(btn1);
        root.setRight(btn2);
        root.setBottom(btn3);
        root.setLeft(btn4);
        root.setCenter(btn5);

        stage.setScene(new Scene(root));
        stage.show();
    }
}

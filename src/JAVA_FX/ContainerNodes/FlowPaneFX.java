package JAVA_FX.ContainerNodes;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

//🧠 What is FlowPane?
//FlowPane is a layout container that arranges nodes in a flow (line by line).
//
//It places items:
//Left → Right (default), OR
//Top → Bottom
//
//And when space runs out…
//it wraps to the next row/column automatically

public class FlowPaneFX extends Application {

    static void main(String args) {
        launch(args);
    }

    private static Button createButton(String str) {
        return new Button(str);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Button btn1 = createButton("top");
        Button btn2 = createButton("right");
        Button btn3 = createButton("bottom");
        Button btn4 = createButton("left");
        Button btn5 = createButton("center");

        FlowPane flowPane = new FlowPane(btn1, btn2, btn3, btn4, btn5);
        flowPane.setStyle("-fx-border-color: black; -fx-border-width: 2;");

        //set the alignment of flowPane (default: top-left)
        flowPane.setAlignment(Pos.CENTER);

        //change the orientation
        flowPane.setOrientation(Orientation.VERTICAL);

        stage.setScene(new Scene(flowPane));
        stage.show();
    }
}

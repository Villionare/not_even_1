package JAVA_FX.ContainerNodes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class HBoxFX extends Application {

    static void main(String[] args) {
        launch(args);
    }

    private static Button createButton(String str) {
        Button button = new Button(str);
        button.setStyle("-fx-border-color: orange; -fx-border-width: 1");
        return button;
    }

    @Override
    public void start(Stage stage) throws Exception {

        Button btn1 = createButton("top");
        Button btn2 = createButton("right");
        Button btn3 = createButton("bottom");
        Button btn4 = createButton("left");
        Button btn5 = createButton("center");

        btn1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btn2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btn3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btn4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btn5.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        HBox hBox = new HBox(btn1, btn2, btn3, btn4, btn5);

        //give extra horizontal space, give it to btn5
        HBox.setHgrow(btn5, Priority.ALWAYS);

        stage.setScene(new Scene(hBox, 600, 400));
        stage.show();
    }
}

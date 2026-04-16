package JAVA_FX.ContainerNodes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

//grid.add(node, col, row, colspan, rowspan);

public class GridPaneFX extends Application {

    static void main(String[] args) {
        launch(args);
    }

    private static Button createButton(String str) {
        Button button = new Button(str);
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
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
        Button btn6 = createButton("new");
        Button btn7 = createButton("new_bottom");
        Button btn8 = createButton("new_bottom");
        Button btn9 = createButton("new_center");
        Button btn10 = createButton("new_center");
        Button btn11 = createButton("new_center");

        GridPane gridPane = new GridPane();

        gridPane.add(btn1, 0, 0, 4, 1);
        gridPane.add(btn2, 1, 1, 1, 5);
        gridPane.add(btn3, 2, 2, 4, 1);
        gridPane.add(btn4, 3, 3, 3, 1);
        gridPane.add(btn5, 4, 4);
        gridPane.add(btn6, 2, 1, 4, 1);
        gridPane.add(btn7, 4, 0, 2, 1);
        gridPane.add(btn8, 5, 5);
        gridPane.add(btn9, 3, 4, 2, 2);
        gridPane.add(btn10, 2, 3, 1, 4);
        gridPane.add(btn11, 0, 1, 1, 5);

//        gridPane.setAlignment(Pos.CENTER);
        gridPane.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        stage.setScene(new Scene(gridPane, 800, 800));
        stage.setTitle("GRID TUTORIAL");
        stage.show();
    }
}

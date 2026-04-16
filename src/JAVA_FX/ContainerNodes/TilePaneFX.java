package JAVA_FX.ContainerNodes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

//What is TilePane?
//
//TilePane is a layout where all children are placed in equal-sized tiles (cells).
//Every item gets the same width & height
//Layout looks like a clean grid

//both flowpane and tilepane are nearly the same but there is one difference that
//in flowpane different cell sizes are allowed of different height and width
//but in tilepane all the height and width will be same of all the cell and will be decided by the biggest cell.

//if we do in css the:
//box-model: flex;
//flex-direction: row;
//flex-wrap: wrap;
//children of same h and w acc. to biggest cell.

public class TilePaneFX extends Application {

    static void main(String args) {
        launch(args);
    }

    private static Button createButton(String str) {
        Button button = new Button(str);
        button.setStyle("-fx-border-color: pink; -fx-border-width: 2");
        return button;
    }

    @Override
    public void start(Stage stage) throws Exception {

        Button btn1 = createButton("top");
        Button btn2 = createButton("right");
        Button btn3 = createButton("bottom");
        Button btn4 = createButton("left");
        Button btn5 = createButton("center");

        TilePane tilePane = new TilePane(btn1, btn2, btn3, btn4, btn5);
        tilePane.setStyle("-fx-border-color: red; -fx-border-width: 1");

        stage.setScene(new Scene(tilePane));
        stage.setTitle("Tile Pane");
        stage.show();
    }
}

// src/main/java/com/example/App.java
package JAVA_FX;

//state - the top level window
//scene - the container held inside the stage
//scene graph - the tree of all visual node inside the scene
//scene graph is made up of different nodes (text, buttons, input, etc.)
//nodes (container nodes) can contain children or maybe not.
//container nodes types: Group (normal fixed size) - Region (responsive) - Control ()

//creating the node - placing in the scene - putting the scene on stage

//1 - create nodes = Assemble your visual elements
//2 - Add to root node = Place elements in a container
//3 - Create a scene = pass the root node to the scene
//4 - Set the scene = Attach the scene to the stage
//5 - Show the stage = call stage.show() to display

//        VBox      → stack nodes vertically
//        HBox      → stack nodes horizontally
//        GridPane  → row/column grid
//        BorderPane→ top/bottom/left/right/center regions
//        StackPane → layer nodes on top of each other
//        AnchorPane→ anchor nodes to edges (great for resizable UIs)
//        FlowPane  → wrapping row/column layout
//        TilePane  → equal-sized tiles

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class First extends Application {

    static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {

    }

    @Override
    public void start(Stage stage) throws Exception {

        String image = "file:/home/duedull/IdeaProjects/not_even_1/src/JAVA_FX/whatsapp.png";
        Image image1 = new Image(image);


        Group rootNode = new Group();
        Button btn = new Button("diddy");

        rootNode.getChildren().add(btn);
        Scene scene = new Scene(rootNode, 600, 600, Color.TAN);

//        stage.setMaxHeight(400);
//        stage.setMaxWidth(400);
//        stage.setFullScreen(true);

        stage.setX(500);
        stage.setY(500);
        stage.setTitle("Nigga");
        stage.setFullScreenExitHint("this is the new escape message");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q")); //will get exited when we press q
        stage.setResizable(false);
        stage.getIcons().add(image1);
        stage.setScene(scene);
        stage.show();
    }

    public void stop() {

    }

}
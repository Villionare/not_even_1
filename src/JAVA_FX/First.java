package JAVA_FX;

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
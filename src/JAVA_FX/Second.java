package JAVA_FX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Second extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void init() {

    }

    public void start(Stage stage) {

        String image = "file:/home/duedull/IdeaProjects/not_even_1/src/JAVA_FX/whatsapp.png";
        Image image1 = new Image(image);

        //horizontal line
        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(10);
        line.setStroke(Color.BLUEVIOLET);
        line.setOpacity(0.5);

        //text
        Text text1 = new Text();
        text1.setText("This is diddy Text");
        text1.setX(100);
        text1.setY(100);
        text1.setFont(Font.font("Verdana", 30));
        text1.setFill(Color.LIGHTGRAY);
        text1.setTextAlignment(TextAlignment.CENTER);

        Button btn = new Button("new btn");

        Group rootNode = new Group();

        rootNode.getChildren().add(btn);
        rootNode.getChildren().add(text1);
        rootNode.getChildren().add(line);

        Scene scene1 = new Scene(rootNode, 500, 500, Color.TOMATO);

        stage.getIcons().add(image1);
        stage.setTitle("New for Drawing scenes");
        stage.setScene(scene1);
        stage.show();
    }

    public void stop() {
    }
}

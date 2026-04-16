package JAVA_FX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LabelFX extends Application {

    static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {

        Label label1 = new Label("Hello JavaFX!1");
//        Label label2 = new Label("Hello JavaFX!2");
//        Label label3 = new Label("Hello JavaFX!3");

        label1.setText("Changed label 1");

//        String string = label2.getText();
//        System.out.println(string);

        label1.setFont(new Font("Arial", 20));
        label1.setTextFill(Color.BLUEVIOLET);

        ImageView imageView = new ImageView("file:src/JAVA_FX/whatsapp.png");
        label1.setGraphic(imageView);

        Group group = new Group();

        group.getChildren().addAll(label1);

        Scene scene = new Scene(group, 1000, 1000);

        stage.setScene(scene);
        stage.setTitle("Label Class");
        stage.show();
    }

    public void stop() {

    }
}
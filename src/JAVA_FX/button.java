package JAVA_FX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//button with stackpane
public class button extends Application {

    static void main(String[] args) {
        launch(args);
    }

    public void init() {

    }

    @Override
    public void start(Stage stage) {

        TextField textField = new TextField();

        String path = "file:src/JAVA_FX/whatsapp.png";
        ImageView image = new ImageView(path);

        //setting a root node
        VBox layout = new VBox(10);

        Button btn1 = new Button("Yes");
        Button btn2 = new Button("No");
        Button btn3 = new Button("Clickable");

//        btn3.setGraphic(image);
//        btn3.setDisable(true);
//        btn1.setStyle("-fx-background-color: green; -fx-text-fill: white;");

        btn2.setOnMouseEntered(e -> {
            System.out.println("Mouse Hover");
            btn2.setScaleX(1.1);
        });

        btn2.setOnMouseExited(e -> {
            System.out.println("Mouse Left");
            btn2.setScaleX(1.0);
        });

        btn2.setDefaultButton(true);
        btn1.setCancelButton(true);

        //btn3 will be disabled if there is no input in the text feald
        btn3.disableProperty().bind(textField.textProperty().isEmpty());

        layout.getChildren().addAll(textField, btn1, btn2, btn3);

        Scene scene = new Scene(layout, 300, 300, Color.TOMATO);

        stage.setTitle("for btn");

        stage.setScene(scene);
        stage.show();
    }

    public void stop() {

    }
}

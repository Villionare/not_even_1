package JAVA_FX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TextFealdFX extends Application {

    static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Group group = new Group();

        TextField textField = new TextField();
        textField.setPromptText("Enter something here"); //placeholder text
        textField.setText("default text");

        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("Typed: " + newValue);
        });

//        textField.setDisable(true);
//        textField.setEditable(false);
//        textField.setAlignment(Pos.CENTER);
//        textField.setLayoutX(50);
//        textField.setLayoutY(50);

        group.getChildren().add(textField);

        Scene scene = new Scene(group, Color.TAN);

        stage.setMinHeight(300);
        stage.setMinWidth(300);
        stage.setTitle("Text Field Demo");
        stage.setScene(scene);
        stage.show();
    }
}

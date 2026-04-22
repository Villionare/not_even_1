package JAVA_FX.EventHandlers;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    Circle newCircle; //find the circle in the fxml with id: newCircle and attach its object in here so that changes can be made.
    private double x;
    private double y;

    public void UP() {
        newCircle.setCenterY(y -= 5);

    }

    public void RIGHT() {
        newCircle.setCenterX(x += 5);
    }

    public void DOWN() {
        newCircle.setCenterY(y += 5);
    }

    public void LEFT() {
        newCircle.setCenterX(x -= 5);
    }
}

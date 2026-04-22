package JAVA_FX.ImageVieww;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    boolean loop = false;

    @FXML
    private ImageView imageContainer;

    public void switchImage() {

        String path = loop ? "image1.png" : "image2.png";
        Image image = new Image(getClass().getResourceAsStream(path));
        System.out.println("Clicked on switched button.");

        imageContainer.setImage(image);
        loop = !loop;
    }
}
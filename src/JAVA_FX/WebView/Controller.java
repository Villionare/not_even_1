package JAVA_FX.WebView;

import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    WebView privateWebView;

    @FXML
    TextField urlTextField;

    @FXML
    WebEngine newWebEngine;

    @FXML
    Button loadButton;

    private double zoom = 1;
    private WebHistory webHistory;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        newWebEngine = privateWebView.getEngine();
    }

    public void loadPage() {
        newWebEngine.load("https://" + urlTextField.getText());
    }

    public void loadButton(ActionEvent e) {
        loadPage();
    }

    public void refreshPage(ActionEvent e) {
        newWebEngine.reload();
    }

    public void zoomIn(ActionEvent e) {
        privateWebView.setZoom(zoom++);
    }

    public void zoomOut(ActionEvent e) {
        privateWebView.setZoom(zoom--);
    }

    public void getHistory(ActionEvent e) {
        webHistory = newWebEngine.getHistory();
        Observable entries = webHistory.getEntries();
        

    }
}

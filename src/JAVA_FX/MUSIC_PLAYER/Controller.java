package JAVA_FX.MUSIC_PLAYER;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.util.Map;

public class Controller {

    @FXML
    ImageView coverImage;
    @FXML
    Label songTitle;
    @FXML
    Label artistName;
    @FXML
    Label albumName;
    @FXML
    Label currentTime;
    @FXML
    Label totalTime;
    @FXML
    Button playPauseBtn;
    @FXML
    Slider slider;

    File file;
    Media media;
    MediaPlayer player;
    String filePath;

    public void selectFile(ActionEvent e) {

        Stage stage = (Stage) ((Button) e.getSource()).getScene().getWindow();

        FileChooser fileChooser = new FileChooser();

        // Title of the dialog
        fileChooser.setTitle("Select the Song you wanna play");

        // Starting directory
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home") + "/Downloads"));

        // File type filters
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Audio Files", "*.mp3", "*.wav", "*.aac"),
                new FileChooser.ExtensionFilter("MP3 Only", "*.mp3"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );

        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
            filePath = file.getAbsolutePath();
            newSong(filePath);
            System.out.println("Selected: " + file.getAbsolutePath());
        }
    }

    public void newSong(String filePath) {

        // stop previous song if exists
        if (player != null) {
            player.stop();
        }

        file = new File(filePath);
        media = new Media(file.toURI().toString());
        player = new MediaPlayer(media);

        player.setOnReady(() -> {
            Map<String, Object> meta = media.getMetadata();

            Duration duration = player.getTotalDuration();

            int minutes = (int) duration.toMinutes();
            int seconds = (int) duration.toSeconds() % 60;

            totalTime.setText(String.format("%02d:%02d", minutes, seconds));

            songTitle.setText((String) meta.get("title"));
            artistName.setText((String) meta.get("artist"));
            albumName.setText((String) meta.get("album"));
            coverImage.setImage((Image) meta.get("image"));
        });

        player.currentTimeProperty().addListener((obs, oldTime, newTime) -> {

            if (!slider.isValueChanging()) { // important!
                Duration total = player.getTotalDuration();

                if (total.toSeconds() > 0) {
                    double progress = newTime.toSeconds() / total.toSeconds() * 100;
                    slider.setValue(progress);
                }
            }

            // also update current time label
            int minutes = (int) newTime.toMinutes();
            int seconds = (int) newTime.toSeconds() % 60;

            currentTime.setText(String.format("%02d:%02d", minutes, seconds));
        });

        slider.valueChangingProperty().addListener((obs, wasChanging, isChanging) -> {
            if (!isChanging) { // user released the slider
                seekToSlider();
            }
        });

        slider.setOnMouseReleased(e -> seekToSlider());

        player.setOnReady(() -> {
            slider.setMax(player.getTotalDuration().toSeconds());
        });
    }

    @FXML
    private void handlePlaySong(ActionEvent e) {

        if (player == null) {
            if (filePath != null) {
                newSong(filePath);
                player.play();
                playPauseBtn.setText("Pause");
            }
            return;
        }

        MediaPlayer.Status status = player.getStatus();

        if (status == MediaPlayer.Status.PLAYING) {
            player.pause();
            playPauseBtn.setText("Play");
        } else {
            player.play();
            playPauseBtn.setText("Pause");
        }
    }

    private void seekToSlider() {
        if (player == null) return;

        Duration total = player.getTotalDuration();
        double percent = slider.getValue() / 100.0;

        Duration seekTime = total.multiply(percent);
        player.seek(seekTime);
    }

    public void showLyrics() {

    }

    public void previous() {

    }

    public void shuffle() {

    }

    public void next() {

    }

    public void repeat() {

    }

}



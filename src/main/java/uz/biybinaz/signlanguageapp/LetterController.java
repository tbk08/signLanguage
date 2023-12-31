package uz.biybinaz.signlanguageapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class LetterController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    ImageView aSignImage;

    public void initialize() throws IOException {
        FileInputStream inputstream = new FileInputStream("C:\\Users\\User\\IdeaProjects\\signLanguageApp\\src\\main\\resources\\signImages\\aSign.png");
        Image myImage = new Image(inputstream);
        aSignImage.setImage(myImage);
    }

    public void backToMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sign-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void aSign(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("aSign.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void bSign(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("bSign.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

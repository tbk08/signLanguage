package uz.biybinaz.signlanguageapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SignLanguageController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void showAllLetters(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("letters-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}

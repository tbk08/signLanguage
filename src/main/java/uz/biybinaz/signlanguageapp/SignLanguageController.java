package uz.biybinaz.signlanguageapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SignLanguageController {
    @FXML
    ImageView myImageView;
    @FXML
    Button myButton;

    public void initialize() throws FileNotFoundException {
        FileInputStream inputstream = new FileInputStream("C:\\Users\\User\\IdeaProjects\\demo7\\src\\main\\java\\com\\example\\demo7\\aSign.png");
        Image myImage = new Image(inputstream);
        myImageView.setImage(myImage);
    }

    public void printLetter(ActionEvent e) {
        System.out.println("A");
    }
}

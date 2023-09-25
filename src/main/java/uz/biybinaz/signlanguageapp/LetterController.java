package uz.biybinaz.signlanguageapp;

import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

public class LetterController {
    @FXML
    Button aSignButton;
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    ImageView aSignImage;

    private BufferedImage resizeImage(BufferedImage originalImage, int targetWidth) throws IOException {
        int newHeight = ((int) ((float) targetWidth / ((float) originalImage.getWidth() / (float) originalImage.getHeight())));
        BufferedImage resizedImage = new BufferedImage(targetWidth, newHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = resizedImage.createGraphics();
        graphics2D.drawImage(originalImage, 0, 0, targetWidth, newHeight, null);
        graphics2D.dispose();
        return resizedImage;
    }

    public void initialize() throws IOException {
        FileInputStream inputstream = new FileInputStream("C:\\Users\\User\\IdeaProjects\\signLanguageApp\\src\\main\\resources\\signImages\\aSign.png");
        aSignImage.setImage(SwingFXUtils.toFXImage(resizeImage(ImageIO.read(inputstream), 450), null));
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

package uz.biybinaz.signlanguageapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SignLanguageApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //toDo изменить получение пути к файлу
        Parent fxmlLoader = FXMLLoader.load(SignLanguageApplication.class.getResource("sign-view.fxml"));
        Scene scene = new Scene(fxmlLoader);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

module uz.biybinaz.signlanguageapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.swing;


    opens uz.biybinaz.signlanguageapp to javafx.fxml;
    exports uz.biybinaz.signlanguageapp;
}
module uz.biybinaz.signlanguageapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens uz.biybinaz.signlanguageapp to javafx.fxml;
    exports uz.biybinaz.signlanguageapp;
}
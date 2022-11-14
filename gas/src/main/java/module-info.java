module gui.gas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens gui.gas to javafx.fxml;
    exports gui.gas;
}
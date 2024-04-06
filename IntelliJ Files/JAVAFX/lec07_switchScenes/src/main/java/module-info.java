module com.example.lec07_switchscenes {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.lec07_switchscenes to javafx.fxml;
    exports com.example.lec07_switchscenes;
}
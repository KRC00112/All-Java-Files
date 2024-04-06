module com.example.lec03_scenes {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.lec03_scenes to javafx.fxml;
    exports com.example.lec03_scenes;
}
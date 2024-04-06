module com.example.lec04_scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.lec04_scenebuilder to javafx.fxml;
    exports com.example.lec04_scenebuilder;
}
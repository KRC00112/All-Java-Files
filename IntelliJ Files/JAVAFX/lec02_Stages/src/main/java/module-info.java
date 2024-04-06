module com.example.lec02_stages {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.lec02_stages to javafx.fxml;
    exports com.example.lec02_stages;
}
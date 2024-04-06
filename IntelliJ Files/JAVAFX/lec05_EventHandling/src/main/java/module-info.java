module com.example.lec05_eventhandling {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.lec05_eventhandling to javafx.fxml;
    exports com.example.lec05_eventhandling;
}
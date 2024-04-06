module com.example.lec08_controllercomm {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.lec08_controllercomm to javafx.fxml;
    exports com.example.lec08_controllercomm;
}
module com.example.lec06_cssstyling {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.lec06_cssstyling to javafx.fxml;
    exports com.example.lec06_cssstyling;
}
module com.example.lec01_javainstalltest {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.lec01_javainstalltest to javafx.fxml;
    exports com.example.lec01_javainstalltest;
}
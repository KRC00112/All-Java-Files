package com.example.lec08_controllercomm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class scene1Controller {



    TextField usernameField;



    private Stage stage;
    private Scene scene;
    private FXMLLoader fxmlLoader;


    @FXML



    public void switchToScene2(ActionEvent event) throws IOException {


        String username= usernameField.getText();

        FXMLLoader loader=new FXMLLoader(getClass().getResource("scene2.fxml"));
        fxmlLoader=loader.load();

        scene2Controller s2c=loader.getController();
        s2c.displayName(username);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene2.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();



    }
}

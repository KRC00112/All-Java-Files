package com.example.lec08_controllercomm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class scene2Controller {

    private Stage stage;
    private Scene scene;
    private FXMLLoader fxmlLoader;


    @FXML
    Label nameLabel;
    public void displayName(String username){

       nameLabel.setText("Hello "+username);

    }





    public void switchToScene1(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene1.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();



    }
}

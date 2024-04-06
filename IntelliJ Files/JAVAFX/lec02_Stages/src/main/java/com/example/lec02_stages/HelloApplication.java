package com.example.lec02_stages;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    public static void main(String[] args) {


        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {


//        Stage stage=new Stage();

        Group root=new Group();
        Scene scene=new Scene(root, Color.RED);

        Image logo=new Image("dnalogo.PNG");
        stage.getIcons().add(logo);
        stage.setTitle("Stage Demo");
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setResizable(false);
        stage.setX(0);
        stage.setY(0);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("press q to quit");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.setScene(scene);
        stage.show();




    }
}
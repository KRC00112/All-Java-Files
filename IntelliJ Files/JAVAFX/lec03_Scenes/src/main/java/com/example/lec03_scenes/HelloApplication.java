package com.example.lec03_scenes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.crypto.Cipher;
import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {

       Scanner scanner=new Scanner(System.in);
       System.out.print("Enter username: ");
       String userName=scanner.nextLine();
       Group root=new Group();
       Scene scene=new Scene(root,500,500 ,Color.CORAL);
       Stage stage=new Stage();
       stage.setResizable(false);
       stage.setTitle("Scenes Demo");

        Circle circle=new Circle();
        circle.setCenterX(50);
        circle.setCenterY(50);
        circle.setRadius(20);
        circle.setFill(Color.MEDIUMPURPLE);
        root.getChildren().add(circle);

        Image image=new Image("user.png");
        ImageView imgv=new ImageView(image);
        imgv.setX(31);
        imgv.setY(30);
        imgv.setFitHeight(40.0);
        imgv.setFitWidth(40.0);
        root.getChildren().add(imgv);

        Text text=new Text();
        text.setText(userName);
        text.setX(80);
        text.setY(60);
        text.setFont(Font.font("verdana",20));
        text.setStyle("-fx-font-style: italic;");
        text.setFill(Color.BLACK);
        root.getChildren().add(text);

        Line line =new Line();
        line.setStartX(30);
        line.setStartY(80);
        line.setEndX(scene.getWidth()-30);
        line.setEndY(80);
        line.setStrokeWidth(2);
        line.setStroke(Color.BLACK);
//        line.setOpacity(0.5);
//        line.setRotate(45);
        root.getChildren().add(line);

        Rectangle rectangle=new Rectangle();
        rectangle.setX(30);
        rectangle.setY(110);
        rectangle.setWidth(scene.getWidth()-60);
        rectangle.setHeight(370);
        rectangle.setFill(Color.CORAL);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK);
        root.getChildren().add(rectangle);

        for(int i=140;i<=450;i+=50){
            triangle(root,50,i);
        }
       stage.setScene(scene);
       stage.show();
    }
    public static void triangle(Group root,int x,int y){
        Polygon triangle=new Polygon();
        triangle.getPoints().addAll(0.0,0.0,
                20.0,5.0,
                0.0,10.0);
        //find difference between addAll and setAll
        triangle.setFill(Color.GREENYELLOW);

        Rectangle polygonMover=new Rectangle();
        polygonMover.setWidth(20);
        polygonMover.setHeight(10);
        polygonMover.setX(x);
        polygonMover.setY(y);
        polygonMover.setFill(Color.CORAL);
        triangle.layoutXProperty().bind(polygonMover.xProperty());
        triangle.layoutYProperty().bind(polygonMover.yProperty());
        root.getChildren().addAll(polygonMover,triangle);


    }
    public static void main(String[] args) {
        launch(args);

    }
}
package com.example.howtogymbrothegame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class HowToGymBroApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MainHub.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);

        //Window Settings
        //window icon
       // Image icon = new Image ("src/macd.png");
        //stage.getIcons().add(icon);

        //window tittle
        stage.setTitle("How To Gym Bro");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

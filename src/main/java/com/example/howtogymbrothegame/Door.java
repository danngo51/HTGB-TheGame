package com.example.howtogymbrothegame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Door {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    ImageView imgSmokingShelter;
    @FXML
    ImageView imgSidewalk;
    @FXML
    ImageView imgGym;
    @FXML
    ImageView imgDrinkingBar;
    @FXML
    ImageView imgBackground;
    @FXML
    ImageView imgGrass;

    //Method to change scenes/doors
    public void switchToMainHub(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("MainHub.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Weekday.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToCanteen(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Kantine.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToFitness(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Fitness.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToDrinking(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Drikke.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}
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

    //Room access
    private boolean accessFriday;
    private boolean accessSaturday;
    private boolean accessSunday;

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


    public void switchToCanteen(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Kantine.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Kantine");
        stage.show();
    }

    public void switchToFitness(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Fitness.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Fitness");
        stage.show();
    }

    public void switchToSmoking(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Rygeskur.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Smoking");
        stage.show();
    }

    public void switchToDrinking(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Drikke.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Drikke");
        stage.show();
    }


    //Switching weekdays methods
    public void switchToMTT(MouseEvent event) throws IOException {
        //Load stage
        root = FXMLLoader.load(getClass().getResource("Weekday.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Mandag til torsdag");
        stage.show();

        //Access to friday

        System.out.println(accessFriday);
    }


    public void switchToFriday(MouseEvent event) throws IOException {
        //Load stage
        if(accessFriday){
            //Access to Saturday
            setAccessSaturday(true);
            System.out.println("hej");
            root = FXMLLoader.load(getClass().getResource("Weekday.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Fredag");
            stage.show();
        } else {
            System.out.println("No access fredag");
        }
    }

    public void switchToSaturday(MouseEvent event) throws IOException {
        if(accessSaturday){
            //Access to Sunday
            accessSunday = true;

            root = FXMLLoader.load(getClass().getResource("Weekday.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Lørdag");
            stage.show();
        } else {
            System.out.println("No access lørdag");
        }
    }

    public void switchToSunday(MouseEvent event) throws IOException {
        if(accessSunday){
            root = FXMLLoader.load(getClass().getResource("Weekday.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Søndag");
            stage.show();
        } else {
            System.out.println("No access søndag");
        }
    }

    public void setAccessFriday(boolean accessFriday) {
        this.accessFriday = accessFriday;
    }

    public void setAccessSaturday(boolean accessSaturday) {
        this.accessSaturday = accessSaturday;
    }

    public void setAccessSunday(boolean accessSunday) {
        this.accessSunday = accessSunday;
    }
}
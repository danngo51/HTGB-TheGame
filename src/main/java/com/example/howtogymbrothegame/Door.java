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
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Door {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    ImageView lockFriday;
    @FXML
    ImageView lockSaturday;
    @FXML
    ImageView lockSunday;

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

    //Connection to RoomAccess
    RoomAccess access = RoomAccess.getInstance();


    public void switchToMTT(MouseEvent event) throws IOException {
        //Access to friday
        access.setAccessFriday(true);
        lockFriday.setVisible(false);
        root = FXMLLoader.load(getClass().getResource("Weekday.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Mandag til torsdag");
        stage.show();
    }


    public void switchToFriday(MouseEvent event) throws IOException {
        if (access.isAccessFriday()) {
            //allowing to enter saturday
            access.setAccessSaturday(true);

            //load scene
            root = FXMLLoader.load(getClass().getResource("Weekday.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Fredag");
            stage.show();
        }
        else {
            System.out.println("ingen adgang fredag");
        }
    }

    public void switchToSaturday(MouseEvent event) throws IOException {
        if (access.isAccessSaturday()){
            //allowing to enter sunday
            access.setAccessSunday(true);

            //load scene
            root = FXMLLoader.load(getClass().getResource("Weekday.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Lørdag");
            stage.show();
        }
        else {
            System.out.println("ingen adgang lørdag");
        }
    }

    public void switchToSunday(MouseEvent event) throws IOException {
        if (access.isAccessSunday()) {
            root = FXMLLoader.load(getClass().getResource("Weekday.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Søndag");
            stage.show();
        }
        else {
            System.out.println("ingen adgang søndag");
        }

    }

}
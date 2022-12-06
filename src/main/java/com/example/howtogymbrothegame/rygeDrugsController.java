package com.example.howtogymbrothegame;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class rygeDrugsController implements Initializable {
    private Parent root;
    private Stage stage;
    private Scene scene;
    @FXML
    private Label pancreas;
    @FXML
    private Label liver;
    @FXML
    private Label heart;
    @FXML
    private Label lungs;

    //Connection to PlayerManager
    PlayerManager player = PlayerManager.getInstance();

    //This has to be public, so it can be used in other classes.
    //This methode is used to update the player stats
    public void displayStats(String pancreasVal, String liverVal, String heartVal, String lungsVal) {
        pancreas.setText(pancreasVal);
        liver.setText(liverVal);
        heart.setText(heartVal);
        lungs.setText(lungsVal);
    }

    ObservableList list = FXCollections.observableArrayList();
    @FXML
    private ChoiceBox<String> choiceBoxRyge;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadData();
    }

    private void loadData() {
        String a = "0 cigaretter";
        String b = "1-5 cigaretter";
        String c = "6-11 cigaretter";
        String d = "12-17 cigaretter";
        String e = "18-23 cigaretter";
        String f = "24-29 cigaretter";
        String g = "30-35 cigaretter";
        String h = "36-41 cigaretter";
        list.addAll(a, b, c, d, e, f, g, h);
        choiceBoxRyge.getItems().addAll(list);
        choiceBoxRyge.setOnAction(this::getCigarets);
    }

    @FXML
    public void switchtoWeekDays(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Weekday.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void smookingCigarets() {
        player.setHeart(player.getYesHeart());
        this.heart.setText(String.valueOf(player.getHeart()));
    }

    boolean answered = false;

    public void getCigarets(ActionEvent event) {
        String myCigarets = choiceBoxRyge.getValue();

        if (answered == false) {
            if (myCigarets.equals("1-5 cigaretter")) {
                smookingCigarets();
                answered = true;
            } else if (myCigarets.equals("6-11 cigaretter")) {
                smookingCigarets();
                answered = true;
            } else if (myCigarets.equals("12-17 cigaretter")) {
                smookingCigarets();
                answered = true;
            } else if (myCigarets.equals("18-23 cigaretter")) {
                smookingCigarets();
                answered = true;
            } else if (myCigarets.equals("24-29 cigaretter")) {
                smookingCigarets();
                answered = true;
            } else if (myCigarets.equals("30-35 cigaretter")) {
                smookingCigarets();
                answered = true;
            } else if (myCigarets.equals("36-41 cigaretter")) {
                smookingCigarets();
                answered = true;
            } else {
                this.heart.setText(String.valueOf(player.getHeart()));
                answered = true;
            }
        }
    }

    // Metode til minus i stats, hvis du tager drugs
    @FXML
    private void doingDrugs() {
        player.setHeart(player.getYesHeart());
        this.heart.setText(String.valueOf(player.getHeart()));
        player.setLiver(player.getYesLiver());
        this.liver.setText(String.valueOf(player.getLiver()));
        player.setPancreas(player.getYesPancreas());
        this.pancreas.setText(String.valueOf(player.getPancreas()));
        player.setLungs(player.getYesLungs());
        this.lungs.setText(String.valueOf(player.getLungs()));
    }

}
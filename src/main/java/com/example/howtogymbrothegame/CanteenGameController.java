package com.example.howtogymbrothegame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CanteenGameController {

    private int itemScore;

    Stage stage;
    @FXML
    private AnchorPane scenePane;
    PlayerManager player = PlayerManager.getInstance();

    @FXML
    private void closeGame(ActionEvent event) {
        stage = (Stage) scenePane.getScene().getWindow();
        stage.close();
    }

    @FXML
    ImageView tomato, cucumber, steakMeat, watermelon, carrot, chicken, bellpepper, rice, candy, soda, cake;
    @FXML
    ProgressBar healthMeter;




    private void setItemScorePositiv() {
        itemScore = itemScore + 1;
        itemScoreSystem();
        System.out.println(itemScore);
    }

    private void setItemScoreNegativ() {
        itemScore = itemScore -1;
        itemScoreSystem();
        System.out.println(itemScore);
    }
    @FXML
    private void tomato(MouseEvent event) {
        setItemScorePositiv();
        tomato.setVisible(false);
    }
    @FXML
    private void cucumber(MouseEvent event) {
        setItemScorePositiv();
        cucumber.setVisible(false);
    }
    @FXML
    private void steakMeat(MouseEvent event) {
        setItemScorePositiv();
        steakMeat.setVisible(false);
    }
    @FXML
    private void watermelon(MouseEvent event) {
        setItemScorePositiv();
        watermelon.setVisible(false);
    }
    @FXML
    private void carrot(MouseEvent event) {
        setItemScorePositiv();
        carrot.setVisible(false);
    }
    @FXML
    private void chicken(MouseEvent event) {
        setItemScorePositiv();
        chicken.setVisible(false);
    }
    @FXML
    private void bellpepper(MouseEvent event) {
        setItemScorePositiv();
        bellpepper.setVisible(false);
    }
    @FXML
    private void rice(MouseEvent event) {
        setItemScoreNegativ();
        rice.setVisible(false);
    }
    @FXML
    private void candy(MouseEvent event) {
        setItemScoreNegativ();
        candy.setVisible(false);
    }
    @FXML
    private void soda(MouseEvent event) {
        setItemScoreNegativ();
        soda.setVisible(false);
    }
    @FXML
    private void cake(MouseEvent event) {
        setItemScoreNegativ();
        cake.setVisible(false);
    }

    @FXML
    private void itemScoreSystem(){
        if(itemScore >= 6){
            player.setHeart(player.getNoHeart());
            player.setLiver(player.getNoLiver());
            player.setLungs(player.getNoLungs());
            player.setPancreas(player.getNoPancreas());
            healthMeter.setProgress(1);
        } else if (itemScore >= 4){
            player.setHeart(player.getNoHeart());
            player.setLiver(player.getNoLiver());
            player.setPancreas(player.getNoPancreas());
            healthMeter.setProgress(0.75);
        } else if (itemScore >= 3) {
            player.setHeart(player.getNoHeart());
            player.setPancreas(player.getNoPancreas());
            healthMeter.setProgress(0.5);
        } else if (itemScore >= 1) {
            player.setHeart(player.getNoHeart());
            healthMeter.setProgress(0.25);
        }else {
            player.setHeart(player.getYesHeart());
            player.setPancreas(player.getYesPancreas());
            healthMeter.setProgress(0);
        }
    }
}

package com.example.howtogymbrothegame;

import javafx.fxml.FXML;
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

    @FXML
    private void closeGame() {
        stage = (Stage) scenePane.getScene().getWindow();
        stage.close();
    }

    @FXML
    ImageView tomato;
    @FXML
    ImageView cucumber;
    @FXML
    ImageView steakMeat;
    @FXML
    ImageView watermelon;
    @FXML
    ImageView carrot;
    @FXML
    ImageView chicken;
    @FXML
    ImageView bellpeper;
    @FXML
    ImageView rice;
    @FXML
    ImageView candy;
    @FXML
    ImageView soda;
    @FXML
    ImageView cake;




    private void setItemScorePositiv() {
        itemScore = itemScore + 1;
        System.out.println(itemScore);
    }

    private void setItemScoreNegativ() {
        itemScore = itemScore -1;
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
    private void bellpeper(MouseEvent event) {
        setItemScorePositiv();
        bellpeper.setVisible(false);
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
}

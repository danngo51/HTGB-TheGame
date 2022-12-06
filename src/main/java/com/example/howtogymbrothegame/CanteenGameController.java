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


    ImageView tomato;
    ImageView cucumber;
    ImageView steakMeat;
    ImageView watermelon;
    ImageView carrot;
    ImageView chicken;
    ImageView bellpeper;
    ImageView rice;
    ImageView candy;
    ImageView soda;
    ImageView cake;


    private void tomato(MouseEvent event) {
        setItemScorePositiv();

    }

    private void cucumber(MouseEvent event) {
        setItemScorePositiv();
    }

    private void steakMeat(MouseEvent event) {
        setItemScorePositiv();
    }

    private void watermelon(MouseEvent event) {
        setItemScorePositiv();
    }

    private void carrot(MouseEvent event) {
        setItemScorePositiv();
    }

    private void chicken(MouseEvent event) {
        setItemScorePositiv();
    }

    private void bellpeper(MouseEvent event) {
        setItemScorePositiv();
    }

    private void rice(MouseEvent event) {
        setItemScoreNegativ();
    }

    private void candy(MouseEvent event) {
        setItemScoreNegativ();
    }

    private void soda(MouseEvent event) {
        setItemScoreNegativ();
    }

    private void cake(MouseEvent event) {
        setItemScoreNegativ();
    }

    private void setItemScorePositiv() {
        this.itemScore = itemScore + 1;
    }

    private void setItemScoreNegativ() {
        this.itemScore = itemScore - 1;
    }

}

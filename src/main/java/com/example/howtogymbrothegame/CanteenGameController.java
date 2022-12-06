package com.example.howtogymbrothegame;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CanteenGameController {

    Stage stage;
    @FXML
    private AnchorPane scenePane;

    @FXML
    private void closeGame(){
        stage = (Stage) scenePane.getScene().getWindow();
        stage.close();
    }




}

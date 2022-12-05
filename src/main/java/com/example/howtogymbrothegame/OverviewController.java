package com.example.howtogymbrothegame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;

public class OverviewController {
    //connection to PlayerManager
    PlayerManager playerOverview = PlayerManager.getInstance();

    //method to update all labels
    public void displayOverview(){
        overviewTab1();
        overviewTab2();
        overviewTab3();
        overviewTab4();
        overviewTab5();
    }


    //Attributes and methods for tab1
    @FXML
    private Tab stats;
    @FXML
    private Label heartOverview;
    @FXML
    private Label lungsOverview;
    @FXML
    private Label liverOverview;
    @FXML
    private Label pancreasOverview;

    private void overviewTab1(){
        heartOverview.setText(String.valueOf(playerOverview.getHeart()));
        lungsOverview.setText(String.valueOf(playerOverview.getLungs()));
        liverOverview.setText(String.valueOf(playerOverview.getLiver()));
        pancreasOverview.setText(String.valueOf(playerOverview.getPancreas()));
    }


    //Attributes and methods for tab2
    @FXML
    private Tab stats3mo;
    @FXML
    private Label heartOverview3mo;
    @FXML
    private Label lungsOverview3mo;
    @FXML
    private Label liverOverview3mo;
    @FXML
    private Label pancreasOverview3mo;

    private void overviewTab2(){
        heartOverview3mo.setText(String.valueOf(playerOverview.getHeart3mo()));
        lungsOverview3mo.setText(String.valueOf(playerOverview.getLungs3mo()));
        liverOverview3mo.setText(String.valueOf(playerOverview.getLiver3mo()));
        pancreasOverview3mo.setText(String.valueOf(playerOverview.getPancreas3mo()));
    }


    //Attributes and methods for tab3
    @FXML
    private Tab stats6mo;
    @FXML
    private Label heartOverview6mo;
    @FXML
    private Label lungsOverview6mo;
    @FXML
    private Label liverOverview6mo;
    @FXML
    private Label pancreasOverview6mo;

    private void overviewTab3(){
        heartOverview6mo.setText(String.valueOf(playerOverview.getHeart6mo()));
        lungsOverview6mo.setText(String.valueOf(playerOverview.getLungs6mo()));
        liverOverview6mo.setText(String.valueOf(playerOverview.getLiver6mo()));
        pancreasOverview6mo.setText(String.valueOf(playerOverview.getPancreas6mo()));
    }



    //Attributes and methods for tab4
    @FXML
    private Tab stats9mo;
    @FXML
    private Label heartOverview9mo;
    @FXML
    private Label lungsOverview9mo;
    @FXML
    private Label liverOverview9mo;
    @FXML
    private Label pancreasOverview9mo;

    private void overviewTab4(){
        heartOverview9mo.setText(String.valueOf(playerOverview.getHeart9mo()));
        lungsOverview9mo.setText(String.valueOf(playerOverview.getLungs9mo()));
        liverOverview9mo.setText(String.valueOf(playerOverview.getLiver9mo()));
        pancreasOverview9mo.setText(String.valueOf(playerOverview.getPancreas9mo()));
    }



    //Attributes and methods for tab5
    @FXML
    private Tab stats12mo;
    @FXML
    private Label heartOverview12mo;
    @FXML
    private Label lungsOverview12mo;
    @FXML
    private Label liverOverview12mo;
    @FXML
    private Label pancreasOverview12mo;

    private void overviewTab5(){
        heartOverview12mo.setText(String.valueOf(playerOverview.getHeart12mo()));
        lungsOverview12mo.setText(String.valueOf(playerOverview.getLungs12mo()));
        liverOverview12mo.setText(String.valueOf(playerOverview.getLiver12mo()));
        pancreasOverview12mo.setText(String.valueOf(playerOverview.getPancreas12mo()));
    }

}

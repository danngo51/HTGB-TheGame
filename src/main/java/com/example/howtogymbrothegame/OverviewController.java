package com.example.howtogymbrothegame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;

import java.io.IOException;

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
        heartOverview3mo.setText(String.valueOf(getHeart3mo()));
        lungsOverview3mo.setText(String.valueOf(getLungs3mo()));
        liverOverview3mo.setText(String.valueOf(getLiver3mo()));
        pancreasOverview3mo.setText(String.valueOf(getPancreas3mo()));
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
        heartOverview6mo.setText(String.valueOf(getHeart6mo()));
        lungsOverview6mo.setText(String.valueOf(getLungs6mo()));
        liverOverview6mo.setText(String.valueOf(getLiver6mo()));
        pancreasOverview6mo.setText(String.valueOf(getPancreas6mo()));
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
        heartOverview9mo.setText(String.valueOf(getHeart9mo()));
        lungsOverview9mo.setText(String.valueOf(getLungs9mo()));
        liverOverview9mo.setText(String.valueOf(getLiver9mo()));
        pancreasOverview9mo.setText(String.valueOf(getPancreas9mo()));
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
        heartOverview12mo.setText(String.valueOf(getHeart12mo()));
        lungsOverview12mo.setText(String.valueOf(getLungs12mo()));
        liverOverview12mo.setText(String.valueOf(getLiver12mo()));
        pancreasOverview12mo.setText(String.valueOf(getPancreas12mo()));
    }

    //Attributes and methods to show progress over the months
    //3 months
    private double lungs3mo = (playerOverview.getLungs()-50)*4*3+50;
    private double heart3mo = (playerOverview.getHeart()-50)*4*3+50;;
    private double liver3mo = (playerOverview.getLiver()-50)*4*3+50;;
    private double pancreas3mo = (playerOverview.getPancreas()-50)*4*3+50;;

    //6 months
    private double lungs6mo = (playerOverview.getLungs()-50)*4*6+50;
    private double heart6mo = (playerOverview.getLungs()-50)*4*6+50;
    private double liver6mo = (playerOverview.getLungs()-50)*4*6+50;
    private double pancreas6mo = (playerOverview.getLungs()-50)*4*6+50;

    //9 months
    private double lungs9mo = (playerOverview.getLungs()-50)*4*9+50;
    private double heart9mo = (playerOverview.getLungs()-50)*4*9+50;
    private double liver9mo = (playerOverview.getLungs()-50)*4*9+50;
    private double pancreas9mo = (playerOverview.getLungs()-50)*4*9+50;

    //12 months
    private double lungs12mo = (playerOverview.getLungs()-50)*4*12+50;
    private double heart12mo = (playerOverview.getLungs()-50)*4*12+50;
    private double liver12mo = (playerOverview.getLungs()-50)*4*12+50;
    private double pancreas12mo = (playerOverview.getLungs()-50)*4*12+50;


    public double getLungs3mo() {
        return Math.round(lungs3mo * 100.0) / 100.0;
    }
    public double getHeart3mo() {
        return Math.round(heart3mo * 100.0) / 100.0;
    }
    public double getLiver3mo() {
        return Math.round(liver3mo * 100.0) / 100.0;
    }
    public double getPancreas3mo() {
        return Math.round(pancreas3mo * 100.0) / 100.0;
    }
    public double getLungs6mo() {
        return Math.round(lungs6mo * 100.0) / 100.0;
    }
    public double getHeart6mo() {
        return Math.round(heart6mo * 100.0) / 100.0;
    }
    public double getLiver6mo() {
        return Math.round(liver6mo * 100.0) / 100.0;
    }
    public double getPancreas6mo() {
        return Math.round(pancreas6mo * 100.0) / 100.0;
    }
    public double getLungs9mo() {
        return Math.round(lungs9mo * 100.0) / 100.0;
    }
    public double getHeart9mo() {
        return Math.round(heart9mo * 100.0) / 100.0;
    }
    public double getLiver9mo() {
        return Math.round(liver9mo * 100.0) / 100.0;
    }
    public double getPancreas9mo() {
        return Math.round(pancreas9mo * 100.0) / 100.0;
    }
    public double getLungs12mo() {
        return Math.round(lungs12mo * 100.0) / 100.0;
    }
    public double getHeart12mo() {
        return Math.round(heart12mo * 100.0) / 100.0;
    }
    public double getLiver12mo() {
        return Math.round(liver12mo * 100.0) / 100.0;
    }
    public double getPancreas12mo() {
        return Math.round(pancreas12mo * 100.0) / 100.0;
    }

    //Switch to main hub
    @FXML
    private void backToMainHub(ActionEvent event) throws IOException {
        Door doorConnection = new Door();
        doorConnection.switchToMainHub(event);
    }



}

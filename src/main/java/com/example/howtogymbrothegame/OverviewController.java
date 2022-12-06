package com.example.howtogymbrothegame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Label;

import java.io.IOException;



public class OverviewController {
    //connection to PlayerManager
    PlayerManager playerOverview = PlayerManager.getInstance();

    //method to update all labels




    //Attributes and methods to show progress over the months
    //3 months
    private double lungs3mo = (playerOverview.getLungs()-50)*4*3+50;
    private double heart3mo = (playerOverview.getHeart()-50)*4*3+50;;
    private double liver3mo = (playerOverview.getLiver()-50)*4*3+50;;
    private double pancreas3mo = (playerOverview.getPancreas()-50)*4*3+50;;

    //6 months
    private double lungs6mo = (playerOverview.getLungs()-50)*4*6+50;
    private double heart6mo = (playerOverview.getHeart()-50)*4*6+50;
    private double liver6mo = (playerOverview.getLiver()-50)*4*6+50;
    private double pancreas6mo = (playerOverview.getPancreas()-50)*4*6+50;

    //9 months
    private double lungs9mo = (playerOverview.getLungs()-50)*4*9+50;
    private double heart9mo = (playerOverview.getHeart()-50)*4*9+50;
    private double liver9mo = (playerOverview.getLiver()-50)*4*9+50;
    private double pancreas9mo = (playerOverview.getPancreas()-50)*4*9+50;

    //12 months
    private double lungs12mo = (playerOverview.getLungs()-50)*4*12+50;
    private double heart12mo = (playerOverview.getHeart()-50)*4*12+50;
    private double liver12mo = (playerOverview.getLiver()-50)*4*12+50;
    private double pancreas12mo = (playerOverview.getPancreas()-50)*4*12+50;


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

    @FXML
    private Label headline;
    @FXML
    private Label heartOverview;
    @FXML
    private Label lungsOverview;
    @FXML
    private Label liverOverview;
    @FXML
    private Label pancreasOverview;


    //method to update all labels
    @FXML
    public void overviewNow(){
        headline.setText("Nuværende stats");
        heartOverview.setText(String.valueOf(playerOverview.getHeart()));
        lungsOverview.setText(String.valueOf(playerOverview.getLungs()));
        liverOverview.setText(String.valueOf(playerOverview.getLungs()));
        pancreasOverview.setText(String.valueOf(playerOverview.getPancreas()));
    }
    @FXML
    private void overview3mo(){
        headline.setText("Efter 3 måneder");
        heartOverview.setText(String.valueOf(getHeart3mo()));
        lungsOverview.setText(String.valueOf(getLungs3mo()));
        liverOverview.setText(String.valueOf(getLiver3mo()));
        pancreasOverview.setText(String.valueOf(getPancreas3mo()));
    }
    @FXML
    private void overview6mo(){
        headline.setText("Efter 6 måneder");
        heartOverview.setText(String.valueOf(getHeart6mo()));
        lungsOverview.setText(String.valueOf(getLungs6mo()));
        liverOverview.setText(String.valueOf(getLiver6mo()));
        pancreasOverview.setText(String.valueOf(getPancreas6mo()));
    }
    @FXML
    private void overview9mo(){
        headline.setText("Efter 9 måneder");
        heartOverview.setText(String.valueOf(getHeart9mo()));
        lungsOverview.setText(String.valueOf(getLungs9mo()));
        liverOverview.setText(String.valueOf(getLiver9mo()));
        pancreasOverview.setText(String.valueOf(getPancreas9mo()));
    }
    @FXML
    private void overview12mo(){
        headline.setText("Efter 12 måneder");
        heartOverview.setText(String.valueOf(getHeart12mo()));
        lungsOverview.setText(String.valueOf(getLungs12mo()));
        liverOverview.setText(String.valueOf(getLiver12mo()));
        pancreasOverview.setText(String.valueOf(getPancreas12mo()));
    }

}

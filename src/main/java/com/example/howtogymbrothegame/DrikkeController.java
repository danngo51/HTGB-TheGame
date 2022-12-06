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
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DrikkeController implements Initializable {
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

    //This methode is used to update the player stats
    public void displayStats(String pancreasVal, String liverVal, String heartVal, String lungsVal) {
        pancreas.setText(pancreasVal);
        liver.setText(liverVal);
        heart.setText(heartVal);
        lungs.setText(lungsVal);
    }

    ObservableList list= FXCollections.observableArrayList();
    @FXML
    private ChoiceBox<String> myChoiceBox;
    @FXML
    private Text tekstDrikke;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadData();
        myChoiceBox.setValue("0 øl");
    }

    @FXML
    private void displayValue(ActionEvent event){
        String beer = myChoiceBox.getValue();
        if (beer.equals("0 øl")){
            tekstDrikke.setText("EEEEEE.");
        }
        else if (beer.equals("1 øl")){
            tekstDrikke.setText("AAAAAA");
        }
        else if (beer.equals("2 øl")){
            tekstDrikke.setText("UUUUU");
        }
        else {
            tekstDrikke.setText("IIIIII");
        }
    }
    private void loadData(){
        list.removeAll(list);
        String a = "0 øl";
        String b = "1 øl";
        String c = "2 øl";
        String d = "3 øl";
        list.addAll(a, b, c, d);
        myChoiceBox.getItems().addAll(list);
    }
    @FXML
    public void switchtoWeekDays(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Weekday.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

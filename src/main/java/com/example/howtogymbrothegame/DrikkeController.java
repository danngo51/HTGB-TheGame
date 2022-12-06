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
import javafx.scene.text.Text;
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
    }

    @FXML
    private void displayValue(ActionEvent event){
        String beer = myChoiceBox.getValue();
        if (beer.equals("0 øl")){
            tekstDrikke.setText("Du har valgt at drikke 0 øl. Det var et super godt valg!" + "\n" + "\n" + "Da du har valgt at lade være med at drikke, har du forbedret adskillige ting ved dit helbred." + "\n" + "\n" + "Du kan eksempelvis opleve, at dine søvnforstyrrelser forsvinder efter nogle måneder uden at indtage alkohol." + "\n" + "Kroppens stressberedskab bliver også normalt 1-4 uger efter ophør. ");
        }
        else if (beer.equals("1 øl")){
            tekstDrikke.setText("Du har valgt at drikke 1 øl. Det er helt i orden at drikke én genstand alkohol en gang i mellem!" + "\n" + "\n" + "Risikoen for skader på grund af alkohol øges, hvis man drikker mere end 10 genstande om ugen, og når man drikker 4 genstande eller mere ved en enkelt lejlighed." + "\n" + "\n" + "Der er dog undersøgelser, som viser, at der ikke er nogen nedre grænse for, hvor lidt man skal drikke, for at øge risikoen for brystkræft.");
        }
        else if (beer.equals("2 øl")){
            tekstDrikke.setText("Du har valgt at drikke 2 øl." + "\n" + "\n" + "Du nærmer dig grænsen for øget risiko for skader på grund af indtagelse af alkohol." +"\n" + "\n" +"Ammende mødre anbefales at være tilbageholdende med at drikke alkohol og derfor ikke drikke mere end én genstand ved en begivenhed eller på en dag.");
        }
        else if (beer.equals("3 øl")){
            tekstDrikke.setText("Du har valgt at drikke 3 øl." + "\n" + "\n" + "Et langvarigt indtag på mere end 30 gram alkohol (Altså 3 øl) dagligt vil øge risikoen for leversygdomme." + "\n" + "\n" + "Konsekvenserne ved for højt alkoholindtag kan føre til lever-hepatitis (Inflammatorisk tilstand i leveren), som kan føre til svimmelhed, mangel på appetit, massivt vægttab og Gulsot (Hud og slimhinder bliver gullige).");
        }
        else {
            tekstDrikke.setText("Du har valgt at drikke 4 øl." + "\n" + "\n" + "Du har nu officielt øget din risiko for adskillige sygdomme." + "\n" + "\n" + "Hvis du drikker store mængder alkohol gennem længere tid, stiger risikoen for at udvikle mere end 200 medicinske tilstande og sygdomme" + "\n" + "\n" + "Det er i sær sygdomme i hjernen og nervesystemet, leversygomme, betændelse i bugspytkirtlen, forhøjet blodtryk blødninger og slagtilfælde, der er tale om." + "\n" + "\n" + "Du har derfor nu mistet 0,1 i alle dine stats.");
        }
    }
    private void loadData(){
        list.removeAll(list);
        String a = "0 øl";
        String b = "1 øl";
        String c = "2 øl";
        String d = "3 øl";
        String e = "4 øl";
        list.addAll(a, b, c, d, e);
        myChoiceBox.getItems().addAll(list);
        myChoiceBox.setOnAction(this::getBeer);
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
    private void drinkingBeer() {
        player.setLiver(player.getYesLiver());
        this.liver.setText(String.valueOf(player.getLiver()));
    }

    boolean answered = false;

    public void getBeer(ActionEvent event) {
        String myBeer = myChoiceBox.getValue();

        if (answered == false) {
            if (myBeer.equals("0 øl")) {
                drinkingBeer();
                answered = true;
            } else if (myBeer.equals("1 øl")) {
                drinkingBeer();
                answered = true;
            } else if (myBeer.equals("2 øl")) {
                drinkingBeer();
                answered = true;
            } else if (myBeer.equals("3 øl")) {
                drinkingBeer();
                answered = true;
            } else if (myBeer.equals("4 øl")) {
                drinkingBeer();
                answered = true;
            } else {
                this.liver.setText(String.valueOf(player.getLiver()));
                answered = true;
            }
        }
    }

}

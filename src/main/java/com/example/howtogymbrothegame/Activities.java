package com.example.howtogymbrothegame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class Activities {

    private Parent root;
    private Stage stage;
    private Scene scene;

    public void infoSmoking(){
        System.out.println("langvarigt rygning i mellem 1-4 cigaretter dagligt vil signifikant øge risikoen for at dø af hjertesygdomme.");
        System.out.println("Konsekvenserne ved for højt tobaksindtag kan føre iskemi, som nedsætter blodtilgang til dele af hjertemusklen.");
        System.out.println("Og kan derudover medføre til alle former for cancer");
        System.out.println("Vil du virkelig udsætte dig selv for det?");
    }

    @FXML
    public void switchtoWeekDays(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Weekday.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void smokingAsk(){
        //getting access to questions by creation an object
        action = "ryge";
        organ = "lunger";
        String smoking = "smoking";
        askQuestions(smoking);
    }

    public void infoDrinking() {
        System.out.println("Et langvarigt indtag på mere end 30 gram alkohol (3 øl) dagligt vil øge risikoen for leversygdomme.");
        System.out.println("Konsekvenser ved for højt alkoholindtag kan føre til lever-hepatitis (inflammatorisk tilstand i leveren),");
        System.out.println("som kan føre til svimmelhed, mangel af appetit , massivt vægttab og Gulsot(hud og slimhinder bliver gullige)");
        System.out.println("Vil du virkelig udsætte dig selv for det?");
    }

    public void drinkingAsk() {
        //getting access to questions by creation an object
        action = "drikke";
        organ = "lever";
        String drinking = "drinking";
        askQuestions(drinking);
    }

    public void infoDrugs() {
        System.out.println("Regelmæssigt brug af stoffer vil øge risikoen for op til flere organsygdomme!");
        System.out.println("Konsekvenser ved brugen af stoffer vil blandt andet føre til: ");
        System.out.println("Lever: kan medføre mørk urin, smerte i coremuskler, opbygning af væske i bughulen.");
        System.out.println("Hjerte: kan give hjerteklapsbetændelse og blodpropper.");
        System.out.println("Bugspytskirtlen: kan give betændelse i bugspytskirtlen, ekstreme smerter.");
        System.out.println("Lunger: kan forøge risiko for luftvejsinfektioner, som kan være dødelige for folk med helbredsproblemer.");
        System.out.println("Vil du virkelig udsætte dig selv for det?");
    }

    public void drugsAsk(){
        //getting access to questions by creation an object
        action = "stoffer";
        organ = "alle organer";
        String drugs = "drugs";
        askQuestions(drugs);
    }

    public void infoFitness() {
        System.out.println("Regelmæssigt fysisk aktivitet har mange helbredsfordele, eksempler kunne være:");
        System.out.println("Øget lunge- og hjertefunktion, sænke risikoen for prædiabetes og hjertesygdomme.");
        System.out.println("Der er ikke nogen ulemper, så kom igang makker!");
    }

    public void fitnessAsk(){
        //getting access to questions by creation an object
        action = "dyrke fitness";
        organ = "alle organer";
        String fitness = "fitness";
        askQuestions(fitness);
    }

    public void infoEating() {
        System.out.println("langvarigt indtag af dårlig kost, forhøj fedtprocent og ernæring dagligt kan øge risikoen for prædiabetes");
        System.out.println(" ");
        System.out.println("Vil du virkelig udsætte dig selv for det?");
    }

    public void eatingAsk(){
        //getting access to questions by creation an object
        action = "spise";
        organ = "bugspytkirtel og hjerte";
        String eating = "eating";
        askQuestions(eating);
    }

    public void printStats() {
        Player.getPlayerStats();
    }

    public void printInfo(String handling){
        switch (handling) {
            case "smoking" -> infoSmoking();
            case "drinking" -> infoDrinking();
            case "drugs" -> infoDrugs();
            case "eating" -> infoEating();
            case "fitness" -> infoFitness();
        } //end of switch case
    } //end of printInfo


    //Attributes som bruges til at stille spørgsmål i rummene.
    String action;
    String organ;

    //'PlayerAnswer' is used to store the players decision.
    private String PlayerAnswer;

    //Creating a player with the score of 50 on all stats
    PlayerManager Player = new PlayerManager(50.000,50.000,50.000,50.000);


    // En metode, som stiller dig spørgsmål i rummene
    public void askQuestions (String handling) {
        System.out.println("----------------------------------------------------------");
        System.out.println("           Do you want to " +action+ ", yes or no?"        );
        System.out.println("----------------------------------------------------------");
        System.out.println("          Consequences of your current actions are:"       );
        System.out.println("----------------------------------------------------------");
        printInfo(handling);
        System.out.println("----------------------------------------------------------");
        System.out.println("   stats: " +action+ " will cause -1 point on "+organ  );
        System.out.println("          for each day                                ");
        System.out.println("----------------------------------------------------------");
    } //end of askQ


    //The methods for creating a scanner and using the user input.
    /* All the methods that starts with 'answer' is
     * using 'PlayerAnswer' to determine how the player
     * stat should be effected.
     */


    //Answers
    public void answerDrinking(){
        if (PlayerAnswer.equals("yes")){
            Player.setNewLiver(Player.getYesLiver());
        }
        else if (PlayerAnswer.equals("no")){
            Player.setNewLiver(Player.getNoLiver());
        }
    }

    public void answerDrugs(){
        if (PlayerAnswer.equals("yes")){
            Player.setNewLungs(Player.getYesLungs());
            Player.setNewLiver(Player.getYesLiver());
            Player.setNewHeart(Player.getYesHeart());
            Player.setNewPancreas(Player.getYesPancreas());
        }
        else if (PlayerAnswer.equals("no")){
            Player.setNewLungs(Player.getNoLungs());
            Player.setNewLiver(Player.getNoLiver());
            Player.setNewHeart(Player.getNoHeart());
            Player.setNewPancreas(Player.getNoPancreas());
        }
    }

    public void answerFitness(){
        if (PlayerAnswer.equals("no")){
            Player.setNewLungs(Player.getYesLungs());
            Player.setNewLiver(Player.getYesLiver());
            Player.setNewHeart(Player.getYesHeart());
            Player.setNewPancreas(Player.getYesPancreas());
        }
        else if (PlayerAnswer.equals("yes")){
            Player.setNewLungs(Player.getNoLungs());
            Player.setNewLiver(Player.getNoLiver());
            Player.setNewHeart(Player.getNoHeart());
            Player.setNewPancreas(Player.getNoPancreas());
        }
    }

    public void answerEating(){
        if (PlayerAnswer.equals("yes")){
            Player.setNewHeart(Player.getYesHeart());
            Player.setNewPancreas(Player.getYesPancreas());
        }
        else if (PlayerAnswer.equals("no")){
            Player.setNewHeart(Player.getNoHeart());
            Player.setNewPancreas(Player.getNoPancreas());
        }
    }

    public void answerSmoking(){
        if (PlayerAnswer.equals("yes")){
            Player.setNewLungs(Player.getYesLungs());
        }
        else if (PlayerAnswer.equals("no")){
            Player.setNewLungs(Player.getNoLungs());
        }
    }

    public void scanner(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Answer" + "\n" + "> ");
        PlayerAnswer = reader.nextLine();
        if (PlayerAnswer.equals("yes")) {
            System.out.println("You answered: " + PlayerAnswer);
        } else if (PlayerAnswer.equals("no")) {
            System.out.println("You answered: " + PlayerAnswer);
        } else {
            System.out.println("I dont understand, please answer with 'yes' or 'no'");
            System.out.print("Answer" + "\n" + "> ");
            PlayerAnswer = reader.nextLine();

            while (!"yes".equals(PlayerAnswer) & !"no".equals(PlayerAnswer)) {
                System.out.println("I dont understand, please answer with 'yes' or 'no'");
                System.out.print("Answer" + "\n" + "> ");
                PlayerAnswer = reader.nextLine();
            }
            if ("yes".equals(PlayerAnswer)) {
                System.out.println("You answered: " + PlayerAnswer);
            }
        }
    }  //end of scanner

}
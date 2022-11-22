package HowToGymBro;

import com.example.howtogymbrothegame.PlayerManager;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Room {
    private String description;
    private HashMap<String, Room> exits;

    //Attributter til de forskellige handlinger og organer
    static String action;
    static String organ;

    //'PlayerAnswer' is used to store the players decision.
    private static String PlayerAnswer;

    //Creating a player with the score of 50 on all stats
    static PlayerManager Player = new PlayerManager(50.000,50.000,50.000,50.000);

    public Room(String description) {
        this.description = description;
        exits = new HashMap<String, Room>();
    }

    public void setExit(String direction, Room neighbor) {
        exits.put(direction, neighbor);
    }

    public String getLongDescription() {
        return "It is " + description + ".\n" + getExitString();
    }

    private String getExitString() {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for (String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    public Room getExit(String direction) {
        return exits.get(direction);
    }

    public static void printStats(){
       Player.getPlayerStats();
    }

    public static void printInfo(String handling){
        switch (handling) {
            case "smoking" -> Smoking.infoSmoking();
            case "drinking" -> Drinking.infoDrinking();
            case "drugs" -> Drugs.infoDrugs();
            case "eating" -> Eating.infoEating();
            case "fitness" -> Fitness.infoFitness();
        } //end of switch case
    } //end of printInfo

    // En metode, som stiller dig spørgsmål i rummene
    public static void askQuestions(String handling) {
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
    public static void answerDrinking(){
        if (PlayerAnswer.equals("yes")){
            Player.setNewLiver(Player.getYesLiver());
        }
        else if (PlayerAnswer.equals("no")){
            Player.setNewLiver(Player.getNoLiver());
        }
    }

    public static void answerDrugs(){
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

    public static void answerFitness(){
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

    public static void answerEating(){
        if (PlayerAnswer.equals("yes")){
            Player.setNewHeart(Player.getYesHeart());
            Player.setNewPancreas(Player.getYesPancreas());
        }
        else if (PlayerAnswer.equals("no")){
            Player.setNewHeart(Player.getNoHeart());
            Player.setNewPancreas(Player.getNoPancreas());
        }
    }

    public static void answerSmoking(){
        if (PlayerAnswer.equals("yes")){
            Player.setNewLungs(Player.getYesLungs());
        }
        else if (PlayerAnswer.equals("no")){
            Player.setNewLungs(Player.getNoLungs());
        }
    }

    public static void scanner(){
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
} //end of class

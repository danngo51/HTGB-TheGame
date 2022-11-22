package com.example.howtogymbrothegame;

public class PlayerManager {
    //ATTRIBUTES
    //Stats
    private double lungs;
    private double heart;
    private double liver;
    private double pancreas;

    //Saying yes or no to the question
    //Use the choices to add or decrease the number.

    //Lungs
    private final double yesLungs = -0.10;
    private final double noLungs = 0.10;
    private double yesAllLungs;
    private double noAllLungs;


    //Heart
    private final double yesHeart = -0.10;
    private final double noHeart = 0.10;
    private double yesAllHeart;
    private double noAllHeart;

    //Liver
    private final double yesLiver = -0.10;
    private final double noLiver = 0.10;
    private double yesAllLiver;
    private double noAllLiver;

    //Pancreas
    private final double yesPancreas = -0.10;
    private final double noPancreas = 0.10;
    private double yesAllPancreas;
    private double noAllPancreas;


    //Constructor for player
    //A player is created in 'Room'
    public PlayerManager(double lungs, double heart, double liver,
                         double pancreas) {
        this.lungs = lungs;
        this.heart = heart;
        this.liver = liver;
        this.pancreas = pancreas;
    } //end of PlayerManager


    @Override
    public String toString() {
        return "Spiller stats:" + "hjerte=" + heart +
                "lunger=" + lungs + ", lever=" + liver + "bugspytkirtlen=" + pancreas;
    } // end of toString


    //Setters and getters for the attributes
    //Setter
    //USE THESE SETTERS!! (there is some under, but they are used in this one)
    public void setNewLungs(double choice) {
        setLungs(choice);
        if (choice == getYesLungs()){
            setYesLungs(choice);
        }else if (choice == getNoLungs()){
            setNoLungs(choice);
        }
    }

    public void setNewHeart(double choice) {
        setHeart(choice);
        if (choice == getYesHeart()){
            setYesHeart(choice);
        }else if (choice == getNoHeart()){
            setNoHeart(choice);
        }
    }

    public void setNewLiver(double choice) {
        setLiver(choice);
        if (choice == getYesLiver()){
            setYesLiver(choice);
        }else if (choice == getNoLiver()){
            setNoLiver(choice);
        }
    }

    public void setNewPancreas(double choice) {
        setPancreas(choice);
        if (choice == getYesPancreas()){
            setYesPancreas(choice);
        }else if (choice == getNoPancreas()){
            setNoPancreas(choice);
        }
    }


    //Setters
    //DO NOT USE THESE
    public void setLungs(double choice) {
        this.lungs = this.lungs + choice;
    }

    public void setHeart(double choice) {
        this.heart = this.heart + choice;
    }

    public void setLiver(double choice) {
        this.liver = this.liver + choice;
    }

    public void setPancreas(double choice) {
        this.pancreas = this.pancreas + choice;
    }

    public void setYesLungs(double choice) {
        this.yesAllLungs = this.yesAllLungs + choice;
    }

    public void setYesHeart(double choice) {
        this.yesAllHeart = this.yesAllHeart + choice;
    }

    public void setYesLiver(double choice) {
        this.yesAllLiver = this.yesAllLiver + choice;
    }

    public void setYesPancreas(double choice) {
        this.yesAllPancreas = this.yesAllPancreas + choice;
    }

    public void setNoLungs(double choice) {
        this.noAllLungs = this.noAllLungs + choice;
    }

    public void setNoHeart(double choice) {
        this.noAllHeart = this.noAllHeart + choice;
    }

    public void setNoLiver(double choice) {
        this.noAllLiver = this.noAllLiver + choice;
    }

    public void setNoPancreas(double choice) {
        this.noAllPancreas = this.noAllPancreas + choice;
    }


    //GETTERS
    //DO NOT TOUCH THIS BOX PLEASE!! The space looks funny,
    //but when it gets printed out it looks better
    public void getPlayerStats() {
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("| Her er dine nuværende stats: |");
        System.out.println("--------------------------------");
        System.out.println("| Lunger:          "+getLungs()+"        |");
        System.out.println("| Hjerte:          "+getHeart()+"        |");
        System.out.println("| Lever:           "+getLiver()+"        |");
        System.out.println("| Bugspytkirtel:   "+getPancreas()+"        |");
        System.out.println("--------------------------------");
    }
    //GETTERS
    /*The math.round and *100.0 /100.0, is an easy fix to rounding.
    * The equation makes sure that if the decimals is over 2 it will round
    * correctly. (Example 50.226 will display as 50.23)
    */
    public double getLungs() {
        return Math.round(lungs * 100.0) / 100.0;
    }

    public double getHeart() {
        return Math.round(heart * 100.0) / 100.0;
    }

    public double getLiver() {
        return Math.round(liver * 100.0) / 100.0;
    }

    public double getPancreas() {
        return Math.round(pancreas * 100.0) / 100.0;
    }

    public double getYesLungs() {
        return yesLungs;
    }

    public double getNoLungs() {
        return noLungs;
    }

    public double getYesAllLungs() {
        return yesAllLungs;
    }

    public double getNoAllLungs() {
        return noAllLungs;
    }

    public double getYesHeart() {
        return yesHeart;
    }

    public double getNoHeart() {
        return noHeart;
    }

    public double getYesAllHeart() {
        return yesAllHeart;
    }

    public double getNoAllHeart() {
        return noAllHeart;
    }

    public double getYesLiver() {
        return yesLiver;
    }

    public double getNoLiver() {
        return noLiver;
    }

    public double getYesAllLiver() {
        return yesAllLiver;
    }

    public double getNoAllLiver() {
        return noAllLiver;
    }

    public double getYesPancreas() {
        return yesPancreas;
    }

    public double getNoPancreas() {
        return noPancreas;
    }

    public double getYesAllPancreas() {
        return yesAllPancreas;
    }

    public double getNoAllPancreas() {
        return noAllPancreas;
    }
} //end of class

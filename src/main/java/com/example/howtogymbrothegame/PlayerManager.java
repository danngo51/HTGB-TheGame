package com.example.howtogymbrothegame;

public class PlayerManager {
    private PlayerManager(double lungs, double heart, double liver, double pancreas){
       this.lungs = lungs;
       this.heart = heart;
       this.liver = liver;
       this.pancreas = pancreas;

    }

    private static final PlayerManager instance = new PlayerManager(50, 50, 50, 50);

    public static PlayerManager getInstance(){
        return instance;
    }


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



    //Attributes and methods to show progress over the months
    //3 months
    private double lungs3mo = 3;
    private double heart3mo = 3;
    private double liver3mo = 3;
    private double pancreas3mo = 3;

    //6 months
    private double lungs6mo = 6;
    private double heart6mo = 6;
    private double liver6mo = 6;
    private double pancreas6mo = 6;

    //9 months
    private double lungs9mo = 9;
    private double heart9mo = 9;
    private double liver9mo = 9;
    private double pancreas9mo = 9;

    //12 months
    private double lungs12mo = 12;
    private double heart12mo = 12;
    private double liver12mo = 12;
    private double pancreas12mo = 12;

    //3 months - getters
    public double getLungs3mo() {
        return lungs3mo;
    }
    public double getHeart3mo() {
        return heart3mo;
    }
    public double getLiver3mo() {
        return liver3mo;
    }
    public double getPancreas3mo() {
        return pancreas3mo;
    }

    //6 months - getters
    public double getLungs6mo() {
        return lungs6mo;
    }
    public double getHeart6mo() {
        return heart6mo;
    }
    public double getLiver6mo() {
        return liver6mo;
    }
    public double getPancreas6mo() {
        return pancreas6mo;
    }

    //9 months - getters
    public double getLungs9mo() {
        return lungs9mo;
    }
    public double getHeart9mo() {
        return heart9mo;
    }
    public double getLiver9mo() {
        return liver9mo;
    }
    public double getPancreas9mo() {
        return pancreas9mo;
    }

    //12 months - getters
    public double getLungs12mo() {
        return lungs12mo;
    }
    public double getHeart12mo() {
        return heart12mo;
    }
    public double getLiver12mo() {
        return liver12mo;
    }
    public double getPancreas12mo() {
        return pancreas12mo;
    }
} //end of class

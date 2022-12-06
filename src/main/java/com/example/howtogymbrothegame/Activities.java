package com.example.howtogymbrothegame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Activities {

    private Parent root;
    private Stage stage;
    private Scene scene;

    //Labels in the activity rooms
    @FXML
    private Label pancreas;
    @FXML
    private Label liver;
    @FXML
    private Label heart;
    @FXML
    private Label lungs;

    @FXML
    private Text factsInfo;

    //Connection to PlayerManager and room access
    PlayerManager player = PlayerManager.getInstance();

    //This has to be public, so it can be used in other classes.
    //This methode is used to update the player stats

    public void displayStats(String pancreasVal, String liverVal, String heartVal, String lungsVal) {
        pancreas.setText(pancreasVal);
        liver.setText(liverVal);
        heart.setText(heartVal);
        lungs.setText(lungsVal);
    }

    @FXML
    public void switchtoWeekDays(MouseEvent event) throws IOException {
        Door door = new Door();
        door.test(event);
    }


    public void infoSmoking() {
        System.out.println("Langvarig rygning på mellem 1-4 cigaretter dagligt vil signifikant øge risikoen for at dø af hjertesygdomme.");
        System.out.println("Konsekvenserne ved for højt tobaksindtag kan føre til iskæmi, som nedsætter blodtilgang til dele af hjertemusklen.");
        System.out.println("Dette kan derudover føre til adskillige former for cancer.");
        System.out.println("Rygning øger også risikoen for lungekræft og kronisk obstruktiv lungesygdom (KOL).");
        System.out.println("Vil du virkelig udsætte dig selv for det?");
    }

    public void smokingAsk() {
        //getting access to questions by creation an object
        action = "ryge";
        organ = "lunger";
        String smoking = "smoking";
        askQuestions(smoking);
    }

    public void infoDrinking() {
        System.out.println("Et langvarigt indtag på mere end 30 gram alkohol (Altså 3 øl) dagligt vil øge risikoen for leversygdomme.");
        System.out.println("Konsekvenserne ved for højt alkoholindtag kan føre til lever-hepatitis (Inflammatorisk tilstand i leveren),");
        System.out.println("som kan føre til svimmelhed, mangel på appetit, massivt vægttab og Gulsot (Hud og slimhinder bliver gullige).");
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
        System.out.println("Regelmæssig brug af stoffer vil øge risikoen for op til flere organsygdomme!");
        System.out.println("Konsekvenserne ved brugen af stoffer vil blandt andet føre til: ");
        System.out.println("Lever: Kan medføre mørk urin, smerter i coremuskler, opbygning af væske i bughulen.");
        System.out.println("Hjerte: Kan give hjerteklapsbetændelse og blodpropper.");
        System.out.println("Bugspytskirtlen: Kan give betændelse i bugspytskirtlen, som fører til ekstreme smerter.");
        System.out.println("Lunger: Kan forøge risiko for luftvejsinfektioner, som kan være dødelige for folk med helbredsproblemer.");
        System.out.println("Vil du virkelig udsætte dig selv for det?");
    }

    public void drugsAsk() {
        //getting access to questions by creation an object
        action = "stoffer";
        organ = "alle organer";
        String drugs = "drugs";
        askQuestions(drugs);
    }

    public void infoFitness() {
        System.out.println("Regelmæssig fysisk aktivitet har mange helbredsfordele, eksempler kunne være:");
        System.out.println("Øget lunge- og hjertefunktion og sænkning af risikoen for prædiabetes og hjertesygdomme.");
        System.out.println("Der er ikke nogen ulemper, så kom i gang makker!");
    }

    public void fitnessAsk() {
        //getting access to questions by creation an object
        action = "dyrke fitness";
        organ = "alle organer";
        String fitness = "fitness";
        askQuestions(fitness);
    }

    public void infoEating() {
        System.out.println("Et langvarigt indtag af dårlig kost kan føre til adskillige sygdomme.");
        System.out.println("Konsekvenserne ved en dårlig kost vil blandt andet føre til: ");
        System.out.println("Hjerte-kar-sygdomme, som kommer af forhøjet kolesterol, forhøjet blodtryk og overvægt.");
        System.out.println("Diabetes som kan føre til hyppige infektioner.");
        System.out.println("Kræft i spiserør, tyktarm, bryst, livmoder, bugspytskirtel og nyre, som kommer af overvægt.");
        System.out.println("Vil du virkelig udsætte dig selv for det?");
    }

    public void eatingAsk() {
        //getting access to questions by creation an object
        action = "spise";
        organ = "bugspytkirtel og hjerte";
        String eating = "eating";
        askQuestions(eating);
    }


    public void printInfo(String handling) {
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


    // En metode, som stiller dig spørgsmål i rummene
    public void askQuestions(String handling) {
        System.out.println("----------------------------------------------------------");
        System.out.println("              Vil du " + action + ", ja eller nej?");
        System.out.println("----------------------------------------------------------");
        System.out.println("         Konsekvenserne af dine nuværende handlinger er:");
        System.out.println("----------------------------------------------------------");
        printInfo(handling);
        System.out.println("----------------------------------------------------------");
        System.out.println("   Stats: " + action + " giver dig -1 point i " + organ);
        System.out.println("          for hver dag.                                ");
        System.out.println("----------------------------------------------------------");
    } //end of askQ


    //The methods for creating a scanner and using the user input.
    /* All the methods that starts with 'answer' is
     * using 'PlayerAnswer' to determine how the player
     * stat should be effected.
     */

    //Fitness


    //Rygeskur og drugs
    @FXML
    private Button btn1;
    @FXML
    private Button btnBack;
    @FXML
    private Button btn2;

    @FXML
    public void handleButtonEvent(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;
        if (event.getSource() == btn1) {
            lock1 = true;
            // Gør at når der klikkes på btn1 popper PopUpBoxRyge filen op.
            stage = new Stage();
            root = FXMLLoader.load(getClass().getResource("PopUpBoxRyge.fxml"));
            stage.setScene(new Scene(root));
            //Nedestående er så det bliver et pop-up
            stage.initModality(Modality.APPLICATION_MODAL);
            //Nedestående reminder "pop-up scenen" om, hvem der var den originale owner.
            stage.initOwner(btn1.getScene().getWindow());
            //Nedstående er til at den popper op og venter, indtil vi dismisser den
            stage.showAndWait();
        } else if (event.getSource() == btn2) {
            lock2 = true;
            // Gør at når der klikkes på btn1 popper PopUpBoxDrugs filen op.
            stage = new Stage();
            root = FXMLLoader.load(getClass().getResource("PopUpBoxDrugs.fxml"));
            stage.setScene(new Scene(root));
            //Nedestående er så det bliver et pop-up
            stage.initModality(Modality.APPLICATION_MODAL);
            //Nedestående reminder "pop-up scenen" om, hvem der var den originale owner.
            stage.initOwner(btn2.getScene().getWindow());
            //Nedstående er til at den popper op og venter, indtil vi dismisser den
            stage.showAndWait();
        } else {
            stage = (Stage) btnBack.getScene().getWindow();
            stage.close();
        }
    }

    //Låse til at kunne låse handlemulighederne indtil faktaboksene er læst op.
    boolean lock1 = false;
    boolean lock2 = false;
    @FXML
    private Text advarsel;

    @FXML
    private void smookingCigarets() {
        if (lock1 == true) {
            player.setHeart(player.getYesHeart());
            this.heart.setText(String.valueOf(player.getHeart()));
            player.setLungs(player.getYesLungs());
            this.lungs.setText(String.valueOf(player.getLungs()));
            advarsel.setText(" ");
        } else {
            advarsel.setText("Du har ikke læst fakta om rygning!");
        }
    }

    @FXML
    private void doingDrugs() {
        if (lock2 == true) {
        player.setHeart(player.getYesHeart());
        this.heart.setText(String.valueOf(player.getHeart()));
        player.setLiver(player.getYesLiver());
        this.liver.setText(String.valueOf(player.getLiver()));
        player.setPancreas(player.getYesPancreas());
        this.pancreas.setText(String.valueOf(player.getPancreas()));
        player.setLungs(player.getYesLungs());
        this.lungs.setText(String.valueOf(player.getLungs()));
            advarsel.setText(" ");
    } else {
            advarsel.setText("Du har ikke læst fakta om stoffer!");
        }
    }

    //pop-up boks

    //Drikke

    //Kantine
    @FXML
    public void CanteenGame(MouseEvent event){
        try {
            FXMLLoader canteenGameLoader = new FXMLLoader(getClass().getResource("canteenGame.fxml"));
            Parent gameRoot = (Parent) canteenGameLoader.load();

            stage = new Stage();
            stage.setScene(new Scene(gameRoot));
            stage.setTitle("canteenGame");
            stage.showAndWait();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    @FXML
    private void eatingUnhealthy(){
        String unHealthy = "Et langvarigt indtag af dårlig kost kan føre til adskillige sygdomme.\n \nKonsekvenserne ved en dårlig kost vil blandt andet føre til: \n \n";
        String unHealthyTwo = "Hjertekar-sygdomme, som kommer af forhøjet kolesterol, forhøjet blodtryk og overvægt. Chancen for diabetes type 2 bliver forøget ved at være overvægt, som kan føre til hyppige infektioner. \n \n";
        String unHealthyThree = "Kræft i spiserør, tyktarm, bryst, livmoder, bugspytskirtel og nyre, som kommer af overvægt. \n \nVil du virkelig udsætte dig selv for det?";
        player.setHeart(player.getYesHeart());
        this.heart.setText(String.valueOf(player.getHeart()));
        player.setPancreas(player.getYesPancreas());
        this.pancreas.setText(String.valueOf(player.getPancreas()));
        this.factsInfo.setText(unHealthy + unHealthyTwo + unHealthyThree);
    }
    @FXML
    private void eatingHealthy() {
        String healthy = "Du har truffet det rigtige valg. Det er vigtigt at spise varieret, hvilket betyder en kost der højt indhold af frugt, fibre, protein og grøntsager og lavt indhold af mættet fedt, salt, rødt kød og simple sukkerarter. \n \n";
        String healthyTwo = "Det vigtige ved at træffe sunde valg er at undgå at udvikle sygdomme, som kan komme ved en kost, der indeholder for meget af det, som har en negativ påvirkelse. \n \n";
        String healthyThree = "Det er også vigtig at pointere at lavt indhold betyder ikke at fjerne fuldstændigt, kosten skal kunne vedligeholdes";
        player.setHeart(player.getNoHeart());
        this.heart.setText(String.valueOf(player.getHeart()));
        player.setPancreas(player.getNoPancreas());
        this.pancreas.setText(String.valueOf(player.getPancreas()));
        this.factsInfo.setText(healthy + healthyTwo + healthyThree);
    }
        //Fitness

    @FXML
    private Text factsinfo;
    @FXML
    private void exercise(){
        String exercise = "Regelmæssig fysisk aktivitet har mange helbredsfordele, eksempler kunne være: \n \n";
        String exercise2 = "Øget lunge- og hjertefunktion og sænkning af risikoen for prædiabetes og hjertesygdomme. Det formindsker også sygedomme i muskler og led. Udover dette hjælper det også med at forebygge tyktarmskræft, brystkræft og livmoderkræft. \n \n";
        String exercise3 = "Der er ikke nogen ulemper, så kom i gang makker!";
        player.setHeart(player.getNoHeart());
        this.heart.setText(String.valueOf(player.getHeart()));
        player.setLungs(player.getNoLungs());
        this.lungs.setText(String.valueOf(player.getLungs()));
        player.setLiver(player.getNoLiver());
        this.liver.setText(String.valueOf(player.getLiver()));
        player.setPancreas(player.getNoPancreas());
        this.pancreas.setText(String.valueOf(player.getPancreas()));
        this.factsinfo.setText(exercise + exercise2 + exercise3);
    }
}
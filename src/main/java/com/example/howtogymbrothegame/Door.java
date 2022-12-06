package com.example.howtogymbrothegame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Door {
    private Stage stage;
    private Scene scene;
    private Parent root;

    PlayerManager player = PlayerManager.getInstance();

    //Attributes
    @FXML
    Label weekdayLabel;
    @FXML
    ImageView lockFriday;
    @FXML
    ImageView lockSaturday;
    @FXML
    ImageView lockSunday;

    //Variables to update player stats
    String pancreasVal = String.valueOf(player.getPancreas());
    String liverVal = String.valueOf(player.getLiver());
    String heartVal = String.valueOf(player.getHeart());
    String lungsVal = String.valueOf(player.getLungs());



    //Method to change scenes/doors
    public void switchToMainHub(ActionEvent event) throws IOException {
        FXMLLoader mainhubLoader = new FXMLLoader(getClass().getResource("MainHub.fxml"));
        root = mainhubLoader.load();

        Door mainhub = mainhubLoader.getController();
        if(access.isAccessFriday()){
           mainhub.lockFriday.setVisible(false);
        }
        if (access.isAccessSaturday()){
            mainhub.lockSaturday.setVisible(false);
        }
        if (access.isAccessSunday()){
            mainhub.lockSunday.setVisible(false);
        }

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void switchToCanteen(MouseEvent event) throws IOException {
        FXMLLoader canteenLoader = new FXMLLoader(getClass().getResource("Kantine.fxml"));
        root = canteenLoader.load();

        Activities canteen = canteenLoader.getController();
        canteen.displayStats(pancreasVal, liverVal, heartVal, lungsVal);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Kantine");
        stage.show();
    }

    public void switchToFitness(MouseEvent event) throws IOException {
        FXMLLoader fitnessLoader = new FXMLLoader(getClass().getResource("Fitness.fxml"));
        root = fitnessLoader.load();

        Activities fitness = fitnessLoader.getController();
        fitness.displayStats(pancreasVal, liverVal, heartVal, lungsVal);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Fitness");
        stage.show();
    }

    public void switchToSmoking(MouseEvent event) throws IOException {
        FXMLLoader smokingLoader = new FXMLLoader(getClass().getResource("Rygeskur.fxml"));
        root = smokingLoader.load();

        Activities smoking = smokingLoader.getController();
        smoking.displayStats(pancreasVal, liverVal, heartVal, lungsVal);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Smoking");
        stage.show();
    }

    public void switchToDrinking(MouseEvent event) throws IOException {
        FXMLLoader drinkingLoader = new FXMLLoader(getClass().getResource("Drikke.fxml"));
        root = drinkingLoader.load();

        DrikkeController drinking = drinkingLoader.getController();
        drinking.displayStats(pancreasVal, liverVal, heartVal, lungsVal);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Drikke");
        stage.show();
    }


    //Switching weekdays methods

    //Connection to RoomAccess
    RoomAccess access = RoomAccess.getInstance();


    public void switchToMTT(MouseEvent event) throws IOException {
        //Access to friday
        access.setAccessFriday(true);

        access.setmTT(true);
        access.setFriday(false);
        access.setSaturday(false);
        access.setSunday(false);

        //load stage
        FXMLLoader monToThurLoader = new FXMLLoader(getClass().getResource("Weekday.fxml"));
        root = monToThurLoader.load();

        Door monToThur = monToThurLoader.getController();
        monToThur.weekdayLabel.setText("Mandag til torsdag");

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Mandag til torsdag");
        stage.show();
    }


    public void switchToFriday(MouseEvent event) throws IOException {
        if (access.isAccessFriday()) {
            //allowing to enter saturday
            access.setAccessSaturday(true);

            access.setmTT(false);
            access.setFriday(true);
            access.setSaturday(false);
            access.setSunday(false);

            //load stage
            FXMLLoader fridayLoader = new FXMLLoader(getClass().getResource("Weekday.fxml"));
            root = fridayLoader.load();

            Door friday = fridayLoader.getController();
            friday.weekdayLabel.setText("Fredag");

            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Fredag");
            stage.show();
        }
        else {
            System.out.println("ingen adgang fredag");
        }
    }

    public void switchToSaturday(MouseEvent event) throws IOException {
        if (access.isAccessSaturday()){
            //allowing to enter sunday
            access.setAccessSunday(true);

            access.setmTT(false);
            access.setFriday(false);
            access.setSaturday(true);
            access.setSunday(false);

            //load stage
            FXMLLoader saturdayLoader = new FXMLLoader(getClass().getResource("Weekday.fxml"));
            root = saturdayLoader.load();

            Door saturday = saturdayLoader.getController();
            saturday.weekdayLabel.setText("Lørdag");

            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Lørdag");
            stage.show();
        }
        else {
            System.out.println("ingen adgang lørdag");
        }
    }

    public void switchToSunday(MouseEvent event) throws IOException {
        if (access.isAccessSunday()) {

            access.setmTT(false);
            access.setFriday(false);
            access.setSaturday(false);
            access.setSunday(true);

            //load stage
            FXMLLoader sundayLoader = new FXMLLoader(getClass().getResource("Weekday.fxml"));
            root = sundayLoader.load();

            Door sunday = sundayLoader.getController();
            sunday.weekdayLabel.setText("Søndag");

            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Søndag");
            stage.show();
        }
        else {
            System.out.println("ingen adgang søndag");
        }
    }

    public void overviewButton(ActionEvent event) throws IOException{
        //load stage
        FXMLLoader overviewLoader = new FXMLLoader(getClass().getResource("Overview.fxml"));
        root = overviewLoader.load();

        OverviewController overview = overviewLoader.getController();
        overview.overviewNow();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Overview");
        stage.show();
    }

    public void test (MouseEvent event) throws IOException{
        if (access.isSunday()){
            switchToSunday(event);
        } else if (access.isSaturday()){
            switchToSaturday(event);
        } else if (access.isFriday()){
            switchToFriday(event);
        } else {
            switchToMTT(event);
        }
    }

}
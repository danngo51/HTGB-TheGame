module com.example.howtogymbrothegame {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens com.example.howtogymbrothegame to javafx.fxml;
    exports com.example.howtogymbrothegame;
}
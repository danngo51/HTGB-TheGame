package HowToGymBro;

public class Fitness {
    public static void infoFitness() {
        System.out.println("Regelmæssig fysisk aktivitet har mange helbredsfordele, eksempler kunne være:");
        System.out.println("Øget lunge- og hjertefunktion og sænkning af risikoen for prædiabetes og hjertesygdomme.");
        System.out.println("Der er ikke nogen ulemper, så kom i gang makker!");
    }

    public static void ask(){
        //getting access to questions by creation an object
        Room.action = "dyrke fitness";
        Room.organ = "alle organer";
        String fitness = "fitness";
        Room.askQuestions(fitness);
    }
}

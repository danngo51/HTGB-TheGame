package HowToGymBro;

public class Fitness {
    public static void infoFitness() {
        System.out.println("Regelmæssigt fysisk aktivitet har mange helbredsfordele, eksempler kunne være:");
        System.out.println("Øget lunge- og hjertefunktion, ");
        System.out.println("FITNESS");
    }

    public static void ask(){
        //getting access to questions by creation an object
        Room.action = "dyrke fitness";
        Room.organ = "alle organer";
        String fitness = "fitness";
        Room.askQuestions(fitness);
    }
}

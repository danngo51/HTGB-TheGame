package HowToGymBro;

public class Eating {
    public static void infoEating() {
        System.out.println("Et langvarigt indtag af dårlig kost, forhøj fedtprocent og ernæring dagligt kan øge risikoen for prædiabetes");
        System.out.println(" ");
        System.out.println("Vil du virkelig udsætte dig selv for det?");
    }

    public static void ask(){
        //getting access to questions by creation an object
        Room.action = "spise";
        Room.organ = "bugspytkirtel og hjerte";
        String eating = "eating";
        Room.askQuestions(eating);
    }

}

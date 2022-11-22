package HowToGymBro;

public class Eating {
    public static void infoEating() {
        System.out.println("Et langvarigt indtag af dårlig kost kan føre til adskillige sygdomme.");
        System.out.println("Konsekvenserne ved en dårlig kost vil blandt andet føre til: ");
        System.out.println("Hjerte-kar-sygdomme, som kommer af forhøjet kolesterol, forhøjet blodtryk og overvægt.");
        System.out.println("Diabetes som kan føre til hyppige infektioner.");
        System.out.println("Kræft i spiserør, tyktarm, bryst, livmoder, bugspytskirtel og nyre, som kommer af overvægt.");
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

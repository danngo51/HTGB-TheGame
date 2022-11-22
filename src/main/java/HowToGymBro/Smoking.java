package HowToGymBro;

public class Smoking{
    public static void infoSmoking(){
        System.out.println("langvarigt rygning i mellem 1-4 cigaretter dagligt vil signifikant øge risikoen for at dø af hjertesygdomme.");
        System.out.println("Konsekvenserne ved for højt tobaksindtag kan føre iskemi, som nedsætter blodtilgang til dele af hjertemusklen.");
        System.out.println("Og kan derudover medføre til alle former for cancer");
        System.out.println("Vil du virkelig udsætte dig selv for det?");
    }

    public static void ask(){
        //getting access to questions by creation an object
        Room.action = "ryge";
        Room.organ = "lunger";
        String smoking = "smoking";
        Room.askQuestions(smoking);

    }
}

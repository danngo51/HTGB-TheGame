package HowToGymBro;

public class Smoking{
    public static void infoSmoking(){
        System.out.println("Langvarig rygning på mellem 1-4 cigaretter dagligt vil signifikant øge risikoen for at dø af hjertesygdomme.");
        System.out.println("Konsekvenserne ved for højt tobaksindtag kan føre til iskæmi, som nedsætter blodtilgang til dele af hjertemusklen.");
        System.out.println("Dette kan derudover føre til adskillige former for cancer.");
        System.out.println("Rygning øger også risikoen for lungekræft og kronisk obstruktiv lungesygdom (KOL).");
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

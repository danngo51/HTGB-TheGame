package HowToGymBro;

public class Drinking {
    public static void infoDrinking() {
        System.out.println("Et langvarigt indtag på mere end 30 gram alkohol (Altså 3 øl) dagligt vil øge risikoen for leversygdomme.");
        System.out.println("Konsekvenserne ved for højt alkoholindtag kan føre til lever-hepatitis (Inflammatorisk tilstand i leveren),");
        System.out.println("som kan føre til svimmelhed, mangel på appetit, massivt vægttab og Gulsot (Hud og slimhinder bliver gullige).");
        System.out.println("Vil du virkelig udsætte dig selv for det?");
    }

    public static void ask(){
        //getting access to questions by creating an object
        Room.action = "drikke";
        Room.organ = "lever";
        String drinking = "drinking";
        Room.askQuestions(drinking);
    }
}

package HowToGymBro;

public class Drugs {
    public static void infoDrugs() {
        System.out.println("Regelmæssig brug af stoffer vil øge risikoen for op til flere organsygdomme!");
        System.out.println("Konsekvenserne ved brugen af stoffer vil blandt andet føre til: ");
        System.out.println("Lever: Kan medføre mørk urin, smerter i coremuskler, opbygning af væske i bughulen.");
        System.out.println("Hjerte: Kan give hjerteklapsbetændelse og blodpropper.");
        System.out.println("Bugspytskirtlen: Kan give betændelse i bugspytskirtlen, som fører til ekstreme smerter.");
        System.out.println("Lunger: Kan forøge risiko for luftvejsinfektioner, som kan være dødelige for folk med helbredsproblemer.");
        System.out.println("Vil du virkelig udsætte dig selv for det?");
    }

    public static void ask(){
        //getting access to questions by creation an object
        Room.action = "stoffer";
        Room.organ = "alle organer";
        String drugs = "drugs";
        Room.askQuestions(drugs);
    }
}

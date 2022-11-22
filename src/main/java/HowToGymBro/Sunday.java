package HowToGymBro;

public class Sunday extends Room{
    public Sunday(String description) {
        super(description);
    }

    public static void question(){
        System.out.println("Søndag");

        //Asking questions and using a scanner to get an answer
        //and using that answer to change the stats
        Smoking.ask();
        scanner();
        answerSmoking();

        Drinking.ask();
        scanner();
        answerDrinking();

        Drugs.ask();
        scanner();
        answerDrugs();

        Fitness.ask();
        scanner();
        answerFitness();

        Eating.ask();
        scanner();
        answerEating();

        Player.getPlayerStats();
    } //end of question

}

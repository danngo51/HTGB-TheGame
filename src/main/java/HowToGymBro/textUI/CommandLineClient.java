package HowToGymBro.textUI;

import HowToGymBro.Command;
import HowToGymBro.Commands;
import HowToGymBro.Game;
import HowToGymBro.Room;

public class CommandLineClient {

    private Parser parser;
    private Game game;

    public CommandLineClient(){
        game = new Game();
        parser = new Parser(game);
    }

    public void play(){
        printWelcome();

        boolean finished = false;
        while (!finished){
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Tak for at spille spillet. På gensyn!");
    }


    private void printWelcome(){
        System.out.println();
        System.out.println("Velkommen til How To Gymbro!");
        System.out.println("Dette spil hjælper dig med at forstå ");
        System.out.println("konsekvenserne af dine daglige livsstilsvalg.");
        System.out.println("Hvert rum giver dig adskillige valg du skal træffe.");
        System.out.println("Dine valgmuligheder består af gode og dårlige valg for dit helbred.");
        System.out.println("Hvert valg du træffer kommer til at have en indvirkning på dit liv.");
        System.out.println("Vælg omhyggeligt!");
        System.out.println("Skriv '" + Commands.HELP +"' hvis du får brug for hjælp.");
        System.out.println();
        System.out.println(game.getRoomDescription());
    }
    private void printHelp(){
        for(String str : game.getCommandDescriptions()){
            System.out.println(str + " ");
        }
    }

    //Controller
    public boolean processCommand (Command command) {
        boolean wantToQuit = false;

        Commands commandWord = command.getCommandName();

        if (commandWord == Commands.UNKNOWN) {
            System.out.println("Jeg forstår ikke hvad du mener...");
            return false;
        }

        if (commandWord == Commands.HELP) {
            System.out.println("Du virker til at være forvirret.");
            System.out.println();
            System.out.println();
            System.out.println("Dine kommandoord er:");
            printHelp();
        } else if (commandWord == Commands.GO) {
            game.goRoom(command);
        } else if (commandWord == Commands.QUIT) {
            if (game.quit(command)) {
                wantToQuit = true;
            } else {
                System.out.println("Quit what?");
            }
        } else if (commandWord == Commands.STATS) {
            Room.printStats();
        }
        return wantToQuit;
    } //end of processCommand
} //end of class


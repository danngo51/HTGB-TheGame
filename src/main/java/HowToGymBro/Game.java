package HowToGymBro;

import java.util.List;
import java.util.Objects;

public class Game {
    private Room currentRoom;
    private CommandWords commands;

    //all the rooms
    private MainHub mainHub;
    private MonToThur mandagTilTorsdag;
    private Friday fredag;
    private Saturday lørdag;
    private Sunday søndag;
    private Overview overview;


    public Game() {
        createRooms();
        commands = new CommandWordsImplementation();
    }

    private void createRooms() {
        this.mainHub = new MainHub("MainHub");
        this.mandagTilTorsdag = new MonToThur("mandagTilTorsdag");
        this.fredag = new Friday("fredag");
        this.lørdag = new Saturday("lørdag");
        this.søndag = new Sunday("søndag");
        this.overview = new Overview("et samlet overblik over dine stats.");

        mainHub.setExit("mandagTilTorsdag", mandagTilTorsdag);
        mandagTilTorsdag.setExit("fredag", fredag);
        fredag.setExit("lørdag", lørdag);
        lørdag.setExit("søndag", søndag);
        søndag.setExit("Overview", overview);

        overview.setExit("MainHub", mainHub);

        currentRoom = mainHub;

    } //end of createRooms

    private void setExits (){
        mainHub.setExit("fredag",fredag);
        mainHub.setExit("lørdag", lørdag);
        mainHub.setExit("søndag", søndag);

        mandagTilTorsdag.setExit("MainHub", mainHub);
        mandagTilTorsdag.setExit("lørdag", lørdag);
        mandagTilTorsdag.setExit("søndag", søndag);
        mandagTilTorsdag.setExit("Overview", overview);

        fredag.setExit("MainHub", mainHub);
        fredag.setExit("mandagTilTorsdag", mandagTilTorsdag);
        fredag.setExit("søndag", søndag);
        fredag.setExit("Overview", overview);

        lørdag.setExit("MainHub", mainHub);
        lørdag.setExit("mandagTilTorsdag", mandagTilTorsdag);
        lørdag.setExit("fredag", fredag);
        lørdag.setExit("Overview", overview);

        søndag.setExit("MainHub", mainHub);
        søndag.setExit("mandagTilTorsdag", mandagTilTorsdag);
        søndag.setExit("fredag", fredag);
        søndag.setExit("lørdag", lørdag);
        søndag.setExit("Overview", overview);
    }

    public void goRoom(Command command) {
        if (!command.hasCommandValue()) {
            //No direction on command.
            //Can't continue with GO command.
            System.out.println("Gå hvorhen?");
            return;
        }
        String direction = command.getCommandValue();
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("Du kan ikke gå i den retning.");
        } else {
            currentRoom = nextRoom;
            if (Objects.equals(direction, "mandagTilTorsdag")){
                MonToThur.question();
            }
            if (Objects.equals(direction, "fredag")) {
                Friday.question();
            }
            if (Objects.equals(direction, "lørdag")){
                Saturday.question();
            }
            if (Objects.equals(direction, "søndag")){
                Sunday.question();
            }
            if (Objects.equals(direction, "Overview")) {
                setExits();
                Overview.overview();
            }
            System.out.println(currentRoom.getLongDescription());
        }
    } //end of goRoom

    public boolean quit(Command command) {
        if (command.hasCommandValue()) {
            return false;
        } else {
            return true;
        }
    }

    public String getRoomDescription() {
        return currentRoom.getLongDescription();
    }

    public CommandWords getCommands() {
        return commands;
    }

    public List<String> getCommandDescriptions() {
        return commands.getCommandWords();
    }

    public Command getCommand(String word1, String word2) {
        return new CommandImplementation(commands.getCommand(word1), word2);
    }
}


package HowToGymBro;

public enum Commands{
    GO("go"), QUIT("quit"), HELP("help"), UNKNOWN("?"), STATS("stats");

    private String commandName;

    Commands(String commandString) {
        this.commandName = commandString;
    }

    public String toString(){
        return commandName;
    }
}
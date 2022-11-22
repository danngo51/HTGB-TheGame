package HowToGymBro;

public class Overview extends Room {
    public Overview(String description) {
        super(description);
    }

    public static void overview() {
        Player.getPlayerStats();
    }
}

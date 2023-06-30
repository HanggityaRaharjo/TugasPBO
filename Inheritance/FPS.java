package Inheritance;

class FPS extends Game {
    private int playerCount;
    private String gameMode;

    public FPS(String title, String genre, int releaseYear, int playerCount, String gameMode) {
        super(title, genre, releaseYear);
        this.playerCount = playerCount;
        this.gameMode = gameMode;
    }

    public void shoot() {
        System.out.println("Bang! Bang!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Player Count: " + playerCount);
        System.out.println("Game Mode: " + gameMode);
    }
}
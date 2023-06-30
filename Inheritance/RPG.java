package Inheritance;
class RPG extends Game {
    private String protagonist;
    private int levelCap;

    public RPG(String title, String genre, int releaseYear, String protagonist, int levelCap) {
        super(title, genre, releaseYear);
        this.protagonist = protagonist;
        this.levelCap = levelCap;
    }

    public void levelUp() {
        System.out.println(protagonist + " has leveled up!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Protagonist: " + protagonist);
        System.out.println("Level Cap: " + levelCap);
    }
}

package Inheritance;
class Game {
    protected String title;
    protected String genre;
    protected int releaseYear;

    public Game(String title, String genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public void play() {
        System.out.println("Playing " + title);
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Release Year: " + releaseYear);
    }
}

// Child class inheriting from Game

package Inheritance;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.lang.*;
// Main class
public class Main {
    public static int getMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Menu Game=====");
        System.out.println("[1] FPS");
        System.out.println("[2] RPG");
        System.out.print("Pilih menu: ");
        int userInput = sc.nextInt();
        return userInput;
    }

    public static void pilihGenreGame(int userInput) throws IOException, InterruptedException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan judul game: ");
        String judulGame = sc.nextLine();
        System.out.print("Masukkan tahun rilis: ");
        int tahunRilis = sc.nextInt();
        switch (userInput){
            case 1:
                Scanner tokohProtagonisSc = new Scanner(System.in);
                System.out.print("Masukkan tokoh protagonis: ");
                String tokohProtagonis = tokohProtagonisSc.nextLine();
                RPG gameRpg = new RPG(judulGame, "RPG", tahunRilis, tokohProtagonis, 100);
                gameRpg.play();
                gameRpg.displayInfo();
                gameRpg.levelUp();
                break;
            case 2:
                System.out.print("Masukkan jumlah pemain: ");
                Scanner kesulitanGameSc = new Scanner(System.in);
                int jumlahPemain = sc.nextInt();
                int kesulitanGame=0;
                while (kesulitanGame<1 || kesulitanGame>5){
                    System.out.println("[1]. Easy");
                    System.out.println("[2]. Medium");
                    System.out.println("[3]. Hard");
                    System.out.println("[4]. Expert");
                    System.out.println("[5]. Competitive");
                    System.out.print("Pilih Kesulitan Permainan: ");
                    kesulitanGame = sc.nextInt();
                    // kesulitanGame = kesulitanGameSc.nextInt();
                    if (kesulitanGame<1 || kesulitanGame>5) {
                        System.out.println("Pilihan tidak ditemukan!");
                        TimeUnit.SECONDS.sleep(2);
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    }
                }
                String difficulty = "";
                if (kesulitanGame==1){
                    difficulty="Easy";
                }
                else if (kesulitanGame==2){
                    difficulty="Medium";
                }
                else if (kesulitanGame==3){
                    difficulty="Hard";
                }
                else if (kesulitanGame==4){
                    difficulty="Expert";
                }
                else if (kesulitanGame==5){
                    difficulty="Competitive";
                }
                FPS gameFPS = new FPS(judulGame,"FPS",tahunRilis, jumlahPemain, difficulty);
                gameFPS.play();
                gameFPS.displayInfo();
                gameFPS.shoot();
                break;
            default:
                System.out.println("Pilihan tidak ditemukan");
                break;
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException{
        Scanner userInputSc = new Scanner(System.in);
        loop: while (true){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            int pilihMenu = getMenu();
            pilihGenreGame(pilihMenu);
            System.out.print("Lanjut program? [Y/N]: ");
            char userInput = userInputSc.next().charAt(0);
            switch (Character.toLowerCase(userInput)) {
                case 'n':
                    break loop;
                case 'y':
                    break;
                default:
                    System.out.println("Pilihan tidak ditemukan");
                    break;
            }   
        }
        System.out.println("Program berakhir");
        userInputSc.close();
    }
}
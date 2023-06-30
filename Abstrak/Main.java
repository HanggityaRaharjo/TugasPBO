package Abstrak;
import java.util.Scanner;
import java.io.IOException;
// import java.io.InterruptedIOException;
import java.lang.*;
public class Main {
    public static int getMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Menu Hitung Luas Permukaan Dua Dimensi ======");
        System.out.println("[1] Belah Ketupat/Layang-layang");
        System.out.println("[2] Jajar genjang  ");
        System.out.println("[3] Lingkaran ");
        System.out.println("[4] Persegi ");
        System.out.println("[5] Persegi Panjang");
        System.out.println("[6] Segitiga");
        System.out.println("[7] Trapesium");
        System.out.print("Pilih Menu: ");
        int userInput = sc.nextInt();
        return userInput;
    }

    public static void pilihBangunDatar(int pilihanBangunDatar) {
        Scanner sc = new Scanner(System.in);
        switch (pilihanBangunDatar) {
            case 1:
                System.out.print("Masukkan warna belah ketupat: ");
                String warnaBelahKetupat = sc.nextLine();
                System.out.print("Masukkan panjang diagonal 1 belah ketupat: ");
                float d1 = sc.nextFloat();
                System.out.print("Masukkan panjang diagonal 2 belah ketupat: ");
                float d2 = sc.nextFloat();
                BelahKetupat belahKetupat = new BelahKetupat(warnaBelahKetupat, d1, d2);
                belahKetupat.display();
                break;
            case 2:
                System.out.print("Masukkan warna jajar genjang: ");
                String warnaJajarGenjang = sc.nextLine();
                System.out.print("Masukkan alas jajar genjang: ");
                float alasJajarGenjang = sc.nextFloat();
                System.out.print("Masukkan tinggi jajar genjang: ");
                float tinggiJajarGenjang = sc.nextFloat();
                JajarGenjang jajarGenjang = new JajarGenjang(warnaJajarGenjang, alasJajarGenjang, tinggiJajarGenjang);
                jajarGenjang.display();
                break;
            case 3:
                System.out.print("Masukkan warna lingkaran: ");
                String warnaLingkaran = sc.nextLine();
                System.out.print("Masukkan jari-jari/radius lingkaran: ");
                float radius = sc.nextFloat();
                Lingkaran lingkaran = new Lingkaran(warnaLingkaran, radius);
                lingkaran.display();
                break;
            case 4:
                System.out.print("Masukkan warna persegi: ");
                String warnaPersegi = sc.nextLine();
                System.out.print("Masukkan panjang sisi persegi: ");
                float sisi = sc.nextFloat();
                Persegi persegi = new Persegi(warnaPersegi, sisi);
                persegi.display();
                break;
            case 5:
                System.out.print("Masukkan warna persegi panjang: ");
                String warnaPersegiPanjang = sc.nextLine();
                System.out.print("Masukkan panjang persegi panjang: ");
                float panjang = sc.nextFloat();
                System.out.print("Masukkan lebar persegi panjang: ");
                float lebar = sc.nextFloat();
                PersegiPanjang persegiPanjang = new PersegiPanjang(warnaPersegiPanjang, panjang, lebar);
                persegiPanjang.display();
                break;
            case 6:
                System.out.print("Masukkan warna segitiga: ");
                String warnaSegitiga = sc.nextLine();
                System.out.print("Masukkan alas segitiga: ");
                float alasSegitiga = sc.nextFloat();
                System.out.print("Masukkan tinggi segitiga: ");
                float tinggiSegitiga = sc.nextFloat();
                Segitiga segitiga = new Segitiga(warnaSegitiga, alasSegitiga, tinggiSegitiga);
                segitiga.display();
                break;
            case 7:
                System.out.print("Masukkan warna Trapesium: ");
                String warnaTrapesium = sc.nextLine();
                System.out.print("Masukkan panjang alas Trapesium: ");
                float alasTrapesium = sc.nextFloat();
                System.out.print("Masukkan panjang atap Trapesium: ");
                float atapTrapesium = sc.nextFloat();
                System.out.print("Masukkan tinggi Trapesium: ");
                float tinggiTrapesium = sc.nextFloat();
                Trapesium Trapesium = new Trapesium(warnaTrapesium, tinggiTrapesium, alasTrapesium, atapTrapesium);
                Trapesium.display();
                break;
            default:
                System.out.println("Pilihan tidak ditemukan");
                break;
        }
    }
    public static void main(String[] args) throws IOException, InterruptedException{
        Scanner userInputSc = new Scanner(System.in);
        pengulangan: while (true) {
            int pilihanBangunDatar = getMenu();
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            pilihBangunDatar(pilihanBangunDatar);
            System.out.print("Lanjut program?[Y/N]: ");
            char userInput = userInputSc.next().charAt(0);

            switch (Character.toLowerCase(userInput)) {
                case 'n':
                    break pengulangan;
                case 'y':
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
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
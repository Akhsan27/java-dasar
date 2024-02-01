package Dasarjava;
import java.util.Scanner;
public class Segitiga {
    public static void main(String[] args) {
        int tinggi, alas;
        Double luas;

        Scanner baca = new Scanner(System.in);
        System.out.println("=== Program Luas Segitiga ===");
        System.out.print("Masukan alas = ");
        alas = baca.nextInt();
        System.out.print("Masukkan Tinggi = ");
        tinggi = baca.nextInt();

        luas = Double.valueOf((alas * tinggi )/2);

        System.out.println("Luas Segitiga = " + luas);
    }
}

package Dasarjava;
import java.util.Scanner;

public class Operasiaritmatika {
    public static void main(String[] args) {
        int angka1;
        int angka2;
        int hasil;

        Scanner key = new Scanner(System.in);

        System.out.print("input angka ke - 1  = ");
        angka1 = key.nextInt();
        System.out.print("Input angka ke-2 = ");
        angka2 = key.nextInt();
        //penjumlahan
        hasil = angka1 + angka2;
        System.out.println("Hasil = "+ hasil);


        System.out.print("Masukkan angka ke - 1 = ");
        angka1 = key.nextInt();
        System.out.print("Masukkan angka ke - 2 = ");
        angka2 = key.nextInt();
        //pengurangan
        hasil = angka1 - angka2;
        System.out.println("Hasil = "+ hasil);

        
        System.out.print("Masukkan angka ke - 1 = ");
        angka1 = key.nextInt();
        System.out.print("Masukkan angka ke - 2 = ");
        angka2 = key.nextInt();
        //perkalian
        hasil = angka1 * angka2;
        System.out.println("Hasil = " +hasil);

        
        System.out.print("Masukkan angka ke - 1 = ");
        angka1 = key.nextInt();
        System.out.print("Masukkan angka ke - 2 = ");
        angka2 = key.nextInt();
        //pembagian 
        hasil = angka1 / angka2;
        System.out.println("Hasil = " + hasil);
    }
}
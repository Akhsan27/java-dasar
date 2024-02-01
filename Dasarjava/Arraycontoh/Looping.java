package Dasarjava.Arraycontoh;
import java.util.Arrays;
public class Looping {
    public static void main(String[] args) {
        int[] arrayAngka = {21,22,23,24,25,26,27,28,29,30,31};
        //looping standar
        System.out.println("looping standar");
        for(int i = 0; i < 11;i++){
            System.out.println("urutan angak ke- "+i+" adalah ="+arrayAngka[i]);
        }
        //looping menggunakan properti
        System.out.println("Looping menggunakan Properti");
        for(int i = 0; i<arrayAngka.length; i++) {
         System.out.println("urutan angka ke - "+i+" adalah = "+ arrayAngka[i]);   
        }
        //Looping menggunakan collection array
        System.out.println("looping for each");
        for( int angka:arrayAngka){
            System.out.println("urutan angka ke- "+angka);
        }

    }
}

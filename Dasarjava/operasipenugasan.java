package Dasarjava;
public class operasipenugasan {
    public static void main(String[] args) {
        int a, b;
        a= 5;
        b= 10;
        //penjumlahan
        b += a;
        //pejumlahan dari 5+10=15
        System.out.println("Hasil Penjumlahan = " + b);

        //pengurangan
        b -= a;
        //Pengurangan Dari 15-5=10
        System.out.println("Hasil Pengurangan = " + b);

        //Perkalian
        b *= a;
        //Perkalian dari 10*5= 50
        System.out.println("Hasil Perkalian = " + b);
        
        //pembagian
        b /= a;
        //pembagian dari 50 / 10 =5
        System.out.println("Hasil Pembagian = " + b);

        // Sisa pembagian
        b %= a;
        //sisa pembagian dari atas adalah 0
        System.out.println("Sisa hasil Pembagian = " + b);
    }
}

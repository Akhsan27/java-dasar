package Dasarjava.Arraycontoh;
import java.util.Scanner;
public class main {
   public static void main(String[] args) {
   //membuat array buah-buahan
    String[] buah = new String[5];
    //membuat scanner 
    Scanner scan = new Scanner(System.in);
    //mengisi data array
    for(int i = 0; i < buah.length; i++){
        System.out.println("Buah ke-" + i + ": " );
        buah[0] = "Semangka"; 
        buah[1] = "Jambu"; 
        buah[2] = "Apel"; 
        buah[3] = "Jeruk"; 
        buah[4] = "Nanas"; 
    }
        System.out.println("==============");

    for(String b : buah){
        System.out.println(b);
    }
    
   }
}

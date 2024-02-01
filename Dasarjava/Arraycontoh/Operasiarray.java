package Dasarjava.Arraycontoh;
import java.util.Arrays;

public class Operasiarray {
//smv
public static void main(String[] args) { 
    int[] arrayAngka1 = {1,2,3,4,5};

    //merubah angka menjadi string
    System.out.println("\nMerubah angka menjadi String");
    printArray(arrayAngka1);
    //mencopy array 
    System.out.println("\nMengcopy Array\n===============");
    int[] arrayAngka2 = new int[5];
    printArray(arrayAngka1);
    printArray(arrayAngka2);

    System.out.println("\nMengkopi dengan Loop");
    for(int i=0; i < arrayAngka1.length;i++){
        arrayAngka2[i] =arrayAngka2[i];
    }
    printArray(arrayAngka1);
    System.out.println(arrayAngka1);
    printArray(arrayAngka2);
    System.out.println(arrayAngka2);

    System.out.println("\nMengkopi denganOf");
    int[] arrayAngka3 = Arrays.copyOf(arrayAngka1,6);
    printArray(arrayAngka1);
    System.out.println(arrayAngka1);
    printArray(arrayAngka3);
    System.out.println(arrayAngka3);

    System.out.println("mengkopi dengan OfRange");
    int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1,0,5);
    printArray(arrayAngka1);
    System.out.println(arrayAngka1);
    printArray(arrayAngka4);
    System.out.println(arrayAngka4);

}

    private static void printArray(int[] dataArray){
        System.out.println("array"+ Arrays.toString(dataArray));
    }
}
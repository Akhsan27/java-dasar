package Dasarjava.Arraycontoh;
import java.util.Arrays;
public class pendalamanArray {
    public static void main(String[] args) {
        int[] arrayAngka1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arrayAngka2 = new int[9];

        arrayAngka2 = arrayAngka1;

        System.out.println("Ini adalah array 1 "+Arrays.toString(arrayAngka1));
        System.out.println("Ini adalah array 2 "+Arrays.toString(arrayAngka2));


        arrayAngka1[2] = 100;
        arrayAngka2[5] = 400;
        System.out.println("array angka 1"+Arrays.toString(arrayAngka1));
        System.out.println("array angka 2"+Arrays.toString(arrayAngka2));

        ubahArray(arrayAngka1);
        System.out.println("array angka 1"+Arrays.toString(arrayAngka1));
        System.out.println("array angka 2"+Arrays.toString(arrayAngka2));
    }
    private static void  ubahArray(int[] dataArray){
        dataArray[0] = 123;
    }
}

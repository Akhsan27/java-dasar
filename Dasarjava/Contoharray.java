package Dasarjava;
//import java khusus array "import java.util.Arrays"
//import java untuk keseluruhan komponen "import java.util.*"
import java.util.Arrays;
public class Contoharray {
    public static void main(String[] args) {
      String[] teman = {"akhsan", "umam", "imam", "jhon", "doni"};
      
     System.out.println(teman[0]);
     System.out.println(teman[1]);
     System.out.println(teman[2]);
     System.out.println(teman[3]);
     System.out.println(teman[4]);

     System.out.println(Arrays.toString(teman));

     System.out.println("deklarasi Array");
     float[] arrayDeklarasi = new float[5];
     arrayDeklarasi[0] = 1.1f;
     arrayDeklarasi[1] = 1.2f;
     arrayDeklarasi[2] = 1.3f;
     arrayDeklarasi[3] = 1.4f;
     arrayDeklarasi[4] = 1.5f;

     System.out.println(arrayDeklarasi[0]);
     System.out.println(arrayDeklarasi[1]);
     System.out.println(arrayDeklarasi[2]);
     System.out.println(arrayDeklarasi[3]);
     System.out.println(arrayDeklarasi[4]);

     System.out.println(Arrays.toString(arrayDeklarasi));
     
    }
}

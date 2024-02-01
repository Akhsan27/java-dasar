package Dasarjava;
public class Operasilogika {
    public static void main(String[] args) {
        //operator logika ===> operasi yang biasa kita lakukan kepada tipe data boolean
        boolean a, b, c;
        System.out.println("=== OR || ===");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " +c);
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " +c);
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " +c);
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " +c);

        System.out.println("=== AND && ===");
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " +c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " +c);
        b = false;
        a = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " +c);
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " +c);
    }
}

package day32maps;

import com.sun.security.jgss.GSSUtil;

public class StaticBlocks01 {

    public static double pi;

    //static block'lar ihtiyacımız olan variable'larin class oluşturma safhasında elimizde olmasını sağlar.
    //static block'lar class içindeki herşeyden önce çalıştırılır. "main method" dan ve diğer tüm methodlardan önce çalıştırılır.
    //static block'lar içinde sadece "static variable" lara değer atanabilir.
    //1den fazla "static block" varsa üstteki önce çalıştırılır.
    //önce static block çalıştırılır sonra main method ve diğerleri çalıştırılır

    /*
    Static Block 2
    Static Block 1
    Main method
     */

    static {
        System.out.println("Static Block 2");
    }

    public static void main(String[] args) {

        System.out.println("Main method");

    }

    static {
        pi = 3.14;
        System.out.println("Static Block 1");
    }

}

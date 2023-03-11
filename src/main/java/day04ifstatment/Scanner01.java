package day04ifstatment;

import java.util.Scanner;

public class Scanner01 {


    public static void main(String[] args) {

                  /*
            Kullanicidan ilk, orta ve soy ismini, kimlik numarasini aliniz ve asagidaki formatta ekrana yazdiriniz
            Ali Mert Can
            123456789
         */
        Scanner input = new Scanner(System.in);

        //1.Yol:
//        System.out.println("Ilk isminizi giriniz...");
//        String ilkIsim = input.next();// next() methodu kullanicidan String datasi almak icin kullanilir
//
//        System.out.println("Orta isminizi giriniz...");
//        String ortaIsim = input.next();
//
//        System.out.println("Soy isminizi giriniz...");
//        String soyIsim = input.next();
//
//        System.out.println("Kimlik numaranizi giriniz...");
//        String kimlikNo = input.next();
//
//        System.out.println(ilkIsim + " " + ortaIsim + " " + soyIsim);
//        System.out.println(kimlikNo);

        //2.Yol:

//        System.out.println("ilk, orta, soy isiminizi ve kimlik numaranızı giriniz");
//
//        String ilk = input.next();
//        String orta = input.next();
//        String soy = input.next();
//        String kimlik = input.next();
//
//        System.out.println(ilk + " " + orta + " " + soy);
//        System.out.println(kimlik);


        /*Not: next() ile nextline() farkı nedir
        next metodu kullanıcıdan gelen stringin sadece ilk kelimesini alır.
        nextline methodu kullanıcıdan gelen stringin tamamını alır.
        */

        //3.Yol:
        System.out.println("İlk, orta ve soy isminizi giriniz");
        String tamIsim = input.nextLine();

        System.out.println("Kimlik numaranızı giriniz");
        String kimlikNumarasi = input.next();

        System.out.println(tamIsim);
        System.out.println(kimlikNumarasi);







    }
}

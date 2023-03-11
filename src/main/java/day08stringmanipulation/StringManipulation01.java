package day08stringmanipulation;

import java.util.Scanner;

public class StringManipulation01 {

    public static void main(String[] args) {

        //Example 1: Kullanıcıdan aldığınız ismin ilk ve son harfini ekrana yazdırınız

        Scanner input = new Scanner(System.in);
//
//        System.out.println("İsminizi giriniz");
//
//        String isim = input.next();

        //1. Yol
//        char ilkharf = isim.charAt(0);
//        char sonharf = isim.charAt(isim.length()-1);
        //yazdiğiniz code sadece bazi durumlar için çalışırsa o codea "hard coding" denir
        //yazdığınız code her durum için çaşırsa o code "Dynamic Coding" denir

//        System.out.println("" + ilkharf+sonharf);
//
//        //2.Yol
//
//        String ilk = isim.substring(0,1);
//
//        String son = isim.substring(isim.length()-1);
//
//        System.out.println(ilk + son);

        /*
         * contains()
         * Metin icerisinde arama yapmamizi saglar.
         * bir stringin içerisinde karakter(ler)in var olup olmadığını kontrol eder.
         * Sonuc boolean dir.
         *
         /** substring()
         * Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
         */


        //Example 2: Verilen Stringdeki sadece hayvan isimlerini ekrana yazdırınız..
        // "ben kedi, eşim tavuk, oğlum sever inek"

        String str = "Ben kedi, eşim tavuk, oğlum sever inek";

        //substring() in iki kullanımı vardır.
        //1) substring() (baslangıç indexi, bitiş indexi) Stringin ortasından bir parça almaya yarar.
        //2) substring() (baslangıç indexi) Stringin verilen indexten sonuna kadar almaya yarar.

        String kedi = str.substring(4,8);

        String tavuk = str.substring(15,20);

        String inek = str.substring(34);

        System.out.println(kedi+tavuk+inek);


        //Examle 3: İlk isim ve soy isimi içeren isimlerden ilk ve soy isimlerin baş harferini ekrana yazdırınız
        //          Ali Can ==> AC

        System.out.println("İlk ve soy isiminiz giriniz");
        String tamIsim = input.nextLine();

        String a = tamIsim.substring(0,1).toUpperCase();

        String b = tamIsim.split(" ")[1].substring(0,1).toUpperCase();

        System.out.println(a+b);





    }

}

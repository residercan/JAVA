package day07ternarystringmanipulation;

import java.util.Objects;
import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Bir sayının pozitif olup olmadığını ekrana yazdıran kodu yazınız

        //1.Yol if-else ile çözelim

        int a = 12;

        if(a>0){
            System.out.println("pozitif");
        }else {
            System.out.println("pozitif değil");
        }

        //2.Yol ternary
        //Condition - ? - Condition doğru ise uygulanaca kod - Condition yanlış ise uygulanacak kod;
        String sonuc = a>0 ?"Pozitif" : "Pozitif Değil";
        System.out.println(sonuc);

        //Example 2: iki sayıdan küçük olanı seçen kodu yazınız

        int b = 12;
        int c = 23;

        int min = b<c ? b : c;
        System.out.println(min);

        //Example 3: Verilen bir sayının mutlak değerini hesaplayan kodu yazınız
        //Pozitif sayıların ve sıfırın mutlak değeri kendileridir.
        //Negatif sayıların mutlak değeri -1 ile çarpılmış halleridir.

        int d = -45;

        int mutlak = d<0 ? -1*d : d;
        System.out.println(mutlak);

        //Example 4 : iki tane sayı aynı işaretli ise bu sayıları çarpınız. farklı işaretli ise "işlem yapamam" mesajı veriniz
        //Ternary farkli data tiplerinde sonuc return ederse sonucun data tipini "Object" yapınız..
        int e = 12;
        int f = 10;

        Object islem = (e>0 && f>0) || (e<0 && f<0) ? e*f : "Islem yapamam";

        System.out.println(islem);
        //Note: Javada her classin en az bir tane "parent" classı vardır.
        // Bir tek object classın parentı yoktur..






    }
}

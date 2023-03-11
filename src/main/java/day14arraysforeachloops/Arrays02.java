package day14arraysforeachloops;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {

        // Example 1: [0, 2, 3, 0, 12, 0] Sıfırları en sona koyunuz
        //            [2, 3, 12, 0,  0,  0]

        //Yeni Array oluşturulmalı ve eleman sayısı orjinal array ile aynı olmalı

        int orijinal[] = {0, 2, 3, 0, 12, 0};
        int yeni[]= new int[orijinal.length];
        int idx = 0;

        for (int i=0; i<orijinal.length; i++){
            if (orijinal[i] !=0){
                yeni[idx] = orijinal[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));

        //Example 2: Bir Array'ın içinde herhangi bir elemanın olup olmadığını kontrol eden ve
        // kac kere tekrarlandığını gösteren kodu yazınız

        //     [2,1,2,-3,2] ==> 2 elemanı var ve 3 kere tekrarlandı
        //     [2,1,2,-3,2] ==> 6 elemanı yok ve 0 kere tekrarlandı

        int arr[] = {2,1,2,-3,2};

        int eleman = 2;

        int counter = 0; //"flag"(bayrak) : Bazı durumların olup olmadığını kontrol etmek için flag kullanılır.


        for(int w : arr){

            if (w== eleman){
                counter++;
            }
        }

        if(counter>0){
            System.out.println(eleman + " array'de " + counter + " defa var");
        } else {
            System.out.println(eleman + " array'de yok");
        }


        //Example 3: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yazınız.
        //           "Java kolaydir çalışana, ne kolay ki çalışmayana" ==> "çalışmayana


        String cumle = "Java kolaydir calışana, ne kolay ki calışmayana.";
        System.out.println(cumle);
        cumle = cumle.replaceAll("\\p{Punct}","");//Noktalama işaretlerini sildik
        System.out.println(cumle);
        String kelime[] = cumle.split(" ");

        Arrays.sort(kelime, Comparator.comparingInt(String::length));//kelimeler arası uzunluklarına göre karşılaştırma yapar.
        System.out.println(Arrays.toString(kelime));

        System.out.println(kelime[kelime.length-1]);

    }
}

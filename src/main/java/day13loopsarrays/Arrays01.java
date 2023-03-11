package day13loopsarrays;

import java.util.Arrays;

public class Arrays01 {

    /*
        1)Ayni data tipinde, coklu data'i depolmaka icin Java'nin olusturdugu yapilar vardir.
          Bu yapilardan birisi de "Array" lerdir.
     */

    public static void main(String[] args) {

        //Array nasıl oluşturulur.
        int stdAges[] = new int[7];//[0,0,0,0,0,0,0]

        //Array nasıl yazdırılır.
        System.out.println(Arrays.toString(stdAges));

        //12, 11, 13, 14, 10, 12, 12
        //Array'lere elemanlar nasıl eklenir
        stdAges[1] = 11;
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;

        System.out.println(Arrays.toString(stdAges));//[12, 11, 13, 14, 10, 12, 12]

        //Array'daki herhangi bir elemanı nasıl yazdırabiliriz.
        System.out.println(stdAges[4]);//10


        //Example 1 : Array'deki en küçük ve en büyük elemanın toplamını ekrana yazdırınız
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));//[10, 11, 12, 12, 12, 13, 14] // küçükten büyüğe sıralamak için kullanılır.

        int ilk = stdAges[0];

        //Note : "length()" Stringlerde kullanılır. "length" Arraylerde kullanılır.
        int son = stdAges[stdAges.length - 1];

        System.out.println(ilk + son);//24

        //Example 2 : stdAges arrayi içindeki tüm elemanların toplamını ekrana yazdıran kodu yazınız.

        //1. Yol
        int sum = 0;

        for (int i = 0; i < stdAges.length; i++) {
            sum = sum + stdAges[i];

        }
        System.out.println(sum);


        //2. Yol

        int i = 0;
        int toplam = 0;

        while (i < stdAges.length) {
            toplam = toplam + stdAges[i];

            i++;
        }

        System.out.println(toplam);

        //3. Yol
        int k = 0;
        int sonuc = 0;

        do {
            sonuc = sonuc + stdAges[k];
            k++;
        } while (k < stdAges.length);

        System.out.println(sonuc);

        //4. Yol: for each loop Array'lerde Collections'larda kullanılır.
        //En gelişmiş loop'tur.

        int t = 0;
        for (int w : stdAges) {
            t = t + w;
        }
        System.out.println(t);

        // Example 3: String bir array oluşturunuz
        //  Bu array'a 5 tane isim yerleştiriniz
        // bu isimlerdeki karakter sayılarının toplamını ekrana yazdırınız

        String stdNames[] = new String[5];
        stdNames[0]= "Ali";
        stdNames[1]= "Tom";
        stdNames[2]= "Veli";
        stdNames[3]= "Kemal";
        stdNames[4]= "Cem";

        int karakterSayilariToplami = 0;

        for (String w: stdNames){
           karakterSayilariToplami = karakterSayilariToplami + w.length();
        }
        System.out.println(karakterSayilariToplami);//18

        //Example 4: Char bir array oluşturunuz
        //Bu array'e 5 eleman ekleyiniz
        //Bu array'deki sadece büyük harfleri ekrana yazdırınız

        char ch[] = new char[5];
        ch[0] = 'a';
        ch[1] = 'b';
        ch[2] = 'c';
        ch[3] = 'd';
        ch[4] = 'e';

        char chKisaYol[] = {'A', 'c', 'D', 'k', 'M'};//array oluşturma ve elemanları içine yazdırmanın kısa yolu.

        for( char w:chKisaYol){
            if( w>='A' && w<='Z'){
                System.out.print(w + " ");
            }
        }



    }
}

package day16multidimensionarraysarraylists;

import java.util.Arrays;

public class MultidimensionalArray01 {
    public static void main(String[] args) {

        /*
        Array veya Collection varsa "for each loop" kullanmak ilk tercihiniz olsun
        Array veya Collection var ama "index" kullanmak zorundasınız
        o zaman "for each loop" çalışmaz "for loop" veya "while loop" veya "do while loop"
        kullanmanız gerekir.
         */



        //Bir tane integer multidimensional array oluşturunuz
        //Bu Array deki tüm sayıların toplamını veren kodu yazınız

        int arr[][] = {{2, 5, 1},{32, 75},{13, 21, 43, 56}};

        int sum = 0;

        for(int[] w: arr){
            for(int k: w){
                sum = sum + k;
            }

        }
        System.out.println(sum);

        //Bir multidimensional array'i normal array'e çeviren kodu yazınız
        //{2, 5, 1},{32, 75} ==> {2, 5, 1, 32, 75}
        //Önce Multidimensional Array'deki elaman sayısı bulunur
        //Çünkü yeni bir array oluşturmalıyız ve bu yeni array'in uzunluğu
        //orjinal array'in eleman sayısına eşit olmalıdır.

        int brr[][] = {{2, 5, 1},{32, 75}};

        int toplam = 0;

        for(int[] w : brr) {
            toplam = toplam + w.length;//Multidimensional Array içindeki eleman sayısını bulduk = 5
        }
        System.out.println(toplam);

        int idx = 0;

        int crr[] = new int[toplam];//[0,0,0,0,0]

        for(int[] w : brr) {
            for(int k: w) {
                crr[idx] = k;
                idx++;
            }
        }

        System.out.println(Arrays.toString(crr));


    }
}

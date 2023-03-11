package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //BinarySearch() Method : bu methodu kullanarak bir elemanın Array'de olup olmadığını anlarız.
        //                        BinarySearch methodunu kullanmadan önce mutlaka Arrays.sort() kullanılmalıdır.
        //                        BinarySearch methodu aradığınız eleman Array'de varsa o elemanın indexini return eder.
        //                        BinarySearch methodu aradığınız   eleman Array'de yoksa -a şeklinde bir negatif sayı alırsınız
        //                        bu sayıdaki "-" işaretinin anlamı bu elemanın Array'de yok demektir.
        //                        "a" nin anlamı olsaydı kacıncı sırada olacağını söylüyor.

        //Note                    BinarySearch methodu tekrarlayan elemanlar için kullanılmaz.




        int arr[] = {12, 31, 43, 14};

        int sayi = 43;

        Arrays.sort(arr); // [12, 14, 31, 43]

        int idx1 = Arrays.binarySearch(arr,sayi); // [12, 14, 31, 43]

        System.out.println(idx1); // index 3

        int sayi2 = 58;
        int sonuc = Arrays.binarySearch(arr,sayi2 );//-5



    }
}

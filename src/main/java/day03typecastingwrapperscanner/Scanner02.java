package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //Example 1: Sayıları kullanıcıdan alan ve toplama işlemi yapan kodu yazınız


        Scanner input = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz");

        double sayi1 = input.nextDouble();

        System.out.println("ikinci sayıyı giriniz");

        double sayi2 = input.nextDouble();

        System.out.println(sayi1 + sayi2);

        //Example 2: Sayıları kullanıcıdan alan ve ürünlerin kdvsini hesaplayan kodu yazınız.

        System.out.println("ürün fiyatını giriniz");
        double urunFiyati = input.nextDouble();


        System.out.println(urunFiyati * 18/100 + urunFiyati);





    }


}

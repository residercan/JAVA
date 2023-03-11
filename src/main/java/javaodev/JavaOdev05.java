package javaodev;

import java.util.Scanner;

public class JavaOdev05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdörtgen Prizmanın uzunluğunu giriniz");

        double uzunluk = input.nextDouble();

        System.out.println("Dikdörtgen Prizmanın genişliğini giriniz");

        double genislik = input.nextDouble();

        System.out.println("Dikdörtgen Prizmanın yüksekliğini giriniz");

        double yukseklik = input.nextDouble();

        System.out.println("Dikdörtgen Prizmanın Hacmi " + uzunluk*genislik*yukseklik);






    }



}

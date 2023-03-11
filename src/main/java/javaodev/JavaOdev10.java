package javaodev;

import java.util.Scanner;

public class JavaOdev10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Adınızı ve Soyadınızı giriniz");

        String tamAdi = input.nextLine();

        System.out.println("Adresinizi yazınız");

        String adres = input.nextLine();

        System.out.println(tamAdi + adres);



    }


}

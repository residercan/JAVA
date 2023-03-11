package javaodev;

import java.util.Scanner;

public class JavaOdev08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Saniyeye çevirmek istediğiniz saati giriniz");

        long saat = input.nextLong();

        System.out.println("Saniye = " + saat*60*60);



    }




}

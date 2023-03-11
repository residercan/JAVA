package javaodev;

import java.util.Scanner;

public class JavaOdev06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Yarıçapı giriniz");

        float yaricap = input.nextFloat();

        float piSayisi = 3.14159F;

        System.out.println("Dairenin Alanı " + piSayisi*yaricap*yaricap);

        System.out.println("Dairenin Çevresi " + 2*piSayisi*yaricap);

        



    }



}

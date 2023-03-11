package javaodev;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class JavaOdevSwitch03 {
    public static void main(String[] args) {

        // Kullanıcıdan bir sayı girmesini isteyin
        //girilen sayı
        //10 ise "iki basamaklı en küçük sayı
        //100 ise uc basamaklı en küçük sayı
        //1000 ise uc basamaklı en küçük sayı
        //diğer durumlarda "Girdiğin sayıyı değiştir" yazdırın

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");

        int sayi = input.nextInt();


        switch (sayi) {
            case 10:
                System.out.println("iki basamaklı en küçük sayı");
                break;
            case 100:
                System.out.println("uc basamaklı en küçük sayı");
                break;
            case 1000:
                System.out.println("uc basamaklı en küçük sayı");
                break;
            default:
                System.out.println("Girdiğin sayıyı değiştir");

        }

    /*Kullanıcıdan SDET kisaltmasindaki harflerden birini yazmasini isteyin.
      Kullanıcı S girerse "Software"
      D girerse "Devoloper"
      E girerse "Engineer"
      T girerse "In Testing" yazdırın
    */

        Scanner input1 = new Scanner(System.in);

        System.out.println("Lütfen SDET kisaltmasindaki harflerden birini yazınız");
        String harf = input1.next().toLowerCase();

        switch (harf) {
            case "s":
                System.out.println("Software");
                break;
            case "d":
                System.out.println("Devoloper");
                break;
            case "e":
                System.out.println("Engineer");
                break;
            case "t":
                System.out.println("In Testing");
                break;
            default:
                System.out.println("Lütfen seçeneklerdeki harflerden birini giriniz");
        }

        //Kullanıcıdan gün ismini alıp hafaiçi veya hafta sonu yazdırınız

        Scanner input2 = new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz");
        String gun = input2.next().toLowerCase(Locale.ROOT);

        switch (gun) {
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            case "pazartesi":
                System.out.println("Hafta içi");
                break;
            case "salı":
                System.out.println("Hafta içi");
                break;
            case "çarşamba":
                System.out.println("Hafta içi");
                break;
            case "perşembe":
                System.out.println("Hafta içi");
                break;
            case "cuma":
                System.out.println("Hafta içi");
                break;
            case "cumartesi":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Geçerli bir gün ismi giriniz");
        }

    }
}

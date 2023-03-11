package day06nestedifswich;

import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {

        /*
        Kullanıcıya ay ismi sorunuz ve kullanıcının verdiği ay isminden son aya kadar ekrana yazdırınız
         */

        //Note: toLowerCase() methodu bir String'deki tüm characterleri küçük harflere çevirir.
        //Note: toUperCase() methodu bir String'deki tüm characterleri büyük harflere çevirir.
        Scanner input = new Scanner(System.in);

        System.out.println("Ay ismini giriniz");

        String ayIsmi = input.next().toLowerCase();

        switch (ayIsmi) {
            case "ocak":
                System.out.println("Ocak");
            case "şubat":
                System.out.println("Şubat");
            case "mart":
                System.out.println("Mart");
            case "nisan":
                System.out.println("Nisan");
            case "mayıs":
                System.out.println("Mayıs");
            case "haziran":
                System.out.println("Haziran");
            case "temmuz":
                System.out.println("Temmuz");
            case "ağustos":
                System.out.println("Ağustos");
            case "eylül":
                System.out.println("Eylül");
            case "ekim":
                System.out.println("Ekim");
            case "kasım":
                System.out.println("Kasım");
            case "aralık":
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Geçerli ay ismi giriniz");


        }

    }


}

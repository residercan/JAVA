package day05ifstatment;

import java.util.Scanner;

public class IfStatment03 {

    public static void main(String[] args) {

        //Example 1 kullanıcıdan gün isimlerini alınız o günü hafta sonu mu hafta içi mi olduğunu alıcıya söyleyiniz
        //İki tane Stringin birbirine eşit olup olmadığını anlamak için "==" değil, "equals()" kullanırız..
        //İki tane Stringin birbirine eşit olup olmadığını kontrol etmek için iki tane method kullanılabilir..
        //1-)equols() büyükharf ve kücükharfi önemser
        //2-)equolsignorcase() büyükharf ve kücükharfi önemsemez


        //1. Yol

        Scanner input = new Scanner(System.in);

        System.out.println("Gün ismini giriniz");

        String gunIsmi = input.next();

        if (gunIsmi.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Hafta İçi");
        } else if (gunIsmi.equalsIgnoreCase("Salı")) {
            System.out.println("Hafta İçi");
        } else if (gunIsmi.equalsIgnoreCase("Çarşamba")) {
            System.out.println("Hafta İçi");
        } else if (gunIsmi.equalsIgnoreCase("Perşembe")) {
            System.out.println("Hafta İçi");
        } else if (gunIsmi.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta İçi");
        } else if (gunIsmi.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta Sonu");
        } else if (gunIsmi.equalsIgnoreCase("Pazar")) {
            System.out.println("Hafta Sonu");
        } else {
            System.out.println("Haftanın günleri Pazartesi, Salı, Çarşamba, Perşembe, Cuma, Cummartesi, Pazar'dır.");
        }


        // 2.Yol

        if (gunIsmi.equalsIgnoreCase("Pazar") || gunIsmi.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu...");
        } else if (gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici...");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz...");
        }

        //3. Yol

        boolean haftaSonu = gunIsmi.equalsIgnoreCase("Pazar") || gunIsmi.equalsIgnoreCase("Cumartesi");
        boolean haftaIci =  gunIsmi.equalsIgnoreCase("Pazartesi") ||
                            gunIsmi.equalsIgnoreCase("Sali") ||
                            gunIsmi.equalsIgnoreCase("Carsamba") ||
                            gunIsmi.equalsIgnoreCase("Persembe") ||
                            gunIsmi.equalsIgnoreCase("Cuma");

        if (haftaSonu){
            System.out.println("Hafta sonu...");
        }else if (haftaIci) {
            System.out.println("Hafta ici...");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz...");
        }

    }


}

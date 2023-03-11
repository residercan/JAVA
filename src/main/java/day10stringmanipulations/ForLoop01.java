package day10stringmanipulations;

public class ForLoop01 {
    public static void main(String[] args) {

        //Example 1: Ekrana 5 kere "Hi" yazdiriniz.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //Tekrarli işler için Loop kullanırız.
        //Dört çeşit Loop vardır. 1- for Loop 2-while Loop 3-do while loop 4-for each loop


        //for loop
        //Example 2: Ekrana 5 kere "Hi" yazdiriniz.

        // Başlangıç değeri - loop hangi şart altında çalışacak - Increment(artırma) veya Decrement (azaltma).
        for (int i = 1; i < 6; i++) {
            System.out.println("Hi");
        }


        //Example 3 : 4 den 7 e kadar tüm tam sayıları ekrana yazdıran kodu yazınız

        for (int a = 4; a < 8; a++) {
            System.out.print(a + " ");//line satır demektir sadece print yazarsak aynı satıra yazar.
        }

        System.out.println();

        //Example 4 : 14 den 5 e kadar tüm tamsayıları ekrana yazdiran kodu yazınız

        for (int b = 14; b > 4; b--) {
            System.out.print(b + " ");
        }

        System.out.println();

        //Example 5: 14 den 5e kadar tüm çift sayıları yazdırınız

        //1. Yol
        for (int c = 14; c > 4; c -= 2) {
            System.out.print(c + " ");
        }

        System.out.println();
        //2. Yol

        for (int c = 14; c > 4; c--) {
            if (c % 2 == 0) {
                System.out.print(c + " ");
            }
        }

        System.out.println();

        //Example 6: 28'den 157e kadar tüm tek sayıları ekrana yazdırınız

        for (int d = 28; d < 158; d++) {
            if (d % 2 != 0) {
                System.out.print(d + " ");
            }
        }


        System.out.println();

        //Example 7: "Java" Stringini "J*a*v*a" Stringine çeviren kodu yazınız

        String str = "Java";
        for (int f = 0; f < str.length(); f++) {
            System.out.print(str.charAt(f) + "*");
        }


        System.out.println();

        //Example 8: Size verilen Stringde tekrarsız karakterleri ekrana yazdiriniz

        String s = "Hellooo Ali";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c);
            }
        }


    }
}

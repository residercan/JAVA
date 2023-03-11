package day12loops;

import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {


        //Example 1: 3 den 10 kadar tamsayıları aynı satırda ekrana yazdıran kodu yazınız

        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        //2. Yol WhileLoop

        int i = 3;

        while (i < 11) {
            System.out.print(i + " ");

            i++;
        }


        System.out.println();
        //Example 2: 17den 4 e kadar tüm çift sayıları ekrana yazdıran kodu yazınız.

        int k = 17;
        while (k > 3) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }

            k--;
        }


        System.out.println();
        //Example 3: 12 den 67 e kadar sayıların toplamını veren kodu yazınız

        int sum = 0;
        int m = 12;

        while (m < 68) {

            sum = sum + m;

            m++;
        }
        System.out.println(sum);


        //Example 4: Size verilen 1 tam sayının rakamları toplamını ekrana yazdıran kodu yazınız

        int n = 385;
        int toplam = 0;

        while (n > 0) {
            toplam = toplam + n%10;
            n = n / 10;

        }
        System.out.println(toplam);

        Scanner input = new Scanner(System.in);
        System.out.println("Rakamlarını toplamak istediğiniz sayıyı giriniz");
        int v = input.nextInt();
        int sonuc =0;

        while (v > 0) {
            sonuc = sonuc + v%10;
            v = v / 10;
        }
        System.out.println(sonuc);


        //Example 5: Kullanıcıdan aldığınız bir sayının çarpım tablosunu ekrana yazdırınız

        Scanner carpim = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");

        int c = input.nextInt();
        int a = 1;

        while (a < 11) {

            System.out.println(c + "x" + a + "=" + c*a);

            a++;


        }

    }

}

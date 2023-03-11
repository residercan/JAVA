package javaodev;

import java.util.Scanner;

public class JavaOdevScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //4 basamaklı bir sayının 1. 4. rakamı toplamı ile 2. ve 3. rakamı toplamını hesaplayan bir kod yazınız
        System.out.println("4 basamaklı bir sayı giriniz");

        int sayi = input.nextInt();

        int birinci = sayi / 1000;
        int ikinci = sayi / 100%10;
        int ucuncu = sayi / 10%10;
        int dorduncu = sayi % 10;

        System.out.println("1. ve 4. rakamları toplamı = " + (birinci+dorduncu) + " " + "2. ve 3. rakamları toplamı= " + (ikinci+ucuncu));





    }


}

package day11loops;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {

        //Example 1: 3 den 6 ya kadar tam sayıların toplamını bulan kodu yazınız

        int a = 0;
        for(int i =3; i<7; i++) {
            a=a+i;
        }
        System.out.println(a);
        //Son değeri görmek için System.out.println(a);'yi for loopun dışına yazmalıyız
        //her toplama işlemini teker teker görmek için System.out.println(a);'yi for loopun içine yazmalıyız.

        //Example 2: 6'dan 3 e kadar tam sayıların çarpımını bulan kodu yazınız

        int b = 1;
        for(int i = 6; i>2; i--){
            b= b*i;
        }
        System.out.println(b);



        //Example 3: Size verilen 3 basamaklı bir sayının rakamları toplamini bulunuz
        //Java da tam sayıyı tam sayıya bölerseniz sonuc tam sayı olur.
        //Eğer sonuc virgüllü sayı ise Java ondalık kısmı siler.

        Scanner input = new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı yazınız");
        int sayi = input.nextInt();

        sayi=Math.abs(sayi);//Negatifler için sayıyı mutlak değer yapar kod hatasız çalışır.

        int sonuc = 0;
        for(int i=sayi; i>0; i=i/10 ){
            sonuc=sonuc+i%10;
        }
        System.out.println(sonuc);

        //Example 4: Size verilen bir Stringi ters çeviren kodu yazınız

        String str = "Kaba";
        //Concatenation yapacaksanız ""; boş alınır.
        String ters = "";

        for (int i=str.length()-1; i>-1; i--) {
            char c= str.charAt(i);
            ters = ters + c;
        }

        System.out.println(ters);

        //Example
        Scanner input1 = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String str1 = input1.nextLine();
        String ters1 = "";

        for (int i=str1.length()-1; i>-1; i--) {
            char d= str1.charAt(i);
            ters1 = ters1 + d;
        }
        System.out.println(ters1);



    }
}

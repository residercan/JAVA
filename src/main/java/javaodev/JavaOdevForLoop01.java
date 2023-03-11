package javaodev;

import java.util.Scanner;

public class JavaOdevForLoop01 {
    public static void main(String[] args) {

        //Example 1: Ekrana 10 kez "Java guzeldir" yazdırın

        String str = "Java guzeldir";

        for (int i = 1; i < 11; i++) {
            System.out.println(str);
        }

        //Example 2: 10 ile 30 arasındaki sayıları aralarında virgül olarak aynı satırda yazdırın.


        //Example 6: KUllanıcıdan 100 den küçük bir tamsayı isteyin, girilen sayiya kadar tüm sayıları yazdırın
        //Ancak;
        //Sayi 3'un kati ise sayi yerine "Java" yazdırın
        //Sayi 5'in kati ise sayi yerine "Guzeldir" yazdırın
        //Sayi hem 3'ün hem 5'in kati ise sayi yerine "Java guzeldir" yazdırın

        Scanner input = new Scanner(System.in);
        System.out.println("100'den küçük bir tamsayı giriniz");
        int sayi = input.nextInt();

        for (int i = sayi; i < 101; i++) {
            System.out.println(i);
            if(i%3==0){
                System.out.println("Java");
            } else if(i%5==0){
                System.out.println("Guzeldir");
            } else if(i%3==0 && i%5==0){
                System.out.println("Java guzeldir");
            }
        }


    }
}

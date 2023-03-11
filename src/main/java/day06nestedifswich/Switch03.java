package day06nestedifswich;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {

        // Kullanıcıdan işlem ve iki tane sayı alarak işlemin sonucunu ekrana yazdıran basit bir hesap makinası yapınız
        // Note: Switch de sadece int, byte, short, char ve String data tipleri kullanılabilir

        Scanner input = new Scanner(System.in);

        System.out.println("Yapmak istediğiniz işlemi giriniz: +, -, *, /, %");

        char islem = input.next().charAt(0);

        System.out.println("İlk sayıyı giriniz");
        double ilk = input.nextDouble();
        System.out.println("İkinci sayıyı giriniz");
        double ikinci = input.nextDouble();

        switch (islem){
            case '+' :
                System.out.println(ilk + ikinci);
                break;
            case '-' :
                System.out.println(ilk-ikinci);
                break;
            case '*' :
                System.out.println(ilk*ikinci);
                break;
            case '/' :
                System.out.println(ilk/ikinci);
                break;
            case '%' :
                System.out.println(ilk*ikinci/100);
                break;
            default:
                System.out.println("Bu işlem tanımlanmamıştır");
        }








    }
}

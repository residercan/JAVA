package javaodev;

import java.util.Scanner;

public class JavaOdevSwitch01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Yapmak istediğiniz işlemi seçiniz");
        char islem = input.next().charAt(0);
        System.out.println("ilk sayıyı giriniz");
        double ilk = input.nextDouble();
        System.out.println("ikinci sayıyı giriniz");
        double ikinci = input.nextDouble();



        switch (islem){
            case '+':
                System.out.println(ilk+ikinci);
                break;
            case '-':
                System.out.println(ilk-ikinci);
                break;
            case '*':
                System.out.println(ilk*ikinci);
                break;
            case '/':
                System.out.println(ilk/ikinci);
                break;
            case '%':
                System.out.println(ilk*ikinci/100);
                break;
            default:
                System.out.println("Geçerli bir işlem giriniz");


        }





    }



}

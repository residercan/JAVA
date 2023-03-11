package day05ifstatment;

import java.util.Scanner;

public class IfStatment01 {

    public static void main(String[] args) {

        //Example 1: kullanıcıdan alınan sayının tek mi çift mi olduğunu ekrana yazınız

        //1. Yol

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("bir sayı giriniz");
//
//        int s = input.nextInt();
//
//        if(s%2==0){
//            System.out.println("çift sayi");
//        }
//
//        //"!=" demek "eşid değil" demektir.
//        if(s%2!=0){
//
//            System.out.println("Tek sayi");
//
//        }

        //2. Yol

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Bir sayı giriniz");
//        int s = input.nextInt();
//
//        if(s%2==0){
//            System.out.println("çift sayı");
//        }else{
//            System.out.println("tek sayı");
//        }


        //Example 2: Bir sayının negatif, pozitif veya nötr olduğunu söyleyen kodu yazınız

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz");

        double d = input.nextDouble();

        if(d>0){
            System.out.println("pozitif");
        }else if(d==0){
            System.out.println("nötr");
        }else {
            System.out.println("negatif");
        }

    }



}

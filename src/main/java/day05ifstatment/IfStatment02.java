package day05ifstatment;

import java.util.Scanner;

public class IfStatment02 {

    public static void main(String[] args) {

       //Example 1: Kullanıcı gün numarasını girsin kod gün ismini yazsın
       //           2=> pazartesi, 5=> perşembe

        Scanner input = new Scanner(System.in);

        System.out.println("Gün numaranızı giriniz");

        byte gunNo = input.nextByte();

        if(gunNo==1){
            System.out.println("pazar");
        } else if (gunNo==2) {
            System.out.println("pazartesi");
        } else if (gunNo==3) {
            System.out.println("Salı");
        } else if (gunNo==4) {
        System.out.println("çarşamba");
        } else if (gunNo==5) {
        System.out.println("perşembe");}
        else if (gunNo==6) {
        System.out.println("cuma");
        } else if (gunNo==7) {
        System.out.println("cumartesi");}
        else {System.out.println("gecerli bir gün numarası giriniz. Geçerli gün numaraları 1-7 rakamaları dahil aralıgındadır");
        }

    }


}

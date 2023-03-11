package javaodev;

import java.util.Scanner;

public class JavaOdevSwitch02 {

    public static void main(String[] args) {

        //Kullanıcı mile değerini 10 ve operatörü milden kmye olarak girdiğinde, konsolda kodunuz 16 km yazmalıdır


        double mil = 10;

        double saniye = 7200;

        double fahrenayt = 83;

        System.out.println("yapmak istediğiniz işlemi yazınız; km, saat, santigarat");
        String operator = "saat";

        switch (operator){
            case "km":
                System.out.println(mil*1.60934);
                break;
            case "saat":
                System.out.println((saniye/60)/60);
                break;
            case "santigarat":
                System.out.println((fahrenayt-32)*5/9);
                break;
            default:
                System.out.println("Bu operatör o dönüştürücü için tanımlanmadı");
        }







    }

}

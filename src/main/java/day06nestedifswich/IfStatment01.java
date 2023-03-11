package day06nestedifswich;

import java.util.Scanner;

public class IfStatment01 {

    public static void main(String[] args) {

        //Kullanıcıdan yaş değerini alan ve yaşın hangi evrede olduğunu aşağıdaki tabloya göre ekrana kodu yazınız
        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //Tanimlanmamis evre


        Scanner input = new Scanner(System.in);

        System.out.println("lütfen yaşınızı giriniz");

        int yas = input.nextInt();

        if (yas < 0) {
            System.out.println("Geçerli yas giriniz");
        } else if (yas <5) {
            System.out.println("Bebek");
        } else if (yas <13) {
            System.out.println("Cocuk");
        } else if (yas <21) {
            System.out.println("Genc");
        }
          else if (yas <31) {
            System.out.println("Yetiskin");
        } else {
            System.out.println("Tanımlanmamıs Evre");
        }

          //Boundary Value Analyze Test - sınır değeri analizi testi BVA





    }


}

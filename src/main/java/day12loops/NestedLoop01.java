package day12loops;

import java.util.Scanner;

public class NestedLoop01 {

    public static void main(String[] args) {

        //Example 1 :
        //Aşağıdaki şekli ekrana yazdıran kodu yazınız
        //****
        //****
        //****

        Scanner input = new Scanner(System.in);
        System.out.println("Satır sayisini giriniz");
        int satir = input.nextInt();

        System.out.println("Sutun sayisini giriniz");
        int sutun = input.nextInt();

        System.out.println("Karakter seçiniz");
        char ch = input.next().charAt(0);

        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <= sutun; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }


        /*
        Example 2 : Aşağıdaki şekli çizen kodu yazınız
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5
         */


        for (int i=1; i<6; i++){
            for (int k=1; k<=i; k++){
                System.out.print(k + " ");
                }
                System.out.println();
            }



        //Example 3 : Aşağıdaki şekli çizen kodu yazınız

            /*
                * * * *
                * * *
                * *
                *
             */

        for (int i=1; i<5; i++){
            for (int k=4; k>=i; k--){
                System.out.print("* ");
                }
                System.out.println();
            }


    }
}

package javaodev;

import java.util.Scanner;

public class JavaOdevIfStatment01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ayın numarasını giriniz");

        byte ayNo = input.nextByte();

        if(ayNo==1){
            System.out.println("Ocak");
        }  else if(ayNo==2){
            System.out.println("Şubat");
        }  else if(ayNo==3){
            System.out.println("Mart");
        }  else if(ayNo==4){
            System.out.println("Nisan");
        }  else if(ayNo==5){
            System.out.println("Mayıs");
        }  else if(ayNo==6){
            System.out.println("Haziran");
        }  else if(ayNo==7){
            System.out.println("Temmuz");
        }  else if(ayNo==8){
            System.out.println("Agustos");
        }  else if(ayNo==9){
            System.out.println("Eylül");
        }  else if(ayNo==10){
            System.out.println("Ekim");
        }   else if(ayNo==11){
            System.out.println("Kasım");
        }   else if(ayNo==12){
            System.out.println("Aralık");
        }   else{
            System.out.println("Geçerli bir ay numarası giriniz");
        }



    }



}

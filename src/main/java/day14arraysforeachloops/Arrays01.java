package day14arraysforeachloops;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    //Arrays'lerin içine "primitive" data tipleri ve "referencelar(adres)" yerleştirilebilir.

    public static void main(String[] args) {


        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprise you";

        System.out.println(Arrays.toString(str));

        //String bir Array oluşturunuz ve "Tom" ve "Tom"'dan önceki tüm elemanları ekrana yazdırınız
        String arr[] = {"Jane", "Mark", "Christopher","Tom", "Ali", "Rojda"};

        for (String w : arr){
            System.out.print(w + " ");
            if (w.equals("Tom")){
                break;
            }
        }

        System.out.println();
        //String bir Array oluşturunuz "Tom" ve "Jane" dışındakileri yazdırınız

        String brr[] = {"Jane", "Mark", "Christopher","Tom", "Ali", "Rojda"};

        for (String w : brr){

            if (w.equals("Tom") || w.equals("Jane")){
                continue;
            }
            System.out.print(w + " ");
        }

        System.out.println();

        //Example 3: (Kullanıcı ile beraber bir Array oluşturunuz ve içine data ekleyiniz.)
        //           Bir öğretmenin sınıfındaki öğrencilerin isimlerini application'a yüklemesini sağlayan kodu yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Kac öğrenci ismi gireceksiniz");
        int numOfStd = input.nextInt();
        String names[] = new String[numOfStd];
        System.out.println("Girişi sonlandırmak için Q harfine basınız");

        for (int i= 1; i<=numOfStd; i++){
            System.out.println("Lütfen " + i + ". öğrencinin ilk ismini giriniz");
            String stdNames= input.next();

            if (stdNames.equalsIgnoreCase("Q")){
                break;


            }
            names[i-1] = stdNames;
        }

        System.out.println(Arrays.toString(names));



    }
}

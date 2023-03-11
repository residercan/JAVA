package javaodev;

import java.util.Scanner;

public class JavaOdevIfStatment03 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Ucgenin kenar uzunluklarını giriniz");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a==b&&b==c){
            System.out.println("Eskenar Ücgen");
        }
        else if(a==b&&b!=c || a==c&&b!=c || b==c&&a!=c){
            System.out.println("İkizkenar Ücgen");
        }else{
            System.out.println("Cesit Kenar Ücgen");}















    }



}

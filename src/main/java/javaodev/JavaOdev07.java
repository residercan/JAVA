package javaodev;

import java.util.Scanner;

public class JavaOdev07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Birinci Kenar Uzunluğunu giriniz");

        byte a = input.nextByte();

        System.out.println("İkinci kenar uzunluğunu giriniz");

        byte b = input.nextByte();

        System.out.println("Üçüncü kenar uzunluğunu giriniz");

        byte c = input.nextByte();

        System.out.println(a+b+c);



    }


}

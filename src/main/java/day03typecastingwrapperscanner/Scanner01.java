package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {


    //scanner kullanıcıdan data almaya yarar
    //scanner kullanıcı ile etkileşim kurmamızı sağlar
    //scanner bir java classıdır. bu classı kullanabilmek için import etmek gerekir.
    //import dışardan bişey almaya denir
    //scanner classı javanın util kütüphanesindedir


    public static void main(String[] args) {

        //kullanıcıdan data almak için yapılması gerekenler
        //1. adım scanner classından obje oluşturun

        Scanner input = new Scanner(System.in);

        //2. adım kullanıcıya ne yapacağını söylemem lazım

        System.out.println("hey kullanıcı yaşını gir...");

        //3. adım kullanıcıdan aldığımız datayı bir variablen içine koy

        byte age = input.nextByte();

        System.out.println("hey kullanıcı senin yaşın " + age);

    }

}

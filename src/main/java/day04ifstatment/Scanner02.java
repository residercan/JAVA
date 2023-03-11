package day04ifstatment;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {
        //Kullanıcıdan ilk ve soy ismini alınız, ilk ve soy isminin ilk harflerini ekrana yazdırınız


        Scanner input = new Scanner(System.in);

        System.out.println("ilk isminizi yazınız");

        char ilk = input.next().charAt(0);

        System.out.println("soy isminizi yazınız");

        char soy = input.next().charAt(0);

        System.out.println(ilk + soy);





    }


}

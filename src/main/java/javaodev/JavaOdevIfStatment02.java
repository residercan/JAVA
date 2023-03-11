package javaodev;

import java.util.Scanner;

public class JavaOdevIfStatment02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir rakam giriniz");

        int sonbasamak = input.nextInt();

        if (sonbasamak % 10 >= 5) {
            System.out.println("Son basamagi bir üst ondalıga yuvarla: " + (sonbasamak / 10 + 1) * 10);
        } else {
            System.out.println("Son basamagi bir alt ondalıga yuvarla: " + (sonbasamak/10)*10);
        }


    }

}

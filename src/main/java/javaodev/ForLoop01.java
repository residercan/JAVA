package javaodev;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {

        //Ekrana 10 kez "Java güzeldir" yazdırın

        String str = "Java güzeldir";

        for (int i = 1; i < 11; i++) {
            System.out.println(str);
        }

        //10 ile 30 arasındaki sayilari aralarında virgül olarak ayı satırda yazdırın

        int sayi = 0;

        for (int i = 10; i < 31; i++) {
            sayi = i;
            System.out.print(sayi + ", ");
        }

        System.out.println();

        //100'den başlayarak 50'ye(dahil) kadar olan sayiları aralarında virgül olarak aynı satırda yazdırın

        int sayi1 = 0;

        for (int i = 100; i > 49; i--) {
            sayi1 = i;
            System.out.print(sayi1 + ", ");
        }

        System.out.println();

        //Kullanıcıdan 100'den küçük bir tamsayı isteyin.
        // 1'den başlayarak girilen sayiya kadar 3'un katı olan sayıları yazdırın










    }
}

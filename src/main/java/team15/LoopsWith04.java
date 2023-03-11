package team15;

public class LoopsWith04 {
    public static void main(String[] args) {

        /*
             24) Kullanıcıya kaç tane fibonacci sayısı görmek istediğini sorunuz. Ardından bu fibonacci
sayılarını yazdıran kodu yazınız.
Örnek: kullanıcı 6 girerse çıktı 1 1 2 3 5 8 olacaktır.
         */
        int number = 6;
        int fibonacci1 = 1;
        int fibonacci2 = 1;
        System.out.print(fibonacci1 + " ");
        System.out.print(fibonacci2 + " ");
        for (int i = 1; i<number-1; i++) {
            int fibonacciToplam = fibonacci1 + fibonacci2;
            fibonacci1 = fibonacci2;
            fibonacci2 = fibonacciToplam;
            System.out.print(fibonacciToplam + " ");
        }



    }
}

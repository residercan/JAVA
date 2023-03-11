package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {


        //Example 1: Kullanıcıdan bir sayı alınız, sayı 100'den küçük ise ekrana "Kazandın" yazdırınız
        //           Aksi halde ekrana "Kaybettin" yazdırınız
        //           Kullanıcı kazandıkça oyun devam etmeli

        Scanner input=new Scanner(System.in);
//        int sayi=0;
//        do {
//            System.out.println("Bir sayi giriniz: ");
//            sayi=input.nextInt();
//
//            if (sayi<100){
//                System.out.println("Kazandiniz..");
//            }
//            else{
//                System.out.println("Kaybettiniz");
//            }
//
//        }while(sayi<100);

        //Example 2: Kullanıcıdan ismin alınız ilk harfin büyük olup olmadığını kontrol ediniz.


        do{
            System.out.println("Bir isim giriniz");
            char ilkHarf = input.next().charAt(0);

            if (ilkHarf>='A' && ilkHarf <= 'Z'){
                System.out.println("İsmi başarıyla girdiniz");
            }else{
                System.out.println("İsmi yanlış girdiğiniz için işleminiz iptal edilmiştir.");
                break;
            }
        } while (true);

        //Infinite loop: Sonsuz döngü
        //Artırma azaltma kısmında hata yaparsanız infinite loop sorunsalı oluşur.
        for (int i = 1; i<4; i++){//eğer i-- yapmış olsak veya hiç birşey yazmasak infinite loop olurdu veya hiç birşey yazmasak
            System.out.println("Hi");
        }




    }
}

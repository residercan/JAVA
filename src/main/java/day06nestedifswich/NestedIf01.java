package day06nestedifswich;

public class NestedIf01 {

    public static void main(String[] args) {


        /*
       passwordun ilk harfi büyük harf ise
       "A" olursa geçerli password aksi halde geçersiz passworddur.
       passwordun ilk harfi kücük harf ise
       "z" olursa geçerli password aksi halde geçersiz passworddur.
         */

        String pwd = "Axy12!";

        char ilkHarf = pwd.charAt(0);

        if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
            if (ilkHarf == 'A') {
                System.out.println("Geçerli password");
            } else {
                System.out.println("Geçersiz password");
            }
        } else if (ilkHarf >= 'a' && ilkHarf <= 'z') {
            if (ilkHarf == 'z') {
                System.out.println("Geçerli password");
            } else {
                System.out.println("Geçersiz password");
            }
        } else {
            System.out.println("İlk karakter harf olmalıdır");
        }

        //Nested iç içe girmiş demektir.
        //Note: Java "nested" kodlari calistirirken cok zaman harcar, buna "Time Complexity" denir.
        //      Bu yuzden mumkunse "nested" kod yazmamaya calisiriz.


    }


}

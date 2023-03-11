package day07ternarystringmanipulation;

public class NestedTernary02 {

    public static void main(String[] args) {

    /*
        Verilen yılın "Leap Year(Artık Yıl)" olup olmadığını kontrol eden kodu yazınız..
        1) Yıl 100e bölünürse 400 e de bölünmelidir.
        2) yıl 100e bölünmezse 4 e bölünmelidir.
    */

        int year = 1600;


      String leap = year%100==0 ? (year%400==0 ? "Leap year" : "Leap year değil") : (year%4==0 ? "Leap year" : "Leap year değil");

        System.out.println(leap);


        /*
            Aşağıdaki kurallara göre passwordun geçerli olup olmadığını kontrol eden kodu yazınız
            1- 8 karakterden fazla veya 8 karakter varsa ilk harfi "i" olmalıdır
            2- 8 karakterden az karakter varsa ilk harfi "K" olmalıdır
         */

        String pwd = "i2a3ed54";

        char ilkHarf = pwd.charAt(0);

        String gecerli = pwd.length()<8 ? (ilkHarf=='K' ? "Geçerli" : "Geçersiz") : (ilkHarf=='i' ? "Geçerli" : "Geçersiz");

        System.out.println(gecerli);



    }


}

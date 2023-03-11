package day19datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {

        //Example 1 : Japonya ile Almanya arasındaki zaman farkını hesaplayan kodu yazınız.

        LocalDateTime japan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        Long fark = ChronoUnit.HOURS.between(germany, japan);

        System.out.println(fark);

        //Example 2 : Sabit bir tarih oluşturunuz

        LocalDate myDate = LocalDate.of(2011, Month.APRIL,13);
        System.out.println(myDate);//2011-04-13

        /*
        Javada sabit dataları(gün isimleri, ay isimleri, amerikadaki eyalet isimleri..) depolamak ve
        gerektiğinde kullanmak için depolar oluştururuz. Bu depolara "Enum" denir.
        Enum'ların içine değişecek datalar konulmaz sabit datalar konulur.
         */

        //Example 3 : USA için "Woow!", UK için "Big", Canada için "Cold",
        // Turkey için "Vatan", Germany için "Araba", Rwanda için "Çay"

        Countries country = Countries.USA;

        switch (country) {
            case USA:
                System.out.println("Woow");
                break;
            case UK:
                System.out.println("Big");
                break;
            case Canada:
                System.out.println("Cold");
                break;
            case Turkey:
                System.out.println("Vatan");
                break;
            case Germany:
                System.out.println("Araba");
                break;
            case Rwanda:
                System.out.println("Cay");
                break;
            default:
                System.out.println("Tanımlanmamıs ülke");


        }
    }
}

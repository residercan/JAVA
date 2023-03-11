package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {

    public static void main(String[] args) {

        //Example 1 : "Anlık tarihi" (Current Date) ekrana yazdıran kodu yazınız

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//2022-10-21

        //Example 2 : "Anlık zamanı" (Current Time) ekrana yazdıran kodu yazınız

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);//20:41:38.305277200

        //Example 3 : "Anlık tarihi" (Current Time) ve "Anlık zamanı" ekrana yazdıran kodu yazınız.

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);//2022-10-21T20:45:11.265369900

        //Example 4 : Japanya'daki anlık tarihi ve anlık zamanı ekrana yazdıran kodu yazınız

        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);//2022-10-22T02:50:23.267831300

        //Example 5 : İstanbul'daki anlık tarihi ve anlık zamanı ekrana yazdıran kodu yazınız
        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);

        //Example 6 : Bugünden 789 gun sonra emekli olacağınıza göre emeklilik tarihini hesaplayan kodu yazınız.

        LocalDate countDate = LocalDate.of(2022,10,21);// bu kod dinamiktir. yarından itibaren başlarsanız da kabul eder.
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);//2024-12-18

        //Example 7 : İki çocuğunuzun doğum tarihleri arasındaki farkı gün olarak hesaplayan kodu yazınız.
        LocalDate dobAli = LocalDate.of(2005,5,17);
        LocalDate dobVeli = LocalDate.of(2013,2,8);
        //between methodu kullanıldığında eski olan, büyük olan önce yazılır.
        Long diff = ChronoUnit.DAYS.between(dobAli, dobVeli);
        System.out.println(diff);//2824

        //Example 8 : Tom, Ali'den 3 yıl 8 ay 13 gün sonra doğdu, Ali ise Veliden
        //1 yıl 15 gün önce doğdu. Tom'un doğum tarihi 18 Kasım 2011 ise Veli ve Alinin
        //doğum tarihlerini bulunuz.

        LocalDate dobTom = LocalDate.of(2011,11,18);
        LocalDate dobAli1 = dobTom.minusYears(3).minusMonths(8).minusDays(13);
        LocalDate dobVeli1 = dobAli1.plusYears(1).plusDays(15);
        System.out.println(dobAli1);//2008-03-05
        System.out.println(dobVeli1);//2009-03-20

        //Example 9: İstanbul'un fethi ile Cumhuriyet'in kurulması arasında kac ay olduğunu gösteren kodu yazınız
        // 29 Mayis 1453 - 29 Ekim 1923
        LocalDate istanbulFethi = LocalDate.of(1453,5,29);
        LocalDate cumhuriyet = LocalDate.of(1923,10,29);
        Long aySayisi = ChronoUnit.MONTHS.between(istanbulFethi, cumhuriyet);
        System.out.println(aySayisi);//5645

        //Example 10: Verilen tarihin hangi burçta olduğunu gösteren kodu yazınız

        LocalDate myDate = LocalDate.of(1994,3,28);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        System.out.println(day + " " + month);


        if (day > 21&& month==4 || month==5 && day<20){
            System.out.println("boga");
        }
        if (day > 21&& month==5 || month==6 && day<21){
            System.out.println("ikizler");
        }
        if (day > 22&& month==6 || month==7 && day<22){
            System.out.println("yengeç");
        }
        if (day > 23&& month==7 || month==8 && day<23){
            System.out.println("aslan");
        }
        if (day > 24&& month==8 || month==9 && day<23){
            System.out.println("başak");
        }
        if (day > 24&& month==9 || month==10 && day<23){
            System.out.println("terazi");
        }
        if (day > 24&& month==10 || month==11 && day<22){
            System.out.println("akrep");
        }
        if (day > 23&& month==11 || month==12 && day<21){
            System.out.println("yay");
        }
        if (day > 22&& month==12 || month==1 && day<20){
            System.out.println("oğlak");
        }
        if (day > 21&& month==1 || month==2 && day<19){
            System.out.println("kova");
        }
        if (day > 21&& month==3 || month==4 && day<20){
            System.out.println("koç");
        } else System.out.println("Geçerli bir tarih giriniz");



    }
}

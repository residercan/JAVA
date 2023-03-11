package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        //Example 1 : Javadan aldığınız date'i "ay/gün/yıl" olarak yazınız.
        LocalDate currentDate = LocalDate.now();//2022-10-21
        System.out.println(currentDate);

        //MM 10'dan küçük ayları 01,02,03 şeklinde yazar
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formettedDate1 = dtf1.format(currentDate);
        System.out.println(formettedDate1);//10/21/2022

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formettedDate2 = dtf2.format(currentDate);
        System.out.println(formettedDate2);//Eki/21/2022

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formettedDate3 = dtf3.format(currentDate);
        System.out.println(formettedDate3);//Ekim/21/2022

        //M yazarsak 10'dan küçük ayları 1, 2, 3 şeklinde yazar
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");
        String formettedDate4 = dtf4.format(currentDate);
        System.out.println(formettedDate4);//10/21/2022

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM/dd/yy");
        String formettedDate5 = dtf5.format(currentDate);
        System.out.println(formettedDate5);//10/21/22

        //d 10'dan küçük günleri 1, 2, 3 şeklinde yazar 01,02,03 kullanmak için dd kullanmak gerekir.
        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MM/d/yy");
        String formettedDate6 = dtf6.format(currentDate);
        System.out.println(formettedDate6);//10/21/22


        //Example 2: Javadan aldığınız time'ın formatını değiştiriniz

        LocalTime myTime = LocalTime.of(16,23,54,2345);
        System.out.println(myTime);//16:23:54.000002345

        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm");//HH 24 saat sistemini, hh 12 saat sistemini kullanır.
        String formettedMyTime1 = dtf7.format(myTime);
        System.out.println(formettedMyTime1);//04:23//16:23

        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("hh:mm a");
        String formettedMyTime2 = dtf8.format(myTime);
        System.out.println(formettedMyTime2);//04:23 PM-ÖS

    }
}

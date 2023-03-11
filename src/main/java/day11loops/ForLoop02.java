package day11loops;

public class ForLoop02 {
    public static void main(String[] args) {

        //Bir String deki "m" karakteri haric tüm karakterleri yazdırınız
        //Andromeda ==> Androeda

        String str = "madam";

        //1. Yol
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != 'm') {
                System.out.print(c);
            }

        }

        System.out.println();
        //2. Yol
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'm') {
                continue;//Bosver onu demektir. m'yi görme demektir.
            }
            System.out.print(c);
        }
        //Loop'un içinde bazi değerler için Loop'un çalışmamasını isterseniz continue kullanınız.


        System.out.println();

        //Example 2: 1'den 100'e kadar 6 ile bölünenler hariç tüm tam sayıları ekrana yazdırınız

        for (int i = 0; i < 101; i++) {
            if (i % 6 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();


        //Example 3: Size verilen bir String'deki 'm'den önceki karakterleri yazdırınız
        //Luxemburg ==> Luxe

        String s = "Luxemburg";

        for (int i =0; i< s.length(); i++){
            char c = s.charAt(i);
            if (c =='m'){
                break;
            }
            System.out.print(c);
        }

    }
}

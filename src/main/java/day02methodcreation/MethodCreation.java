package day02methodcreation;

public class MethodCreation {

    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2, 5));

        System.out.println(carpmaYap(3, 5, 7.5));

        System.out.println(ikiSayiyiToplaUcuncuSayiylaCarp(5, 8, 4));

        System.out.println(UcKisininYaslariniToplaUceBol(12,18,14));

        System.out.println();



        MethodCreation obj = new MethodCreation();


    }


    //sout yazip "Enter" a basiniz System.out.println() otomatik olarak yazilir.
    //Ekrana bir sey yazdirmak icin iki tane kod var i)System.out.println() ==> Satirbasi yapar      ii)System.out.print() ==> Satirbasi yapmaz

    //sout yazıp entere basarsak System.out.println otomatik olarak gelir.
    //main method içinde kullanacağınız hersey static olmalıdır.
    /* 1) Acsess Modifera
        2)

        3) Void: Bu method yeni bir data uretmiyor demektir.
        Ornegin; ekrana bir sey yazdirma methodu, bit tusa tiklama methodu gibi…
        4) main methodun ismi

        6) method body

         */

    //Example 1: Toplama işlemi yapan bir method oluşturunuz
    //Methodlar eylem olduğu icin toplamma yap yazıldı sadece toplama yazılmamasının nedeni budur.


    public static double toplamaYap(double a, double b) {
        return a + b;
    }

    public static double carpmaYap(double a, double b, double c) {
        return a * b * c;
    }

    //Example 2: üc sayıyı birbiri ile carpan bir method olusturunuz

    //Example 3: 3 sayıdan ik ikisini toplayıp ucuncu ile capan method olusturup sonucu ekrana yazdırınız

    public static double ikiSayiyiToplaUcuncuSayiylaCarp(double a, double b, double c) {
        return (a + b) * c;
    }

    //Example 4: 3 kisilik sınıfın yas ortalamasını hesapla?

    public static int UcKisininYaslariniToplaUceBol(int a, int b, int c){

        return (a+b+c)/3;
    }


}
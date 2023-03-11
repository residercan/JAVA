package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //Type Casting: bir nümeric data tipini diğer nümeric data tipine cevirmek demektir.
    //byte short int long float double nümeric data tipleri
    //Auto Widening küçükten büyüğe çevirirken kullanılır. Otomatik olarak yapılan genişletme işlemi
    //Explicit Narrowing büyükten küçüğe çevirirken kullanılır. Açıkça daraltma demektir.


    public static void main(String[] args) {

        byte age = 23;
        int newAge = age;

        long population = 1234;
        int newPopulation = (int)population;

        //Example 1 shortu double çeviren kodu yazınız
        //Example 2 floatı byte yapan kodu yazınız


        short a = 12;
        double newA = a; //Auto Widening

        float b = 12.99F;
        byte newB = (byte)b; //Explicit Narrowing

        System.out.println(newB);

        //Java ondalık sayıyı tam sayıya çevirirken yuvarlamma işlemi yapmaz
        //Java ondalık sayıyı tam sayıya çevirirken ondalık kismini siler


        int number = 515;
        byte newNumber = (byte)number;

        System.out.println(newNumber); //Java 515i 256ya.(bytetaki sayıların sayısı) böldü kalanı return etti.


        int nun = 510;
        byte newNun = (byte)nun;

        System.out.println(newNun);

    }


}

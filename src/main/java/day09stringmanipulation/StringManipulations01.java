package day09stringmanipulation;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        String str = "Kara kara düsünme ankara";

        int idxA = str.indexOf("kara");

        System.out.println(idxA); // 1 verecektir.

        //Note IndexOf() methodu verilen karakterlerin "ilk görünümünün" indexini verir.


        //lastIndexOf methodu verilen karakterlerin "son görünümünün" indexini verir.
        //lastIndexOf methodu kara kelimesini aldığı zaman metinin en sonundaki karayı alır ve k harfinin indexini verir bize.

        int idxA2 = str.lastIndexOf("kara");

        System.out.println(idxA2);


        String s = "Mississippi";

        int S = s.indexOf('i'); //IndexOf hem String hem de char ile kullanılabilir.

        System.out.println(S);

        int S2 = s.indexOf("iss");

        System.out.println(S2);

        int S1 = s.lastIndexOf("iss");

        System.out.println(S1);

        //IndexOf ilk gorunumunun ilk karakterinin indexini verir
        //LastIndexOf son görünümünün ilk karakterinin indexini verir.



        //Example 1: Bir Stringdeki bir karakterin tekrarlı veya tekrarsız olup olmadığını gösteren kodu yazınız
        //           "Hellooo" ==> H Tekrarsız - e Tekrarsz - l Tekrarlı - o Tekrarlı

        String t = "Helloooo";

        if(t.indexOf("o")==t.lastIndexOf("o")) {
            System.out.println("Tekrarsız");
        } else {
                System.out.println("Tekrarlı");
            }

        String u = "Learn Java earn money";

        int sonuc = u.indexOf("n", 5);

        System.out.println(sonuc);
        //IndexOf iki parametre ile kullanılırsa ikinci parametrede verilen sayi kadar karakteri geçtikten
        //sonra istenen karakterin ilk görünümün indexini return eder

        //lastIndexOf iki parametre ile kullanılırsa ikinci parametrede verilen sayiyi index olarak kabul edip en baştan
        // bu indexe kadar olan karakterleri bir kutu içine alınız ve lastIndexOf methodunu sadece bu kutu içindeki String için kullanınız
        String m = "Hello everyone";
        int e = m.lastIndexOf("e", 5);
        System.out.println(e);

       String v = "Java is Java";

       boolean bosMu = v.isEmpty();

        System.out.println(bosMu);

        //isEmpty methodu verilen stringde hiç karakter yoksa true der
        //karakter varsa false veriyor. bu yüzden boolean ile kullanılır.
        //length()==0 demek isEmpty() true verir demektir.
        //Bir Stringin bos olup olmadığını anlamak için lenght == 0 kullanmayın isEmpty kullanın..

        String x = " ";
        boolean blankMi = x.isBlank();

        System.out.println(blankMi);

        //isBlank hem boş string için hemde sadece space içeren stringler için true return eder

        //Example 2: kullanıcıdan alınan isim mutlaka spaceden farklı en az 1 karakter içermelidir.

        Scanner input = new Scanner(System.in);
        System.out.println("İsminizi giriniz");
        String isim = input.nextLine();

        if(isim.isBlank()){
            System.out.println("Sana ismini gir dedim");
        } else {
            System.out.println(isim);
        }

    }


}

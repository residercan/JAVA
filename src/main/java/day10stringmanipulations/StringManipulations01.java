package day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        String a = "Java kolaydir.";

        boolean b = a.startsWith("kola",5);
        System.out.println(b);
        //startsWith kodu ilk 5 karakterden sonraki Stringe bakar ve o Stringin kola ile başlayıp başlamadığını kontrol eder.
        //kola ile başlıyorsa true başlamıyorsa false return eder.


        //replaceFirst("a", "*"); kodu String deki ilk "a" yi "*" a çevirir.
        //replace("a", "*"); kodu Stringdeki tüm "a" ları "*" a çevirir.
        String c = a.replaceFirst("a", "*");
        System.out.println(c);

        //concat(" Anladın mı?"); methodu iki tane Stringi birbirine yapıştırmaya yarar.
        //concat işlemi iki türlü yapılabilir; 1. + ile yapılabilir. 2. concat ile yapılabilir.
        //Java bir işlem için method üretmişse o methodu kullanmak "best practice"dir.
        String d = a.concat(" Anladın mı?");
        System.out.println(d);


       //trim methodu bir Stringin baş ve sonundaki "space" karakterlerini siler, aradaki "space" karakterlerine dokunmaz.
        String e = "    Tom Hanks    ";
        System.out.println(e);
        String f= e.trim();
        System.out.println(f);

        //h.compareTo(i) kodu iki tane String'i alfabetik(lexicographic) olarak karşılaştırır.
        //Büyük harfe duyarlıdır
        //büyük harf küçük harfe duyarlı olmasını istemezseniz compareToIgnoreCase kullanabilirsiniz.
        //h.compareTo(i) kodda "h"nin alfabetik sırasından "i" nin alfabetik sırası çıkarılır.
        String h = "Java";
        String i = "Kava";
        int k = h.compareTo(i);
        System.out.println(k);


        //a.repeat(5) kodu a Stringini yan yana 5 kere yapıştırır.
        //a.repeat(0) kodu emty String return eder.
        String n = a.repeat(5);
        System.out.println(n);



    }
}

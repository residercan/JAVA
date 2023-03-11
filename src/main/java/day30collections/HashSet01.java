package day30collections;

import java.util.HashSet;

public class HashSet01 {


    /*
    HashSetler ne zaman kullanılır:
    1)tekrarsiz elemanlarda
    2)sırlama onemli degilse
    3)hız cok önemliyse
    4)Indeks kullanmazlar
    Mesela kimlik numaraları depolamada kullanılır.
     */


    //hash bir tekniktir birbirine benzemeyen data üretir.
    //Set'lere,çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)

    //Hash bir tekniktir,birbirine benzemeyen code'lar üretir. Bu code'lar datayı unique(eşsiz) yapar.
    //Set'lere, çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)
    //HashSet'ler eklenen elemanların sıralaması ile uğraşmaz.
    //HashSet'ler index kullanmazlar. Çünkü sıralama rastgele yapıldığı için index manalı olmaz.
    /*
    HashSet arayüzü verileri düzensiz sıralar, performans olarak tasarruf etmenizi sağlar.
    HashLinkedSet ise verileri eklenen sıraya göre düzenli tutar eğer verilerin sırası önemli değilse
    HashLinkedSet size ekstra maaliyet oluşturacaktır.
    */



    /*
    * Set --> HashSet :
            * 1) HashSet, duplicationa(tekrarli eleman) izin vermez.
            * Eger bir elemani tekrar HashSet e eklemek isterseniz eski olan silinip, yeni olan uzerine yazilir.
            * 2) HashSet'ler Set'ler arasinda en hizli olanidir. Bir algoritmaya gore kayit eder.
            * Degerlerin giris sirasina dikkat edilmez.(LinkedHashSet haric)
            * 3) HashSet "null" object'ini eleman olarak kullanabilir.
            * Ancak birden fazla null degerini bir HashSet e eklemek isterseniz sadece bir tane null degeri olur.
    */

    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange] random order yaptı

        //Var olan elemanı eklerseniz hata vermez. Son ekleneni var olan datanın üstüne yazar.(Overwrite)(üstüne yazma)
        emails.add("Mango");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        emails.add(null);
        emails.add(null);//null 3 kere ekledik mesela ama 1 kere yazıyor çünkü ilk null'ın üzerine yazıyor(Overwrite)
        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange]



    }
}

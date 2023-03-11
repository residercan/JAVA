package day29abstractioncollections;

    /*
    Collection: birden fazla datanın depolanması.
    Array ilkel bu yüzden collectionlara dahil değil.
    List'ler collection'lara dahil.

    Collection diyince bunlar aklınıza gelmeli:
    1)List  i)ArrayList ii)LinkedList
    2)Set
    3)Queue

    >List'lere çoklu ve tekrarlı data depolamak istediğimizde ihtiyaç duyarız, Ör:bir okuldaki öğrenci isimleri.
    >>Set'lere çoklu ama tekrarsız data depolamak istersek ihtiyaç duyarız, Ör: bir okuldaki öğrenci ID'leri.
    --Set ve List'i amacına göre kullanın.
    >>>Queue'lara FIFO(first in first out) veya LIFO(last in firts out) gerektiğinde Queue kullanılır, Ör: bankadaki günlük müşteriler.
    */


    /*
      ArrayList'ler ayni data tipine sahip birden fazla data'yi depolamak icin kullanilir.
      Array ile ArrayList'in farki nedir?

         1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz.
           Array'ler eleman sayisinda "fixed" dirler.
           ArrayList'leri olustururken eleman sayisi soylemeye gerek yok, cunku ArrayList'ler eleman sayisinda "flexible"(esnek) dirlar.

         2)Array'lerin icine "primitive" ve "reference" lar konabilir.
           ArrayList'lerin icine ise sadece "non-primitive" ler konulur.

         3)Array'ler super fast, cok hizli. Array'ler memory i cok az kullanir.

          Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz, ama
               eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin
 */

    /*
    ArrayList'ler index kullanır ama index kullanmak eleman ekleme ve eleman silme işlemlerinde bize zaman kaybettirir.
    Çünkü birçok elemanın re-index edilmesi gerekir. Bu problemi çözmek için yeni bir yapı oluşturmuştur java.
    Bu oluşturduğu yeni yapıya LinkedList demiştir. LinkedList'deki her eleman iki bölümden oluşur.
    İlk bölümünde değer olur. Buraya data konulduğu için data bölümü derler. İkinci bölümler ise pointer bölümleridir.
    Linked demek birbirine bağlanmış demek.
    ArrayList'lerde eleman diyoruz LinkedList'ler hakkında konuşurken eleman kelimesi kullanılmaz "Node" kelimesi kullanılır.
    En son Node'un özel bi ismi var "Tail" deniyor ve null gösterir. Her Node bir diğer Node gösteriyor. En baştaki Node da
    sadece pointer kısmı vardır ve ona da "Head" deniyor.
     */

    /*
    /*
    - Arraylist ler index kullanir. Ancak index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybetirir.
    - Cunku bir cok elemanin re-index edilmesi gerekir. Java bu problemi LinkedList olusturarak cozmustur.
    - LinkedListte ki her eleman iki bolumden olusur. Bu elemanlarin ilk bolumunde deger(data) olur, ikinci bolumunde ise pointer vardir.
    - Iki bolumden olusan farkli bir yapi oldugu icin buna "Node" denilmektedir. Dolayisiyla LinkedList ler hakkinda konusurken List kelimesi
    yerine "Node" kelimesini kullanmak yerinde olacaktir.
    - Bu yapinin en son elemaninin pointer kismi, kendisinden sonra eleman olmadigi icin "null" gosterir. Son elemana ise "Tail" denilmektedir.
    - Her pointer bir elemani gostermeketdir. Ilk bastaki elemani gosteren yapiya "Head" denilir.

    */

    /*
    LinkedList eleman ekleme ve eleman silmede çok başarılıdır. Bu yüzden eleman ekleme ve eleman silme işlemlerini çokça
    yapacağınız durumlarda LinkedList kullanmalısınız.
    ArrayList eleman bulma(search) işlemlerinde çok başarılıdır.
    LinkedList eleman bulma(search) işlemlerinde başarılı değildir

    ArrayList'i çok defa arama yapacağımız işlerde kullanacağız. Mesela bir ülkenin şehirleri; ekleme yapılmaz arama yapılır.
    LinkedList'i çok defa ekleme silme yapacağımız işlerde kullanacağız. Mesela bir müzenin apk'sı. çok girdi çıktı vardır.
     */


    /*                  HOCA NOTU
    1)LinkedList deki her eleman iki bölümden oluşur. i)Data ii)pointer
    2)LinkedList deki her bir eleaman "Node" olarak adlandırılır.
    3)LinkedList'ler eleman ekleme ve eleman silme işlemlerinde çok başarılıdırlar.
    4)LinkedList'ler eleman arama işlemlerinde başarısızdırlar.
    5)3. ve 4. maddelerden dolayı eleman ekleme ve eleman silme işlemlerinin çok yapılacağı durumlarda
    LinkedList kullanılmalıdır.
    6)ArrayList'ler index kullanır. LinkedList'ler index kullanmaz.
    7)Index kullanmak eleman bulma işlemlerinde çok başarılıdır. Bu yüzden eleman bulma işlemlerini çok yapacaksanız
    ArrayList kullanmalısınız.

     */

import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {

        LinkedList<String> visitors = new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        visitors.add(2,"Angelina Julie");
        //visitors.add(2,"Angelina Julie");//normalde bu kod index kullanmiyor.
        //Java developer'lar rahat etsinler diye "buraya yazilan index'de nereye koymasini gerektigini gosteriyor.


        System.out.println(visitors);//[Tom, Hanks, Tom Hanks, Brad, Pitt, Brad Pitt]

        //add ekleme yöntemidir.
        //LinkedList'ler ekleme ve silme işlemlerinde çok başarılı olduklarından ekleme ve silme
        //ile alakalı çok fazla method içerir.
        visitors.addLast("Ajda Pekkan");//Sona ekle
        visitors.addFirst("Cüneyt Arkın");//Başa ekle

        System.out.println(visitors);//[Cüneyt Arkın, Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Ajda Pekkan]

        //remove silme işlemidir.
        visitors.removeLast();//son elemanın silinmesi
        System.out.println(visitors);//[Cüneyt Arkın, Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt]

        visitors.removeFirst();//ilk elemanın silinmesi
        System.out.println(visitors);//[Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt]

        visitors.addLast("Brad Pitt");
        visitors.addLast("Tom Hanks");
        System.out.println(visitors);//[Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeFirstOccurrence("Tom Hanks");//İlk görünümünü sil diyor.
        System.out.println(visitors);//[Tom, Hanks, Angelina Julie, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        /* Removes and returns the first element of this list.
                This method is equivalent to removeFirst().
                Returns:
        Throws: NoSuchElementException – if this list is empty
        */
        String firstEl = visitors.pop();//birinci elemanı kes yapıştır demek gibidir.
        System.out.println(firstEl);//Tom //İlk elemanı listten siler ve sildiği elemanı bize verir.
        System.out.println(visitors);//[Hanks, Angelina Julie, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

//        LinkedList<String> myList = new LinkedList<>();
//        myList.pop();
//        System.out.println(myList);//List içerisi boşsa kes yapıştır yapacağı bir eleman olmadığı için hata verdi.


    }


}

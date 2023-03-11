package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {

    /*
    ListIterator'da,

1) hasNext()
2) next()
3) set()
4) hasPrevious()
5) previous()
6) remove()

özelliklerini öğrendik.


ListIterator,

1) Sağdan sola / soldan sağa hareket edebilir.
2) ListIterator ile bir List'i düzenleyebilirsiniz.



Iterator'da,

1) hasNext()
2) next()
3) remove()

özelliklerini gördük.


Iterator,

1) Sadece soldan sağa hareket edebilir.
2) Update özellikleri yoktur.
     */

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //Example 2 Iterators kullanarak List elemanlarını tersten consol'a yazdiriniz.
        ListIterator<String> itr = myList.listIterator();

        //hasnext methodu pointerdan sonra eleman varsa true, yoksa false return eder.
        //next methodu pointerı bir sonraki elamanın önüne koyar ve üstünden atladığı elemanı return eder.

        while(itr.hasNext()) {
            String el = itr.next();
        }

        //hasPrevious methodu pointerdan önce eleman varsa true yoksa false return eder.
        //previous methodu pointerı bir önceki elemanın sonuna koyar ve ustunden atladığı elemanı return eder.

        while(itr.hasPrevious()){
            String el = itr.previous();
            System.out.print(el + " ");//bu işlem ile listimi tersten consol'a yazdırdım.
        }

        System.out.println();

        //Example 2 : List'deki tüm elemanları siliniz.

        while(itr.hasNext()){
            itr.next();
            itr.remove();//elemanları silmek için kullanıyoruz
        }

        System.out.println(myList);


        /*
        1) ListIterator da i)hasNext ii) next() iii) set() iv)hasPrevious() vi) previous() v) remove() methodları vardır.

        2) Iterator da i) hasNext() ii) next() iii) remove() methodları vardır.

         */

        //eger iki tarafli hareket etmek istemiyorsaniz iterator kullanin
        //eger sadece list elemanlarinin silinmesi ile ugrasiyorsaniz iterator kullanin.


        List<String> yourList = new ArrayList<>();
        yourList.add("Z");
        yourList.add("K");
        yourList.add("A");
        yourList.add("J");
        yourList.add("M");

        Iterator<String> iterator = yourList.iterator();

        while (iterator.hasNext()) {
            String el = iterator.next();
            System.out.print(el + " ");
        }



    }
}

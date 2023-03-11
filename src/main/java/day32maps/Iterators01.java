package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //for-each loop kullanarak her elemanın sonuna "!" ekleyiniz
        //Note: loop'lar kendi başlarına "Collection"lari update edemezler. bu yüzden java "iterator"lari oluşturdu.
        //Iterator'lar Collection'lari update etmek için kullanılır.

        for(String w: myList) {
            w = w + "!";
        }
        System.out.println(myList);//[Z, K, A, J, M]

        ListIterator<String> itr = myList.listIterator();

        //hasnext methodu pointerdan sonra eleman varsa true, yoksa false return eder.
        //next methodu pointerı bir sonraki elamanın önüne koyar ve üstünden atladığı elemanı return eder.
        while(itr.hasNext()){
            String el = itr.next();
            itr.set(el + "!");
        }
        System.out.println(myList);//[Z!, K!, A!, J!, M!]//bu işlem ile listimi update etmiş oldum sonuna ! eklemiş oldum


    }
}

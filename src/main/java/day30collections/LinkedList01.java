package day30collections;

import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names);//[Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        /*
        Retrieves, but does not remove, first element of this list.
        Returns: the first element of this list, or null if this list is empty
        ilk elemanı kopyalar ve listin içerisinden silmez.
        pop da ise elemanı keser ve oluşturduğumuz variable'ın içerisine atardı.
         */
        String firstEl = names.peek();
        System.out.println(firstEl);//Chris
        System.out.println(names);//[Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        LinkedList<String> myList = new LinkedList<>();
        //bos listimiz olan mylist de peek metodunu kullanılca boş olduğu için null verir bize
        //pop da ise throw exception verir bize
        String first = myList.peek();
        System.out.println(first);//null


        /*
        Retrieves and removes the first element of this list.
        Returns:the head of this list, or null if this list is empty
         */
        String firstElement = names.poll();//pop ile tek farkı list boşsa poll'da null veriyor pop da ise exception veriyor.
        System.out.println(firstElement);//Chris
        System.out.println(names);//[Alexandre, Mark, Tom, Jeremy, Hans]//ilk elemanı siliyor ctrl x gibi.

        /*
        Retrieves, but does not remove, the first element of this list.
        Returns:the head of this list
        Throws: NoSuchElementException – if this list is empty
         */
        String f = names.element();//ilk elemanı verecektir. listi yazdırınca alexandre orda da göreceğiz sadece kopyaladığı için
        System.out.println(f);//Alexandre
        System.out.println(names);//[Alexandre, Mark, Tom, Jeremy, Hans]

        //Example 1 : "A" ile başlayan tüm isimleri "*****" e çeviriniz.

        LinkedList<String> students = new LinkedList<>();
        students.add("Chris");
        students.add("Alexandre");
        students.add("Mark");
        students.add("Tom");
        students.add("Jeremy");
        students.add("Hans");

        for(String w : students){
            if(w.startsWith("A")){
                students.set(students.indexOf(w), "*****");
            } else
                continue;

        }
        System.out.println(students);

        //Interview Sorusu:
        //Example 2: List'deki 4 harften çok harf içeren isimleri siliniz.
        //eleman sayisini azaltacagimiz icin i ye ihtiyacimiz var ,o yuzden for-each loop yerine for loop kullaniyoruz.

        for(int i = 0; i<students.size(); i++){
            if(students.get(i).length()>4){
                students.remove(students.get(i));
                i--;
            } else
                continue;

        }

        System.out.println(students);

    }
}

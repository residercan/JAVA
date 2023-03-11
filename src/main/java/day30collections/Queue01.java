package day30collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    /*
    FİFO(First in first out) == İlk giren ilk çıkar
    İlk giren elemanı ilk kullanmanız(FİFO) gerektiğinde Queue en iyi seçimdir.
    Queue da elemanlar "insertion order"'a(giriş sırasına) göre dizilirler.
    Queue da peek(), poll(), element(), remove() gibi ilk elemanı ilgilendiren birçok method vardır.
    offer() methodu kapasite kontrolü yapıldıktan sonra eleman ekleme durumlarında kullanılır.
    */



    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");

        System.out.println(wareHouse);//[Milk, Meat, Bread, Honey, Tomatoes]

        /*
        Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
        When using a capacity-restricted queue, this method is generally preferable to add, which can fail to insert an element only by throwing an exception.
        Returns: true if the element was added to this queue, else false
        Throws:
        ClassCastException – if the class of the specified element prevents it from being added to this queue
        NullPointerException – if the specified element is null and this queue does not permit null elements
        IllegalArgumentException – if some property of this element prevents it from being added to this queue
         */
        /*
        Kapasite kısıtlamalarını ihlal etmeden hemen yapmak mümkünse,
        belirtilen öğeyi bu kuyruğa ekler. Kapasite kısıtlamalı bir kuyruk kullanırken,
        bu yöntemin eklenmesi genellikle tercih edilir, bu yöntem yalnızca
        bir istisna atarak bir öğe eklemede başarısız olabilir.
        */

        wareHouse.offer("Potatoes");
        System.out.println(wareHouse);//[Milk, Meat, Bread, Honey, Tomatoes, Potatoes]


    }
}

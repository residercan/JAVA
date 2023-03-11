package day30collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

    /*
    FİFO == First in First Out
    LİFO == Last in First Out
    Deque: Double Ended Queue manasındadır. Yani iki uçlu Queue demektir.
    Deque da FIFO ve LIFO beraber gerektiğinde kullanılır.
    Queue da sadece FIFO kullanılır.
    */
    /*
    Kapasite kısıtlamalarını ihlal etmeden hemen yapmak mümkünse, bu deque tarafından temsil edilen
    yığına (başka bir deyişle, bu deque'nin başında) bir öğeyi iter, şu anda boş alan yoksa bir IllegalStateException fırlatır.
    Bu yöntem, addFirst'e eşdeğerdir.
     */

    public static void main(String[] args) {

        Deque<String> furnitureTruck = new LinkedList<>();
        furnitureTruck.add("Chair");
        furnitureTruck.add("Mirror");
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Dining Table");

        System.out.println(furnitureTruck);

        /*
        Pushes an element onto the stack represented by this deque (in other words, at the head of this deque)
        if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
        This method is equivalent to addFirst.
        Throws:
        IllegalStateException – if the element cannot be added at this time due to capacity restrictions
        ClassCastException – if the class of the specified element prevents it from being added to this deque
        NullPointerException – if the specified element is null and this deque does not permit null elements
        IllegalArgumentException – if some property of the specified element prevents it from being added to this deque
         */
        furnitureTruck.push("Refrigerator");
        System.out.println(furnitureTruck);//[Refrigerator, Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]


    }
}

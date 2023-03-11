package day30collections;

import java.util.PriorityQueue;

public class PriorityQueue01 {

    /*
    (oncelik)PriorityQueue Java kendisine gore bir oncelik belirleyerek siralama yapar
    Biz istersek siralamayi belirleyebiliriz

    Priority(Öncelik)
    Siz söylemedikçe java kendine göre bi mantık oluşturur ve ona göre sıralar.
    PriorityQueue da sizin kendinize göre öncelik belirleme hakkınız var.
    */


    public static void main(String[] args) {

        PriorityQueue<String> myQueue = new PriorityQueue<>();
        myQueue.add("A");
        myQueue.add("E");
        myQueue.add("B");
        myQueue.add("G");
        myQueue.add("C");

        System.out.println(myQueue);//[A, C, B, G, E] java kendisine göre bir öncelik belirleyerek sıralama yaptı.

    }
}

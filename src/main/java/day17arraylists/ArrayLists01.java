package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);

        List<String> cities = new ArrayList<>();
        cities.add("Tom");
        cities.add("Trump");
        cities.add("Taceddin");

        names.removeAll(cities);//remove all kullandığınızda sadece ilk list değişir. parantezin içindeki list değişmez.
        System.out.println(names);

        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsin");


        boolean sonuc1 = names.containsAll(myNames);//Bir listin içinde çoklu elemanların var olup olmadığını kontrol eder.
        System.out.println(sonuc1);                 //Hepsi varsa true en az biri yoksa false verir.

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        //Example 1 : "a" listinde "Shoes" elemanının ilk görünümünü siliniz.

        a.remove("Shoes");
        System.out.println(a);//Shoes'ın ilk görünümünü silmek için remove kullandık.

        //Example 2 : "a" listinde "Shoes" elemanının tüm görünümünü siliniz
        List<String> b = new ArrayList<>();
        b.add("Shoes");//Shoes'ın tüm görünümlerini silebilmek için yeni bi list oluşturulur
        //ve removeAll kullanılarak tamamı silinir.

        a.removeAll(b);
        System.out.println(a);

        //Example 3 : Bir tane salary listi oluşturun, eğer salary 10000'den az ise %20,
        // 10000'den çok ise %10 zam yapınız

        List<Double> salary = new ArrayList<>();

        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);

        System.out.println(salary);

        for(Double w: salary) {
            if(w<10000){
                salary.set(salary.indexOf(w),w*1.2);
            } else {
                salary.set(salary.indexOf(w),w*1.1);
            }
        }
        System.out.println(salary);

        //Example 4 : İki Array'in eşit olup olmadığını kontrol eden kodu yazınız
        //Note: İki Array List'in eşi olabilmesi için elemanlar eşit olmalı, aynı elemanlar aynı index'te olmalıdır.
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
//      m.add('t');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1. Yol
        int counter = 0; //Flag

        for(int i=0; i<m.size(); i++) {
           if(m.size()!=n.size()){ // eleman sayılarının eşit olup olmadığını kontrol ediyoruz
                                   // çünkü eşit değilse otomatik olarak iki list birbirine eşit olmuyor.
               counter++;
               System.out.println("Listler eşit değildir");
               break;
           } else if( m.get(i) != n.get(i)){ //iki listinde tek tek indexlerine bakar ve birbirinin aynısı olup olmadığını teyit eder.
               counter++;
               System.out.println("Listler eşit değildir.");
               break;
           }
        }

        if (counter==0){
            System.out.println("Listler eşittir.");
        }

        //2. Yol
        boolean esitmi = m.equals(n);

        if(esitmi){
            System.out.println("Listler eşittir.");
        } else{
            System.out.println("Listler eşit değildir");
        }


    }

}

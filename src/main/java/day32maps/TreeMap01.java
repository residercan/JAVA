package day32maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap01 {

    /*
    1)TreeMap'ler entrySet'leri key'lere göre "natural order" da sıralar.
    natural order= alfabetik sıraya göre ve rakamlarda ise küçükten büyüğe göre sıralama yapar.
    2)TreeMap'ler en yavaş map'lerdir.
    3)TreeMap'ler thread safe ve synchronized değildir.
    thread safe ve synchronized lazımsa HashTable
    natural order(sıralama) istiyorsanız TreeMap
    hız istiyorsanız HashMap

     */



    public static void main(String[] args) {

        TreeMap<String, Double> salaries = new TreeMap<>();
        salaries.put("Tom Hanks", 3000.00);
        salaries.put("Mary Star", 1000.00);
        salaries.put("Jimy Jones", 5000.00);
        salaries.put("Kevin Bridgeman", 6000.00);

        System.out.println(salaries);//Alfabetik sıralamaya göre bize veriyor.//{Jimy Jones=5000.0, Kevin Bridgeman=6000.0, Mary Star=1000.0, Tom Hanks=3000.0}

        //tailMap verilen key'den başlayarak sona kadar tüm entrySet'leri size verir.
        SortedMap<String,Double> map1 = salaries.tailMap("Kevin Bridgeman");
        System.out.println(map1);//Kevin dahil ve sonrasını veriyor.//{Kevin Bridgeman=6000.0, Mary Star=1000.0, Tom Hanks=3000.0}

        //tailmap(String, Boolean) Kevin'dan başlayıp sona kadar bize verir ve kevinin dahil olup olmayacağını true veya false yazarak biz tercih ederiz.
        NavigableMap<String,Double> map2 = salaries.tailMap("Kevin Bridgeman", false);
        System.out.println(map2);//{Mary Star=1000.0, Tom Hanks=3000.0}

        //subMap methodu kevindan başla dahil olsun mu olmasın mı, tom hanks'de bitir dahil olsun mu olmasın mı
        NavigableMap<String,Double> map3 = salaries.subMap("Kevin Bridgeman", true, "Tom Hanks", false);
        System.out.println(map3);//{Kevin Bridgeman=6000.0, Mary Star=1000.0}

        //lowerEntry("Mary Star") Mary Star'dan bir öncekini verir.
        Map.Entry<String,Double> map4 = salaries.lowerEntry("Mary Star");
        System.out.println(map4);//Kevin Bridgeman=6000.0

        //lowerEntry("Paris Hilton") olmayan bir entrySet'i yani elemanı yazdığımız zaman harf sırasına bakar ve ondan bir önceki harfteki entrySet'i verir.
        Map.Entry<String,Double> map5 = salaries.lowerEntry("Paris Hilton");
        System.out.println(map5);//Mary Star=1000.0

        //higherEntry("Mary Star") Mary Star'dan bir sonrakini verir.
        Map.Entry<String,Double> map6 = salaries.higherEntry("Mary Star");
        System.out.println(map6);//Tom Hanks=3000.0

        Map.Entry<String,Double> map7 = salaries.ceilingEntry("Mary Star");
        System.out.println(map7);//Mary Star=1000.0

        //ceilingEntry var olan key ile kullanılırsa o keyi verir. var olmayan bir key ile kullanılırsa bir sonrakini verir.
        Map.Entry<String,Double> map8 = salaries.ceilingEntry("Paris Hilton");
        System.out.println(map8);//Tom Hanks=3000.0

        //floorEntry varsa var olanı verir yoksa alfabetik sıraya göre kendinden bir öncekini verir.
        Map.Entry<String,Double> map9 = salaries.floorEntry("Paris Hilton");
        System.out.println(map9);//Mary Star=1000.0









    }
}

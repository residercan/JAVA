package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
    1)HashTable bir map'dir.
    2)HashTable entrySet'leri herhangi bir sıralamaya tabi tutmaz
    3)HashTable, HashMap'lerden daha yavaştır. Çünkü HashTable'lar thread-safe ve synchronized'dır.
    synchronized(çoklu işlerin zaman kazandıracak şekilde sıralanabilmesidir.)
    thread safe(aynı andan birden fazla iş yapabilme becerisi)
    4)HashTable'larda key null olamaz. Key'i null yaparsanız NullPointerException atar.
    5)HashTable'larda value null olamaz. Value null yaparsanız NullPointerException atar.
    HashMap'te key'de ve value'larda null kullanınca herhangi bir problem oluşturmaz.
    6)HashMap thread safe ve synchronized değildir ve HashMap'lerde null hem key de hem value da kullanılabilir.
    HashTable'larda tam tersidir.

    Note: toString() method'u obje'leri console'da detaylari ile görebilmek için class'ların içinde oluşturulur.
          toString method'unu oluşturmmadan object'i console'a yazdırırsaniz Java o object'i adresini yazdırır sadece.

     */


    /*
                    INTERWIEW QUESTIONS
                  MAP'LER ARASINDAKI FARKLAR
    1) HashMap ve TreeMap ve LinkedHashMap  synchronized ve thread-safe degildir.
    HashTable synchronized ve thread-safe dir.

    2) Treemap'ler natürel order yapar.
     LinkedHashMap giriş sırasına göre listeler.
     HashMap ve Hashtable sıralama yapmaz,rastgele sıralar.

    3) HashMap ve LinkedHashMap'lerde hem key hemde value için null değeri kullanılabilir.
     TreeMap'lerde key'ler icin "null" kullanılmaz.
     HashTable larda ikisi içinde null kullanılmaz.
     */

    public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulation = new Hashtable<>();
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Turkey", 90000000);
        System.out.println(countryPopulation);//{USA=400000000, Germany=83000000, Turkey=90000000}
//      countryPopulation.put(null, 9000000);//HashTable'larda key null olamaz. NullPointerException atar.
//      countryPopulation.put("France", null);//HashTable'larda value null olamaz. NullPointerException'

        Hashtable<String, Students> myStundents = new Hashtable<>();
        myStundents.put("Math", new Students("Tom Hanks", "th@gmail.com", 21, true));
        System.out.println(myStundents);


        String name = myStundents.get("Math").name;
        System.out.println(name);//null--Tom Hanks

        Integer age = myStundents.get("Math").age;
        System.out.println(age);//21





    }
}

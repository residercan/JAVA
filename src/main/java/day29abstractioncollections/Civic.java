package day29abstractioncollections;

    /*
    "abstract method"lar sadece ne yapılacağını söyler(what to do)
    "concrete method"lar ne yapılacağı ile birlikte nasıl yapılacağını da söyler(how to do)

     "interface"ler bir yapılacak işler listesidir. (To do list)

     "multiple parent interface" kullandığınızda aynı method ismi ile birden fazla method oluşturursanız
     bu method'ların return typeları aynı olmalıdır. Aksi takdirde hata verir.
     "return type"lar farklı olacaksa aynı method ismini kullanamazsınız.
     (price örneğinde olduğu gibi void ve int kullanamazsınız ikisinde de return type aynı olmalıdır.)

     "interface"lerde "constructor" olmadığı için interfacelerden obje oluşturulamaz.

     "abstract class" larda class oldukları için constructor vardır.
     Ama constructorlar abstract classlarda obje oluşturamazlar.

     Java da iki şeyden obje oluşturulamaz;
     i) interface
     ii) abstract


     */

    /*
                İNTERWİEV SORUSU
      Abstract Class ile Interface'in farkları nelerdir?
      1) Method
        Abstract Class hem abstract hem de concrete methodlar içerebilir.
        Interfaceler ise sadece abstract methodlar içerir.
        Ama istersek interface'ler içinde de default ve static keywordler kullanarak concrete methodlar oluşturabiliriz.

      2) Variable
        Abstract Class'larda normal Class'lardaki gibi her türlü variable oluşturulabilir.
        Interfacelerde ise variable'lar public static final olmak zorundadır.

      3) Inheritance
        Abstract Class'lar class oldukları için multiple interitance'a müsaade etmezler.
        Interface'ler ise multiple inheritance'i desteklerler. (Var oluş sebepleri budur)

      4) Object Creation
        Abstract Class'larda constructor vardır ama object oluşturmada kullanılmazlar.
        Interface'lerde ise constructor olmadığından object oluşturulamaz.
     */

    /*              INTERVİEW SORUSU
    Soru: Object Oriented Programming Language prensipleri nelerdir?

    i) Inheritance ii) Polymorphism iii) Encapsulation iv) Abstraction


     */


public class Civic implements Ac, Engine{

    @Override
    public void run() {
        System.out.println("Civic runs well");
    }



}

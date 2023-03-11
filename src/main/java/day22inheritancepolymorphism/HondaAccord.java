package day22inheritancepolymorphism;

public class HondaAccord extends Honda{

    /*
    1)Siz Class oluşturduğunuzda Java otomatik olarak size görünmez bir Constructor verir.
    Çünkü Java Class'ın bir kalıp olduğunu ve object oluşturmak için yaratıldığını ve
    object oluşturmak için constructor'ın şart olduğunu bilir.
    2)Java'nın otomatik olarak oluşturduğu bu görünmez Constructor'a default Constructor denir.
    3)Siz kendiniz herhangi bir Constructor oluşturduğunuzda Java default constructor'ı siler.
    4)Bir Class'da birden fazla constructor olabilir. Fakat bu constructorların
    parametreleri farklı olmalıdır.
    5)"this" keyword bu Class anlamındadır. "this.price" demek bu Class'daki "price" isimli variable demektir.
    "this.price" syntax'i constructorların içinde kullanılır.
    6)Constructor kullanarak variable'lar üzerinde yaptığımız değişimler sadece Object üzerindeki
    variable'ların değerlerini değiştirir. Class'daki variable değerlerini değiştiremez.
     */

    public int price;
    public int year;
    public String make;
    public String model;

    public HondaAccord() {//Constructor'ın görünür hali.

    }

    public HondaAccord(int price){
        this.price = price;
    }

    public HondaAccord(int price, int year) {

        this.price = price;
        this.year = year;
        System.out.println("Honda Accord Constructor");
    }

    public HondaAccord(int price, int year, String make, String model){

        this.price = price;
        this.year = year;
        this.make = make;
        this.model = model;

    }

}

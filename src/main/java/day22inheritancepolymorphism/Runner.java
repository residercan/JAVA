package day22inheritancepolymorphism;

public class Runner {
    public static void main(String[] args) {

        //Inheritance'da variable'lar seçilirken Java object in data type'ına bakar.
        //Öncelikle istediğiniz variable'i Object'in data typeı olan Class'da arar.
        //O Class'da bulamazsa Parent Class'lara bakar.
        //Hicbir Parent Class'da bulamazsa hata verir.

        Cat cat1 = new Cat();
        System.out.println(cat1.a);//14
        System.out.println(cat1.b);//34
        System.out.println(cat1.c);//45


        Mammal cat2 = new Cat();
        System.out.println(cat2.a);//13

        Animal cat3 = new Cat();
        System.out.println(cat3.a);//12

        //Object oluştururken objectin data type'ı Child Class'lardan seçilemez.

        //Inheritance'da method'lar seçilirken Java Constructor'a bakar.
        //Öncelikle istediğiniz methodu Constructor'ı kullanılan Class'dan alır.
        //O Class'da bulamazsa Parent Class'lara bakar.
        //Hiçbir yerde o methodu bulamazsa hata verir.

        Cat cat4 = new Cat();
        cat4.eat();//Cat eat
        cat4.drink();//Mammal drink

        Mammal cat5 = new Mammal();
        cat5.eat();//Mammal eat

        Animal cat6 = new Animal();
        cat6.eat();//Animal eat
    }
}

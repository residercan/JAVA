package day28abstraction;

/*
   Atomic olsun diye "parent"i parcaladim ama bir "Child Class" in birden fazla "parent" i oldu,
   bu ise Java'da mumkun degildir. Cunku Java "multiple Inheritance" i desteklemez.

   "multiple inheritance" class'larda mumkun degildir fakat Java "interface" isimli yeni bir yapi olusturdu
   bu yapida "multiple inheritance" a musaade etti.

   2-) Interfacelerdeki tüm methodlar abstract olduğu için "interface"'lere "fully abstraction" denir.
   "Abstract Class"'larda abstract method ve "concrete method" bir arada kullanıldığı için
   abstract class'lara fully abstraction denmez.

   */

//interface'lerdeki tüm methodlar abstract olmak zorundadır.

//interface'lerde abstract method oluştururken abstract kullanmaya gerek yoktur.
//çünkü java o methodun abstract olduğunu bilir.

//interface'lerdeki tüm methodlar java tarafından otomatik olarak public kabul edilir.
// bu yüzden o methodlar için "public" yazmaya gerek yoktur.

//public abstract void eco(); ====> void eco(); aynı anlama gelir interface'lerde..

        /*
                            ABSTRACT vs INTERFACE
        1) Abstract :
        1.1 - Class`dir.
        1.2 - Abstract ve concrete method`lar konabilir.
        1.3 - Kismi olarak abstraction saglar.
        1.4 - Birden fazla abstract class`a direk child olunamaz. Coklu inheritance`i desteklemez.
        1.5 - Hiz acisindan avantajlidir
        1.6 - Icindeki tum nesnelerin public olmasi zorunlu degildir.
        1.7 - Soyut olmayan metodlar static olarak tanimlanabilir.
        1.8 - Abstract class constructor`a sahiptir
        1.9 - "Abstract class" larda normal Class'lardaki gibi her turlu variable olusturulabilir


        2) Interface :
        2.1 - Class degildir.
        2.2 - Sadece abstract method`lar konabilir.Ama istersek interface'ler icinde de
        "default" ve "static" keywordler kullanarak concrete methodlar olusturabiliriz
        2.3 - Tam abstraction (soyutluk) saglar.interface'lerdeki tum method'lar "abstract" olmak zorundadir.
        2.4 - Bir class`dan istediginiz kadar interface`i inherit edebilirsiniz. Coklu inheritance`a uygundur.
        2.5 - Hiz acisindan abstract class`a gore yavastir.
        2.6 - Icindeki tum nesnelerin public olmasi gerekir.
        2.7 - Normalde Method'lar static olamaz ancak Interface'lerin icine concarate method konulamaz.
        Devoloper'lar bu sorunu cozebilmek icin istisnai bir durum olarak; tipki kirmizi isikta
        gecilmez; amaa itfaiye polis gecebilir gibi istisnai olarak concreate method uretebilmek icin
        default ve static keyword kullanarak body'si olan method olusturulabilir.static keyword'u ile olusturursaniz
        static method olusturmmus olursunuz.
        2.8 - Interface constructor`a sahip degildir
        2.9 - "Interface" lerde ise variable'lar, public static ve final olmak zorundadir.
        */


public interface Engine {

    void eco();

    void gas();

    void tsi();

    //default keyword kullanarak interface'lerin içinde body'si olan methodlar üretebilirsiniz.
    //aşağıdaki method non-static method'dur. Objelere yapışır ulaşmak için obje oluşturmak gerekir.

    public default int add(int a, int b){
        return a + b;
    }

    //static keyword kullanarak interface'lerin içinde body'si olan methodlar üretebilirsiniz.
    //aşağıdaki method static methoddur. Class'lara yapışır ulaşmak için class ismi ile ulaşılır.
    public static String update (String str){
        return str + "!";
    }

}

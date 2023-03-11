package day23inheritancepolymorphism;

public class Cat extends Mammal{

    public void moew(){
        System.out.println("Cats meow");
    }

    @Override//ctrl o kısa yolu //@Override annotation'ini kullanarak,
    // Java'nın yaptığımız Overide işlemini kontrol etmesini sağlarız.
    public void eat() {
        System.out.println("Cats eat");
    }//bu işlemi yaptıktan sonra Animals eat yazısı yerine Cats eat yazısı ekrana yazdırılacak

    @Override
    public int add(int a, int b) {
        return a + b + 1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b + 1;
    }

    //Aşağıdaki Method "Overriding Method" olarak adlandırılır.
    @Override
    public Mammal create() {
        return new Mammal();
    }





    /*
    1)Override yaparken "methodun body"'si değiştirilir.{}==>bu aralık
    2)Override yaparken ASLA method signature'a dokunulmaz.(isim ve parametre)==>eat() bu kısım değiştirilemez.
    3)Override yaparken "inheritance" olmak zorundadır.
    4)Override yaparken "access modifier"'lar belli kurallara göre farklılaştırılabilirler.
        i)private methodlar override edilemezler
        ii)Child Class'taki override edilen methodun access modifierı parent class'taki
        methodun access modifier'ı ile aynı veya daha genişi olmalıdır.
        Note: Child Class'daki method'un acsess modifierı daha dar olamaz.
        (public>protected>default>private)
        iii)default methodlar aynı package içindeyse override edilebilirler.
        farklı package'den override edilemezler.
    5)parent class'taki methodun "return type" void ise return type değiştirilemez.
    6)parent class'taki methodun "return type" primitive ise return type değiştirilemez
    7)parent class'taki methodun "return type" wrapper class ise return type değiştirilemez.
    8)parent class'taki methodun "return type" Parent Class ise return type child'lardan biri olabilir.
        Note: Child Class'daki return type parent class'dakinden büyük, geniş olamaz.
        Note: Aralarında parent-child ilişkisi olmayan Classlar overriding'de Return type değişiminde kullanılamazlar.
              Mesela "Short", "Integer"'dan küçüktür fakat aralarında parent-child ilişkisi olmadığından
              "Integer" yerine "Short" kullanamazsınız.
        Note: Child'daki methodun return type'ından parent'taki methodun return typeına gidişte
              "Is-A Relationship" olmalı.
              Parent'tan Child'a gideceksen "Has-A Relationship" olmalı.
        Note: Aralarında IS-A Relationship olan Data Typelarına "Covariant" denir.
        Child<Prent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
        HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.
     9)final methodlar override edilemezler çünkü "overriding" de method body değiştirilir
     fakat final method body değiştirilmesine müsaade etmez.
     10) Polymorphism = Overloading + Overriding
     Polymorphism(Çoklu yapı, Çok biçimlilik)
     Note: Polymorphism nedir derlerse overloading ve overridingi anlatın.
     11)Overloading ile Overriding arasındaki farklar nelerdir?
     -Overloading için "inheritance" gerekmez fakat overriding için gerekir.
     -"private" methodlar Overload edilebilir, Override edilemezler.
     -"final" method'lar Overload edilebilir, Override edilemezler.
     -"Overloading" "static polymorphism" olarak, Overriding "dynamic polymorphism" olarak adlandırılır.
        Çünkü "static" methodlar Overload edilebilir, Override edilemezler.
     - "Overloading" de method signature değişir ama "Overriding" de method signature dokunulmaz.
     */

}

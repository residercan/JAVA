package day21accessmodifiersinheritance;

public class AnimalRunner {

    /*
    1)"Inheritance" sayesinde;
    -Code tekrarlarından kurtuluruz.
    -Code tamiri(maintenance) kolay olur.
    -Child Class'ları daha atomik yapmış oluruz.
    2)Bir Class'ı başka bir Class'ın Child Class'ı yapmak için
    "extends" keyword kullanılır. ilk yazılan Class Child,
    ikinci yazılan Class parent olur.
    3)Child Class object'leri Parent Class'dan method ve variable'ları kullanabilirler.
    4)Parent Class object'leri Child Class'dan method ve variable'ları kullanamazlar.
    5)Object Class her class'ın parent'ıdır.
    Java da Object class hariç her class'ın parent'ı vardır.
    Java da parent'ı olmayan tek class Object Class'dır.
    6)private method ve variable'lar "Inheritance" edilemez.
    "Child Class"'lar tarafından kullanılamaz.
    "protected" method ve variable'lar Child Class tarafından kullanılabilir.
    "default" method ve variable'lar aynı package'deki Child Class tarafından kullanılabilir.
    "public" method ve variable'lar Child Class tarafından kullanılabilir.
    Note    : Child Class'lar tarafından kullanılabilir olmak "inherit edilebilir" demektir.
    7) 4 tip inheritance vardır.
    i)Multilevel Inheritance java bunu kullanır.
    ii)Hierarchical Inheritance bir parent için çoklu child java bunu kullanır.
    iii)Multiple Inheritance bir child class'a coklu parent demektir. Java bunu desteklemez.(Java does'nt support Multiple Inheritance)
    iv)Single Inheritance bir child için bir parents demektir. Java bunu kullanır.

     */

    public static void main(String[] args) {

        Cat c1 = new Cat();

        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1 = new Dog();
        d1.eat();
        d1.drink();
        d1.bark();



        Bird b1 = new Bird();
        b1.eat();
        b1.drink();
        b1.tweet();

    }
}

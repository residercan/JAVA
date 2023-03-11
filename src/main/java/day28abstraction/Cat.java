package day28abstraction;

public class Cat extends Mammal{


   /*
   Bir method parent class'da abstract method ise child class o methodu override edip
   kullanmak zorundadır. Bu yüzden herhangi bir fonksiyonu Child class için mecburi yapmak isterseniz
   o methodu abstract yapmalısınız.
    */


    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void move() {
        System.out.println("Cats move");
    }
}

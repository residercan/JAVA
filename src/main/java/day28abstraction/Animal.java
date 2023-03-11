package day28abstraction;

public abstract class Animal {

    //body'si olmayan methodlar abstract method olarak adlandırılır."{}"
    //Bir method'u abstract yapmak için; i)method body'i sil ii) "abstract" keyword kullan.
    //Abstract methodlar abstract class içinde olmalıdır.
    public abstract void eat();// bu abstract bir method'dur.


    //"abstract" classlarda hem abstract method hem de "concrete" method kullanılabilir.
    //"concrete" non-abstract yani abstract olmayan demek.
    //abstract soyut concrete method somuttur.
    public void drink(){
        System.out.println("Animal's drink...");
    }

    //abstract move method oluşturunuz.

    public abstract void move();




}

package day23inheritancepolymorphism;

public class Math extends Courses{

    public void practice(){
        System.out.println("Solve questions");
    }

    //super(); parenta gitmek için kullanılır.
    //this(); aynı classtaki diğer constructorı kullanmak için kullanılır.
    //(); parantez içerisine ne yazarsak o constructora gidiyor. int yazarsak içerisinde
    //int olan constructora gidiyor boş bırakırsak parametresiz olan constructora gidiyor.
    public Math(){
        super("X");
        System.out.println("Counstructor 1");
    }

    public Math(int a){
        this();
        System.out.println("Counstructor 2");
    }


}

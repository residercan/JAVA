package day28abstraction;




public class Civic implements Engine, Ac, Hood {//Bir class'ı bir interface'in child'ı yapmak için implements kullanırız.


    @Override
    public void eco() {
        System.out.println("Uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("Uses gas");
    }

    @Override
    public void tsi() {
        System.out.println("Uses tsi technology");
    }

    @Override
    public void digital() {
        System.out.println("Uses digital");
    }

    @Override
    public void climate() {
        System.out.println("Uses climate");
    }

    @Override
    public void steel() {
        System.out.println("Uses steel");
    }
}

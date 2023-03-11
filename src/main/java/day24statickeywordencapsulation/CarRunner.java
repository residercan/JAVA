package day24statickeywordencapsulation;

public class CarRunner {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        //Static variable'lara objeleri kullanarak ulaşmak mümkün ama tavsiye edilmez.

        System.out.println(car1.counter);//Obje üzerinden gitmek tavsiye edilmez
        System.out.println(Car.counter);//Class ismi ile gidilmelidir.
        System.out.println(car1.price);//price static değil variable olduğu için obje üzerinden çağırırız.

        //Static Keyword = Class'a bağlanmış elemanlardır. Herkesle etkileşimi vardır.
        //herkesin erişimi vardır. ortak elemandır.
        //Static Class elemanları her objenin ortak elemanıdır.
        //Staticler de yapılan her değişiklikten tüm objeler etkilenir.
        //Static Class elemanlarına Class elemanları üzerinden ulaşılır.
        //Staticler override edilemezler.

        /*
        1) Static keyword, class'a bağlanmış class elemanlarıdır.
        static variable/method class'a bağlıdır.
        2) Static class elemanları, tüm objelerin ortak elemanıdır.
        3) Static'ler üzerinde yapılan her değişiklik, tüm objeleri etkiler ve tüm objeler tarafından görülür.
        4) Static class elemanlarına, class üzerinden ulaşılır. Objeler, static'lere ulaşmak için kullanılmaz.
        Kullanılırsa hata vermez, fakat tavsiye edilmez.
         */




    }
}

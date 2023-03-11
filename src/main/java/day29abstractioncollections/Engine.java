package day29abstractioncollections;

public interface Engine extends Vehicle {

    //Child ----> Parent
    //Class----> Interface ==> implements
    //Class----> Class=====> extends
    //Interface ----> interface ====> extends
    //Interface ----> Class ==> mümkün değildir.
    //sadece class interface yaptığımız zaman implements kullanılıyor.


    //interface'lerdeki tüm variable'lar otomatik olarak(default) "public"'dir.
    //interface'lerdeki tüm variable'lar otomatik olarak finally'dır. Değeri değiştirilemez.
    //interface'lerdeki tüm variable'lar otomatik olarak static'dir. bütün objeler için ortakdır.
    //static olan bişeye interface'in ismi ile ulaşabilirsiniz.
    //interface'ler public static final int price = 2000; yazsak da kabul eder.
    //bu kesin olduğu için public static final yazmaya gerek yoktur.
    int price = 2000;



    double weight = 23.5;

    void run();




}

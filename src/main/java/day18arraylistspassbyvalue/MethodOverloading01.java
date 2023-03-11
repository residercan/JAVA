package day18arraylistspassbyvalue;

public class MethodOverloading01 {

    public static void main(String[] args) {

    add(3,5);
    add(3,5,7);
    add(3.0,5);
    add(3.0,5);
    //Java data typelerine bakarak kodları çağırıyor eşliyor
        //1.Usage de int int
        //2.Usage de int int int
        //3.Usage de int double
        //4.Usage de double int

        /*
        MethodOverloadin nasıl yapılır?
        1- Method isimleri aynı olmalıdır.
        2- Method parametreleri farklı olmalıdır.
            a- Parametre sayıları değiştirilebilir.
            b- parametre data tiplerini değiştirebilirsiniz.
            c- parametrelerin yerlerini değiştirebilirsiniz anca
            data tipleri farklı ise.
        3- Method Ismi + Parametreler = Method Signature (Method İmzası)
        Method Signature dışında ne değiştirirseniz değiştirin java o methodları farklı
        kabul etmez. Çünkü imzaya bakar örn add(int a, int b)
        */


    }

    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void add(int a, double b){
        System.out.println(a+b);
    }
    public static void add(double a, int b){
        System.out.println(a+b);
    }




}

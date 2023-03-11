package day27exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

    double r1 = compareNumOfCharecters("Java","xy");
        System.out.println(r1);//2.0

    double r2 = compareNumOfCharecters(null,"xy");//length() method'u null ile kullanılamaz
        System.out.println(r2);

    double r3 = compareNumOfCharecters("Selenium", "");//Herhangi bir sayı sıfır ile bölünemez
        System.out.println(r3);




    }

    //Verilen iki String'den birinin karakter sayısının diğerinin kaç katı olduğunu veren method oluşturunuz.



    public static double compareNumOfCharecters(String s, String t) {
        double result =0;
        try {
        result = s.length() / t.length();
        }catch (NullPointerException e){
            System.out.println("length() method'u null ile kullanılamaz");
        }catch (ArithmeticException e) {
            System.out.println("Herhangi bir sayı sıfır ile bölünemez");
        }finally {
            System.out.println("Database ile connection kesildi");
        }
        return result;
    }

    /*
    "final", "finally", "finalize" açıklayınız
    1)"final" bir keyword'dur. Variable, Class ve Method'lar için kullanılır...Eski notlara bakınız.
    "final" keyword nedir?

    "final" keyword i)Variable'larda kullanilabilir.
                        public final int age = 12;
                        a)Atanan deger degistirilemez.
                        b)Deger atamasi yapilmak zorundadir.

                    ii)Method'larda kullanilabilir.
                       public final int add(){
                       return a+b;
                   }
                        a)Bir method olusturulurken "final" olarak olusturulmus ise
                          o methodun body'si asla degistirilemez. Dolayisiyla o method override edilemez.

                   iii)Class'larda kullanilabilir.
                       Bir Class'i "final" yaparsaniz o Class'i kisirlastirmis olursunuz
                       Bir Class "final" ise o Class'a extend edilemez.
                       "final" Class Child olabilir.


    2)"finally" bir "code block"'dur.
    "try-catch" veya sadece "try" ile kullanılır.
    "finally" code block içine yazılan code'lar her halukarda çalıştırılır.
    Mesela Database ile connection'ı kesmek her halukarda yapılması gereken bir fiildir.
    Bunu "finally" ile yapabiliriz.

    3)"finalize" bir methoddur. Bu method Java tarafından data'lar imha edilmeden önce çağırılır.
    Bu method dataları imha edilecek hale getirir ve daha sonra "Garbage Collector" bu dataları imha eder.
    "finalize" method'unu Java Developer'lar da çağırabilir ama Java kendi bildiğini yapar.

     */


    /*
    Interview sorusu : "final", "finally", "finalize" nedir?
    final(keyword): ==> final method override edilemez.
              final variable degeri degistirilemez.
              final class child class sahibi olamaz.
    finally(code block) ==> try-catch block'dan sonra kullanilir ve Exception atilsa da atilmasa da calisir.

    finalize(method) ==> Garbage Collector bir data'yi imha etmeden once calistirir.
     */


}

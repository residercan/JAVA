package day21accessmodifiersinheritance;

public class Student {

    /*
    Access modifier
    1-public 2-protected 3-default(Accsess Modifer'i default yapmak için access modifier yazmayız.
    4-private
    Note : access modifier'ları genişten dara doğru sayınız.
           public, protected, default, private
    Note : access modifier'ları birer birer açıklayınız.
           public olanlar her class'da kullanılabilir.
           protected olanlar başka package'lerden kullanılamaz ancak başka package'de child class içinden kullanılabilir.
           default olanlar başka package'dan kullanılamazlar.
           private olanlar sadece oluşturuldukları class içinde kullanılabilir.
    Note : "protected" ile "default"'un farkını söyleyiniz.
           protected olanlar başka package'lerden kullanılamaz ancak başka package'de child class içinden kullanılabilir.
           default olanlar başka package'dan kullanılamazlar.
    Note : Class'lar için hangi Access modifier'lar kullanılabilir.
           public, default kullanılır ama protected ve private kullanılamaz.

     */
    //public her class'dan kullanılabilir. bir şeyi public yaparsak onu nerede olursak olalım kullanabiliriz.
    public String stdName = "TomHanks";


    //protected sadece bulunan package'ın alt packagelarında gözükebilir diğer packagelarda gözükmez.
    //protected olanlar başka package'lerden kullanılamaz ancak başka package'de child class içinden kullanılabilir.
    protected String address = "Miami";


    //default olanlar başka package'dan kullanılamazlar.
    //default oluştururken access modifier kısmına default yazılmaz
    String email = "tomhanks@gmail.com";//default (package private)(package özel)


    //private olanlar sadece oluşturuldukları class içerisinde kullanılabilirler.
    private String stdId = "20206517004";

    //Note bu access modifier'ların hepsi bulunduğu package içerisinde kullanılabilir.


}

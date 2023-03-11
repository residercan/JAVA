package day20stringbuilderstringbuffer;

public class StringBuilder01 {

    /*
    1)StringBuilder Java'da bir Class'dır.
    2)StringBuilder, String oluşturmaya yarar.
    3)"String" Class varken niçin StringBuilder'a ihtiyaç duyarız.
      Çünkü String Class "Inmutable Class"'dır. Ama biz bazen "Mutable" Stringlere ihtiyac duyarız.
      StringBuilder bize "Mutable" String verir.
    4)Inmutable Class'larda var olan değer değiştirilemez. Siz var olan bir değeri değiştirmek istediğinizde
      i)Yeni bir variable yeni değerle oluşturulur.
      ii)Eski variable'nin pointer'ı yeni variable'a döndürülür.
      iii)Eğer bir variable'ı hiçbir pointer göstermiyora o variable "Garbage Collector" tarafından silinir.
    Mutable Class'larda var olan değer değiştirilebilir. Orjinal değer korunmaz.
    5)"String Class"'ların Inmutable yapısı security için onemlidir.
      Aynı değere sahip birden fazla String olduğunda Java bir tane container oluşturur ve
      aynı değere sahip Stringlerin bu container'ı kullanmasını temin eder.
      Bu memory'i korumak için iyidir. ancak container'daki değeri bir variable için değiştirdiğimizde
      tüm variable'ların etkilenmei tehlikesi vardır. Bu tehlikeden kurtulmak için Java Stringleri "Inmutable"(değişmez) yapmıştır.
      Fakat herhangi bir variable'ın değerini değiştirmek için Java bir yol bulmuştur. Değiştirmek istediğiniz variable için yeni bir container oluşturur ve variable'ın pointer'ını
      bu yeni variable yönlendirir. Böylelikle hem değişim sağlanmış hem de diğerleri etkilenmemiş olur.
    */




    public static void main(String[] args) {

        String str = "Java";



        //StringBuilder nasıl oluşturulur?
        //1. Yol
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);//Java

        //2. Yol
        StringBuilder strb2 = new StringBuilder();
        //Yol a (String Concat yapıyordu StringBuilder da append ile ekleme yapabiliyoruz.)
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2);

        //Yol b
        strb2.append(" Learn").append(" Java earn").append(" money.");
        System.out.println(strb2);

        //Stringbuilder'larda karakter sayısı nasıl bulunur.==> length methodu ile
        StringBuilder strb3 = new StringBuilder();
        strb3.append("Cat");
        strb3.append("xxxxxxxxxxxxxxxx");
        int numOfChar = strb3.length();
        System.out.println(numOfChar);//3

        //Capacity aşımlarında capacity var olanın iki katının iki fazlasına çıkar.
        int capacity = strb3.capacity();
        System.out.println(capacity);//16

        //setCharAt(2,'r') ==> Index 2 deki karakteri r'ye çevirir.
        strb3.setCharAt(2,'r');
        System.out.println(strb3);

        //delete (3,19) ==> Index 3(dahil)'ten ındex 11(hariç)'a kadar olan karakterleri siler.
        strb3.delete(3,11);
        System.out.println(strb3);

        //deleteCharAt(2) ==> Index 2 deki karakteri siler. tek karakter silmek için kullanılır.
        strb3.deleteCharAt(2);
        System.out.println(strb3);

        //reverse ==> methodu StringBuilder'ı ters çevirir. Ali ==> ilA
        //"mutable" 'larda sadece method kullanmak orjinal değeri değiştirmek için yeterlidir.
        strb3.reverse();
        System.out.println(strb3);

        //"Inmutable"'larda orjinal değeri değiştirmek için method'u kullanmak yeterli olmaz bir de atama islemi yapmalısınız
        String abc = "Java";
        abc.replace("a", "i");
        System.out.println(abc);// atama yapmadan abc'yi yazdırırsak yine Java olarak sonucu göreceğiz
        //StringBuilder ile Stringin farkı budur
        abc = abc.replace("a", "i");
        System.out.println(abc);// abc operatörüne atama yaptığımız için artık ekranda Jivi olarak göreceğiz.

        //toString() ==> StringBuilder'ları String'e çevirir. String'e çevirdiğimiz için yazdırabilmek için
        //atama yapmamız gerekiyor o yüzden String stringStbr3 şeklinde atama yaptık.
        String stringStbr3 = strb3.toString();
        System.out.println(stringStbr3);

        //Bu işlem ile String'den StringBuilder'a dönmek için kullanılıyor.
        StringBuilder strb4 = new StringBuilder(stringStbr3);

        //insert(3, XXXX) ==> ilk 3 karakteri atla sonrasına XXXX koy demektir.
        strb4.insert(3,"XXXX");
        System.out.println(strb4);

        //insert(3,"KLMNOPQPRSTU", 5,8)==> 3. karakterden sonra "KLMNOPQPRSTU" Stringinin index 5,6,7'deki karakterlerini yerleştirir.
        strb4.insert(3,"KLMNOPQPRSTU", 5,8);
        System.out.println(strb4);

        //compareTo(karşılaştırma)
        StringBuilder a = new StringBuilder("Mava");
        StringBuilder b = new StringBuilder("Java");

        //compareTo(karşılaştırma) methodu
        //StringBuilder'lar tamamıyla aynı ise 0 verir.
        //a alfabetik sırada b'den sonra gelirse pozitif olarak aradaki alfabetik sıralama farkını gösterir.
        //a alfabetik sırada b'den önce gelirse negatif olarak  aradaki alfabetik sıralama farkını gösterir.
        int sonuc = a.compareTo(b);
        System.out.println(sonuc);


    }
}

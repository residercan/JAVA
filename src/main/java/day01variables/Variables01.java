package day01variables;

public class Variables01 {

    //variable nasil olusturulur

    // 1) Access Modifier 2) Data Type 3) Variable ismi 4) = 5) Deger 6) ;

    //Javada noktali virgul ingilizcedeki nokta gibidir
    //Ingilizcede cumle deriz Java da statement deriz
    //esittir sembolu `assigment (atama) operator` olarak adlandirilir
    //Assigment operator sagdaki degeri alir soldaki variablein icine koyar


    //Java da Data Typelari
    //Primitive Data Types
    /*
    1) int: Integerin kisaltmasi. Integer tam sayi demektir.
            Matematikde tam sayilarin basi ve sonu yoktur. Fakat Javada tam sayilarin basi ve sonu vardir
            En kücük int -2.147.483,648
            En büyük int  2.147.483,647

    2) byte: Tamsayılar icin kullanılır.
             En kücük byte = -128
             En büyük byte = 127

             int ve byte ikiside tamsayılar icin kullanılır.
             Ancak byte memoryde daha az yer kapladıgı icin byte yettigi yerlerde byte kullanılır.

     3) short: Tamsayılar icin kullanılır
               En kücük short -32.768
               En büyük short 32.767

     4) Long: Tamsayılar icin kullanılır.
              En kücük long -9.223,....
              En büyük long 9.223,....

     İnt 32 bit kullanır
     Byte 8 bit kullanır
     Short 16 bit kullanır
     Long 64 bit kullanır memory de

     Genel olarak büyükten küçüge Long, Integer, Short, Byte
     Hepsi tam sayı olup ayrı ayrı dataların olmasının sebebi memoryi verimli kullanmak icin.

     5) Float: Ondalıklı sayılar icindir. 32 bit kullanır
               float virgülden sonra 7 basamak icerebilir
               float degerlerinde sona f veya F koymamız gerekir


     6) Double: Ondalıklı sayılar icindir. 64 bit kullanır
                Double virgülden sonra 16 basamak icerebilir
                Ondalıklı sayılar icin genelde double kullanılır

     7) Boolean: true or false tercihleri icin kullanılır. 1 bit kullanır.

     8) Char: Tek karakterler icin kullanılır.
              a, c, 2, ?, _, gibi tek karakterler kullanılacaksa kullanılır.

                    Non-primitive Data Types



    public byte price = 12;

    public short populationOfVillage = 23000;

    //Long dememize ragmen java verilen sayıyı int kabul eder. Daha az memory de yer kapladıgı icin.
    //Longlara verdigimiz sayı int dısında ise mutlaka sonuna L konulmalıdır

    public long populationOfWorld = 8464784201L;

    public long x = 1234;

    //burada L koymadıgımız halde problem yok cunku 1234 int aralıgına uyar

    public float priceOfShirt = 13.99F;

    public double weightOfCell = 0.0000012845;

    public boolean isOld = true;

    public boolean isRich = false;

    public char initial = 'S';

    //Charlara değer verirken değeri tek tırnak arasına konulması gerekir yoksa hata verir.


    //Note: byte < short < int < long < float < double Numeric Data Types
    //Numeric olmayan Data Types: char ve boolean


   /* Primitive ile Non primitivelerin farkı nedir?
        1)Non primitive data typlerarında değerin yanında method vardır
        Primitive data typlarında ise sadece değer vardır method yoktur
        2)Primitive data typları java tarafından oluşturulmuştur, toplam 8 tanedir, biz primitive data oluşturamayız
        Non primitive data typeları java tarafından da oluşturulmuştur, biz de oluşturabiliriz.
        Non primitiveler sayılamayacak kadar coktur, cünkü her developer non primitive data tipi oluşturabilir.
        3)Primitive data type isimleri kücük harflerle baslar
        Non primitive data type isimleri büyük harfle baslar
        4) Primitive data typelar memory de farklı büyüklükte yerler kullanır.
        Non primitive data typeların hepsi memory de aynı büyüklükte yer kullanırlar.

    */

}
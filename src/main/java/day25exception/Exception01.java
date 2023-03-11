package day25exception;

public class Exception01 {

    /*
    1-"Exception" (istisnai hata) javada kodlarımız çalıştırırken meydana gelen beklenmedik durumlardır.
    2-Exceptionlar ile çalışmanın iki yolu vardır.
    -try-catch block kullanma ve exception olussa bile çalışmayı devam ettirme
    -throw exception kullanarak çalışmayı durdurma(mesela yazdığımız kod gereği bir dosya uzerinden okuma yapmamız
    gerekiyor ise bu dosyamız eğer silinmiş ise java dosyayı bulamaz ve uygulamanın devam etmesi gerekmez)
    3-Eğer exception'ı handle etmez isek (sorunu halletmezsek) java çalışmayı durdurur.
    4-try-catch kullanırken try kodunu bir yada birden fazla catch ile birlikte kullanabiliriz.
    try catch olmaksızın kullanılamaz.
    5-Eğer yazmış olduğunuz herhangi bir kod satirinda problem olabileceğini düşünüyorsanız try-catch block içine koymalısınız.
    catch block parantezi içerisinde olması muhtemel exception class ismi yazılır.
    6-e.getmessage(), methodunu kullanarak teknik mesajlar elde edebiliriz.
    System.out.println(); burada yazmış olduğum mesajlar benim teknik olmayan açıklamalarımdır.
    e.printStackTrace(); bize detaylıca teknik bilgi verir kod çalışmaya devam eder.
    System.err.println(); hata mesajını renkli olarak verir bu sayede consolda diğer mesajlardan ayırmak için kullanırız.
    */

    /*
    Bir kod yazilirken olasi exeptionlar ongorulup ona gore careler uretilmelidir.
    1-)Eger exeption olustugunda kodun calismaya devam etmesini istemiyorsak method
    isminin yanina bunu=olusabilecek exeptionu deklare edebiliriz.
    2-)Eger kodun calismaya devam etmesini istiyorsak sorun olusturabilecek kodu try chatch blogunun icine alir
    try bloguna sorun cikabilecek kodu catch bloguna olusabilecek exeption'i ve olasi exeption durumunda
    Javanin ne yapmasini istedigimizi yazabiliriz
     */

    public static void main(String[] args) {

        divide(6,2);//3
        divide(0,2);//0
        divide(6,0);//Matematikte bir sayı sıfır ile bölünemez.

        divide2(5,0);
        divide2(12,3);
        divide2(12,0);

    }
    //1. Yol Tavsiye Edilmez
    public static void divide(int a, int b){
        if(b==0){
            System.out.println("Bir sayı sıfır ile bölünemez");
        } else {
        System.out.println(a/b);}
    }

    //2. Yol try-catch kullanarak exception'ı handle(halletmek) etmek tavsiye edilir.
    //Java matematik ile ilgili karşılaşılması muhtemel tüm istisnaları, hataları ArtimeticException class'ına koymuştur.
    public static void divide2(int a, int b){

        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("Bölme işleminde bir hata oluştu"+ e.getMessage());
            e.printStackTrace();
            System.err.println("Bölme işleminde bir hata oluştu");//Yazdığımız hata mesajını kırmızı şekilde yazdırır.
            //kod çalışmaya devam eder.
            //Burada yazdigimiz e : 'Javanin exeptionu atayacagi obje
        }


    }



}

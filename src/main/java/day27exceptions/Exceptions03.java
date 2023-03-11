package day27exceptions;

public class Exceptions03 {

    /*
    1)Java kendi kurallarını Exception'lar oluşturarak Developer'ların Java kurallarına uymalarını temin etmiştir.
    2)Biz de Application üretirken kendi Exception'larimizi oluşturarak
    diğer developer'ların bizim ortaya koyduğumuz kurallara uymalarını temin ederiz.
    3)Javanın değil bizim ürettiğimiz Exception'lara "Custom Exception" denir.
    4)Custom Exception'lar da "RuntimeException" ve "CompileTimeException" olabilir.
    5)Custom "RuntimeException" üretmek için "extends RuntimeException" deriz ve parent class oluştururuz.
    6)Custom "CompileTimeException" üretmek için "extends Exception" deriz ve parent class oluştururuz.
     */


    public static void main(String[] args) throws IllegalGradeException {
        printGrades(60);//0-100 arasında hata vermiyor

        checkNameFormat("reşid");//1. Karakter küçük harf olunca hata veriyor.
    }

    //Ogrenci notlarini yazdiran bir method olusturunuz
    public static void printGrades(double grade) throws IllegalGradeException {
        if(grade<0 || grade>100){
            throw new IllegalGradeException("Grade 0 dan az 100 den cok olamaz");
        }else{
            System.out.println(grade);
        }
    }

    //Verilen ismin ilk harfinin büyük harf olmaması durumunda exception atan method yazınız.

    public static boolean checkNameFormat(String name){
        if(name.charAt(0)>='A' && name.charAt(0)<='Z'){
            return true;
        } else{
            throw new IllegalNameException("Isimler büyük harfle başlamalıdır.");
        }
    }

}
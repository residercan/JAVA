package day07ternarystringmanipulation;

public class StringManipulation01 {

    public static void main(String[] args) {

        /*
        String Class Methodları
        1- equals(): iki tane Stringin aynı olup olmadığını anlamamıza yarar
                     equals() methodu "boolean" return eder

        2- equalsIgnarCase() : iki tane Stringin büyük harf küçük harfe dikkat etmeden anlamamıza yarar.
                               equalsIgnarCase() methodu "boolean" return eder

        3- toLowerCase  : Bir stringteki tüm harfleri küçük harfe çevirmek için kullanılır
                          toLowerCase methodu "String" return eder

        4- toUpperCase  : Bir stringteki tüm harfleri büyük harfe çevirmek için kullanılır
                          toUpperCase methodu "String" return eder

        5- charAt() : Bir Stringten belli bir indexdeki characteri almak için kullanılır
                      charAt() methodu "char" return eder

        6- lenght() : Bir Stringte kaç tane karakter kullanıldığını öğrenmek için kullanılır
                      lenght() methodu "int" return eder

        7- contains()   : Bir Stringte belli bir karakterin veya karakterlerin var olup olmadığını anlamak için kullanılır.
                          contains() methodu "boolean" return eder

        8-split()   : Bir Stringi istediğimiz karakterden parçalamaya yarar
                      split() methodu bize "array" return eder

         */


        /*

            Bir passwordun geçerli olup olmadığını aşağıdaki kurallara göre kontrol eden kodu yazınız
            1-En az 8 karakter içermeli
            2-Space karakteri içermemeli
            3-ilk harfi "M" veya "m" olmalı
            4-Son karakteri "?" işareti olmalı

        */


        String pwd = "Manisa12?";

        //1-En az 8 karakter içermeli
        boolean first = pwd.length() > 7;
        //2-Space karakteri içermemeli
        boolean second = !pwd.contains(" ");
        //3-ilk harfi "M" veya "m" olmalı
        boolean third = pwd.charAt(0) == 'm' || pwd.charAt(0) == 'M';
        //4-Son karakteri "?" işareti olmalı
        boolean fourth = pwd.charAt(pwd.length() - 1) == '?';

        System.out.println(first && second && third && fourth);


    }
}

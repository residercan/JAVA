package day25exception;

public class Exception03 {
    public static void main(String[] args) {

    String str = "Ali";
    getNumOfChars(str);//3

    String s = "";//0
    getNumOfChars(s);//0

    String t = null;//NullPointerException
    getNumOfChars(t);
    //eger length methodunda null kullanırsanız bu exceptionı alırsınız
    }

    //Bir String'te bulunan karakterlerin sayısını bulabilmek için bir method oluşturunuz.

    public static void getNumOfChars(String str) {
    try {
        System.out.println(str.length());
    } catch (NullPointerException e) {
        System.out.println("Null hatası alındı===>" + e.getMessage());
        System.err.println("Null hatası alındı===>" + e.getMessage());
        e.printStackTrace();
    }

    }


}

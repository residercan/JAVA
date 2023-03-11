package day27exceptions;

public class IllegalGradeException extends Exception{

    public IllegalGradeException(String message){
        super(message);
    }

}

//Bu kodu yazarak kendi exception'ınımızı oluşturmuş olduk.
//Eger Exception Class'a extends ederseniz sizin class'ınız "compile time exception" olur.
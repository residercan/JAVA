package day02methodcreation;

public class Car {

    public String marka = "Honda";

    public int fiyat = 20000;


    public static void main(String[] args) {

        //Onject nasil olusturulur?
        //1-Class ismini yazınız 2-objeye bir isim veriniz 3-= 4-newkeywordünü kullan 5-class ismi parantezle beraber yaz (Constructor)

        Car myHonda = new Car();

        System.out.println(myHonda.fiyat);

        System.out.println(myHonda.marka);

        myHonda.hareketEt();

        myHonda.dur();



        //MethodCreation dan obje oluşturduk başka classda olmamıza ragmen

        MethodCreation obj = new MethodCreation();

    }

    public void hareketEt(){
        System.out.println("Honda güzel hareket eder...");
    }

    public void dur(){
        System.out.println("Honda güvenli durur");

    }










}

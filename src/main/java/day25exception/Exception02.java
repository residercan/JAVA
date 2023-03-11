package day25exception;

public class Exception02 {

    public static void main(String[] args) {

        String arr[] = {"Ali", "Can", "Veli", "Han"};
        getElementFromArray(arr,2);//Veli
        getElementFromArray(arr,0);//Ali
        getElementFromArray(arr, 10);


    }

    //Bir String Array'den index girerek eleman elde edebilmek için bir method oluşturun.
    public static void getElementFromArray(String arr[], int idx) {
        try {
            System.out.println(arr[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Max index 3'tür===>"+e.getMessage());//teknik olmayan kendi yazdığımız mesaj
            //err. yazarak hata mesajını kırmızı şekilde verir.

            e.printStackTrace();//detaylı teknik hata mesajı
        }



    }


}

package day18arraylistspassbyvalue;

public class PassByValue01 {

    /*
    1-) Java variable'ların orjinal değerlerini korumak ister.
    2-) Variable methodlar içinde kullanıldığında, Java methodun içine
    orjinal değeri koymaz o değerin kopyasını üretir ve method'a o kopyayı yollar.
    Method kopya üzerinde değişiklik yapar dolayısıyla variable'ın orjinal
    değeri korunmus olur. Bu sisteme "Pass By Value" denir.
    Note: Java "Pass By Value" kullanır.
    Note: Bazi programla dilleri orjinal değeri koruma altına almamıştır.
    Bu işi developerlara bırakmıştır. Bu tarz diller "Pass by Reference" kullanır.
     */

    public static void main(String[] args) {

        int x = 5;//Gomlek
        System.out.println(x); //5 görürüz


        //static method olan "main method"'un içindeki herşey static olmalıdır.
        change(x);//Oğrenci gömleği
        System.out.println(x); //Gömlek //Yine 5 görürüz çünkü java orjinal değeri değiştirmez.

        int ucret =100;

        ucret = indirim(ucret);//orjinal değeri illa değiştirmek isterseniz bu şekilde yapmalıyız.

        int kopya = indirim(ucret);//kopya olan değeri 90 olarak yazdırıyor.
        System.out.println(kopya);//orjinali değiştirmiyor

        System.out.println(ucret);// orjinal olan değeri değiştirmiyor.

    }

    //Method oluşturma psvm'nin altına yazılır.

    public static void change (int a){
        System.out.println(a*3);
    }
    //void dışındaki return typelarda method body'si içinde "return" keyword kullanılmalıdır.
    public static int indirim(int gomlekUcreti){
        return gomlekUcreti-10;
    }

}

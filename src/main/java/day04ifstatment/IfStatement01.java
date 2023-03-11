package day04ifstatment;

public class IfStatement01 {
    public static void main(String[] args) {

        //If it rains I will cancel the picnic
        //if statement belli kodlari belli sartlara bagli olarak calistirmaya yarar

        //Example 1: Sayi pozitif ise ekrana pozitif yazdirin.
        int s = 12;
        if(s>0){
            System.out.println("Positive");
        }

        //Example 2: Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdirin
        char ch = 'V';
        if(ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");
        }

        /*
            && islemi sadece boolean ile kullanilir
                true && true = true
                true && false = false
                false && true = false
                false && false = false
            && islemi mukemmelliyetcidir, true sonucunu alabilmek icin hersey true olmalidir.
            Bir tane false varsa sonuc false demektir.
        */

        //Example 3: Verilen bir sayi uc basamakli ise ekrana "Uc basamakli yazdiriniz"

        int n = 123;

        n = Math.abs(n);

        if(n>99 && n<1000){
            System.out.println("Uc Basamaklı");

    }

        //Example 4 verilen bir sayı çift sayı ise ekrana çift sayı yazdırınız

        //"=" isareti atama operatorudur, matematikteki esittir anlamina gelmez.
        //Matematikteki esittir sembolu Java'da "==" seklindedir
        //2+3  ==  5

        int p = 14;

        p = Math.abs(p);
        if(p % 2 == 0){
            System.out.println("Cift Sayı");

        }

        //example 5 verilen bir sayı 300den kücük veya 1200den büyük ise ekrana harika sayı yazdırın
        //Not= || bu işaret veya demektir. veya (||) sadece booleanlarla kullanılır.

        /*

           Note: veya  =  ||
           sadece boolean lar ile kullanılır.

              true || true = true
              false || true = true
              true || false = true
              false || false = false
         */

        int r = 250;

        if(r<300 || r>1200){
            System.out.println("Harika Sayı");
        }




}

    }


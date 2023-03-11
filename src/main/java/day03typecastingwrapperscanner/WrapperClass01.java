package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*
        Java primitivlere methodlar ekleyerek yeni bir yapı oluşturdu.
        Bu yapıya "wrapper class" denir.
        primitive           wrapper
        byte                Byte
        short               Short
        int                 İnteger
        long                Long
        float               Float
        double              Double
        boolean             Boolean
        char                Character

        Class yaptığı için büyük harfle başlatıyor. Class isimleri büyük harfle başlar
        Wrapper Class lar non primitivdir.


         */

        byte primitiveByte = 12; //primitivebyte yazıp nokta koyduğunuzda hiç method göremezsiniz çünkü primitivler method içermez sadece değer içerir.
        Byte wrapperByte = 12; //wrapperByte yazıp nokta koyduğunuzda birçok method görürsünüz çünkü wrapperlar method içerir.

        //byte data tipinin en küçük ve en büyük değerlerini ekrana yazdırınız

        byte enKucuk = -128;
        byte enBuyuk = 127;

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        //short, int, long data typelerinin en büyük ve en küçük değerlerini bulunuz

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        //"primitivler nasıl wrapperlara çevrilir. (Autoboxing)

        float f1 = 13.99F;
        Float wrapperF1 = f1; //Autobaxing

        //wrapperlar primitivlere nasıl çevrilir. (Unboxing)

        Character w1 = 's'; //Unboxing
        char primitiveW1 = w1;

        //Note: Autoboxing ve Unboxing java tarafından otomatik olarak yapılır.
        //bizim ekstra kod yazmamıza gerek yok








    }



}

package javaodev;

public class JavaOdev02 {

    public static void main(String[] args) {


        short yas = 12;
        int newYas = yas;

        long yas1 = 12L;
        int newYas1 = (int) yas1;

        double fiyat = 2.34;
        float newFiyat = (float)fiyat;

        double fiyat1 = 1.2;
        short newFiyat1 = (short)fiyat1;
        System.out.println(newFiyat1);

        byte age = 23;
        double newAge = age;
        System.out.println(newAge);

        byte min = Byte.MIN_VALUE;
        short max = Short.MAX_VALUE;
        System.out.println(min+max);






    }
}

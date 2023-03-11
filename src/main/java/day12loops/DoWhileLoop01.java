package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        int i = 1;

        while (i < 1) {
            System.out.println("While loop");
            i++;
        }//While loop bazı durumlarda hiç çalışmayabilir
        //yani while loop için "zero execution" mümkündür.

        int k = 1;

        do{
            System.out.println("Do while loop");
            k++;
        }while(k<1);
        //do while loop kullandığınızda loop bodysi içindeki kod en az 1 kere çalışır.
        //yani do while loop için "zero execution" mümkün değildir.

        //Example 1: bir ondalık sayının ondalık kısmındaki rakamlarının toplamını bulunuz.
        // 24.5673==>5+6+7+3
        double num = 24.5673;
        //String.valueOf(num); methodu parantezin içine konulan datanın tipini String yapar.
        String.valueOf(num);
        String str = String.valueOf(num);

        //regex için nokta kullandığınızda önüne "\\" koyunuz. yani nokta "\\." şeklinde kullanılır.

        //double önce Stringe çeviriyoruz split ile .'dan sonrasını kesiyoruz ondalık kısmı elde ediyoruz
        //ve ondalık kısmı integera çeviriyoruz.
        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);//5673

        int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt);//5673

        int sum = 0;

        do{
            sum = sum + decimalInt%10;
            decimalInt = decimalInt/10;

        }while(decimalInt>0);

        System.out.println(sum);









    }
}

package day18arraylistspassbyvalue;

public class Varargs01 {
    public static void main(String[] args) {

    /*
    1-) Farkli sayılardaki parametrelerle çalışabilen bir method oluşturmak isterseniz
    "varargs" kullanmalısınız.
    2-) "varargs" arka tarafta "array" kullanır bu yüzden varargs'larla çalışırken
    arraylerle çalışıyormuş gibi davranabilirsiniz. mesela for each loop kullanabilirsiniz.
    3-) "varargs" oluşturmak için "<data type>... <varargs ismi>" veya
    "<data type>  ...<varargs ismi>"
    4-) Bir method'da "varargs" yanında başka bir parametre kullanılabilir
    ancak "varargs" en sonda olmalıdır
    5-) Bir method'da birden fazla "varargs" kullanılamaz çünkü birinci "varargs"
    hiçbir şekilde dolmaz çünkü "varargs" dipsiz kuyu gibidir.
    "varargs" en sonda olmak zorunda olduğundan, birden fazla kullanırsanız en az biri
    en sonda olmayacaktır. bu da 4. madde ile çelişir.
     */


    int r1 = add(2,3);
        System.out.println(r1);//5
    int r2 = add(2,3, 4);
        System.out.println(r2);//9
    int r3 = add(2,3, 4, 5);
        System.out.println(r3);//14
    int r4 = add(2,3,4,5,6,7,8,15,25);
        System.out.println(r4);//75



    }
//    //iki sayinin toplamını return eden bir method oluşturunuz
//    public static int add (int a, int b) {
//        return a + b;
//    }
//    //üç sayinin toplamını return eden bir method oluşturunuz
//    public static int add (int a, int b, int c) {
//        return a + b + c;
//    }
//    //dört sayinin toplamını return eden bir method oluşturunuz
//    public static int add (int a, int b, int c, int d){
//        return a + b + c + d;
//    }

    //İstediğimiz kadar sayıyı toplayabileceğimiz bir method oluşturunuz

    public static int add (int... a){

        int sum = 0;

        for (int w : a) {
            sum = sum + w;
        }
        return sum;
    }


}

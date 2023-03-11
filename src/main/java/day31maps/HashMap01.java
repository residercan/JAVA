package day31maps;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


        /*
        1)Map'ler key-value structure kullanir
        2)Key'ler unique'dir
        3)Value'lar tekrarli data icerebilir
        4)Map'lerde eleman degil EntrySet kullaniriz.
        5)Key'ler de null tekrarsiz olarak kullanilir
        6)Value'lar null kabul eder.
        7)HashMap'ler EntrySet'leri herhangibir siralamaya tabi tutmaz, rastgele siralar
        8)Siralama ile vakit kaybetmedigi icin HashMap'ler cok hizli calisirlar.
        */
    public class HashMap01 {

        public static void main(String[] args) {

            HashMap<String, Integer> studentAges = new HashMap<>();
            studentAges.put("Ali", 13);
            studentAges.put("Tom", 21);
            studentAges.put("Brad", 12);
            studentAges.put("Ajda", 76);
            studentAges.put("Cuneyt", 75);
            studentAges.put("Ali", 88);//Ayni key degerini tekrar kullandiginizda hata vermez "overwrite" yapar
            studentAges.put(null, 55);
            studentAges.put(null, 66);
            studentAges.put("Ayhan Isik", null);
            studentAges.put("Sadri Alisik", null);
            System.out.println(studentAges); // {null=66, Ayhan Isik=null, Sadri Alisik=null, Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=88}

            //Map'den sadece key'ler nasil alinir
            Set<String> keys = studentAges.keySet();
            System.out.println(keys);//[null, Ayhan Isik, Sadri Alisik, Tom, Ajda, Brad, Cuneyt, Ali]

            //Map'den sadece value'lar nasil alinir
            Collection<Integer> values = studentAges.values();
            System.out.println(values);//[66, null, null, 21, 76, 12, 75, 88]

            //Belli bir key'e ait value nasıl alınır?
            Integer cuneytAge = studentAges.get("Cuneyt");
            System.out.println(cuneytAge);

            //Example 1: Tüm integer yaşların ortalamasını hesaplayan kodu yazınız.
            Collection<Integer> ages = studentAges.values();

            Integer sum = 0;
            double counter = 0;
            for (Integer w: ages) {
                if(w!=null){
                    sum += w;
                    counter++;
                }
            }
            System.out.println("Ortalama Yaş = " + (sum/counter));

            //Example 2: A ile başlamayan isimlerin içerdiği toplam karakter sayısını bulan kodu yazınız.

            //[null, Ayhan Isik, Sadri Alisik, Tom, Ajda, Brad, Cuneyt, Ali]
            Set<String> names = studentAges.keySet();

            int karakterSayisi = 0;
            for(String w : names){
                if(w!=null && !w.startsWith("A")){

                    karakterSayisi += w.length();
                }
            }
            System.out.println(karakterSayisi);

            //remove("Ajda", 76) key'si Ajda ve value'su 76 olan EntrySet'i siler ve size boolean return eder.
            boolean result = studentAges.remove("Ajda", 76);
            System.out.println(result);

            int result1 = studentAges.remove(null);
            System.out.println(result1);

            //Key varsa value'yı ver, key yoksa sizin istediğiniz değeri verir.
            //Brad varsa brad'in değeri olan 12'yi verir yoksa 0 ver dedik. 0'ı biz belirledik.
            int result2 = studentAges.getOrDefault("Brad", 0);
            System.out.println(result2);

            //Value null ise ekleme yapar, value null değilse ekleme yapmaz.
            //Eğer key hiç yoksa direk ekleme yapıyor.
            //Ayhan Isik null olduğu için 100 ekliyor. Eğer olmasaydı herhangi bir değişiklik yapmayacaktı.
            Integer result3 = studentAges.putIfAbsent("Ayhan Isik", 100);
            System.out.println(studentAges);
            System.out.println(result3);

            //replace() methodu value'ları değiştirmek için kullanılır
            Integer result4 =studentAges.replace("Ayhan Isik", 57);
            System.out.println(studentAges);

            //replace() methodu value'ları key ve value'yi kontrol ettikten sonra değiştirdi.
            //eğer ayhan ısık'ın eski yası 57 girildiyse 47 olarak değiştir diyor.
            //Eğer key de girili olan 57 yerine farklı bişey yazmış olsak herhangi bir değişiklik yapmayacaktı.
            studentAges.replace("Ayhan Isik", 57,47);
            System.out.println(studentAges);


            //Example 3: Map deki her bir entry'i ekrana farklı bir satırda olacak şekilde yazdırınız.
            //{Ayhan Isik=47, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Ali=88}
            //entrySet methodu Map'deki her bir entry'i Set'in içerisine koyar. Sonra for each loop döngüsü ile tek tek alarak ekrana yazdırır.
            Set<Map.Entry<String,Integer>> entries = studentAges.entrySet();
            for(Map.Entry<String,Integer> w: entries){
                System.out.println(w);
            }
            /*
            Ayhan Isik=47
            Sadri Alisik=null
            Tom=21
            Brad=12
            Cuneyt=75
            Ali=88
             */

        }

    }


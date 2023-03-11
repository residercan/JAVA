package day16multidimensionarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

         /*
        ArrayList'ler ayni data tipine sahip birden fazla data'yi depolamak icin kullanilir.

        Array ile ArrayList'in farki nedir?
            1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz.
              Array'ler eleman sayisinda "fixed" dirler.
              ArrayList'leri olustururken eleman sayisi soylemeye gerek yok, cunku ArrayList'ler eleman sayisinda "flexible"(esnek) dirlar.
            2)Array'lerin icine "primitive" ve "reference" lar konabilir.
              ArrayList'lerin icine ise sadece "non-primitive" ler konulur.
            3)Array'ler super fast, cok hizli. Array'ler memory i cok az kullanir.
            Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz, ama
                  eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin

     */

            //ArrayList nasil olusturulur?
            //1.Yol:
            ArrayList<Integer> ages = new ArrayList<Integer>();
            //2.Yol:
            ArrayList<Integer> heights = new ArrayList<>();
            //3.Yol:
            List<Integer> nums = new ArrayList<>();


            //ArrayList'ler nasil yazdirilir?
            System.out.println(nums);// []

            //ArrayList'lere nasil eleman eklenir?
            //add() her zaman elemani en sona ekler. (insertion order)
            nums.add(21);
            nums.add(18);
            nums.add(20);
            System.out.println(nums);// [21, 18, 20]

            nums.add(1, 50);
            System.out.println(nums);// [21, 50, 18, 20]

            List<Integer> prices = new ArrayList<>();
            prices.add(23);
            prices.add(185);

            nums.addAll(prices);
            System.out.println(nums);// [21, 50, 18, 20, 23, 185]
            System.out.println(prices);// [23, 185]

            nums.addAll(2, prices);
            System.out.println(nums);// [21, 50, 23, 185, 18, 20, 23, 185]

        //ArrayList'lerin eleman sayisi nasıl bulunur.

            int elemanSayisi = nums.size();
            System.out.println(elemanSayisi);// 8

        //ArrayList'lerde herhangi bir eleman nasıl seçilir
        //get() methodu istenen bir indexteki elemanı verir.
            int eleman1 = nums.get(3);//185
            System.out.println(eleman1);

        //ArrayList'in boş olup olmadığını nasıl anlarız

            boolean bos1 = nums.isEmpty();//True False verir. nums Arrayi dolu olduğu için False verecektir.
            System.out.println(bos1);// False
            boolean bos2 = ages.isEmpty();//True verecektir. hiç elemanı olmadığı için
            System.out.println(bos2);//True

        //ArrayList'de bir eleman nasıl değiştirilir
        //set var olan birşeyi değiştirmek dönüştürmek anlamındadır.

            nums.set(3,200); //3. indexteki rakamı 200 ile değiştir anlamında
            System.out.println(nums);

        //Example 1 : nums ArrayList'indeki tüm tek sayıları 11 artırdıktan sonra ekrana yazdırınız

        for(int w : nums){
            if(w%2!=0){
                nums.set(nums.indexOf(w),w+11);

            }

        }
        System.out.println(nums);

        //remove methodunun içine tam sayı koyarsanız java onu index olarak kabul eder.
        //Example 2 : ArrayList'ten 34 elemanının ilk görünümünü siliniz
        //Note 1: Tüm tamsayılar Java için aksi söylenmedikçe primitivedir yani int'dir.
        //Note 2: "Primitive"'ler ArrayListlerin elemanı olamazlar.
        //Note 3: "Primitive"'i wrapper class'a çevirirseniz non-primitive olur ve non-primitiveler ArrayList'lerin elemanı olur, index olamaz
        //remove ilk görünümü siler. 2 eleman da 34 ancak sadece ilk görünümdeki 34'ü siliyor.
        Integer sayi =34;//wrapper class'a çevirildi.
        nums.remove(sayi);//buraya sayi değil 200 yazınca java onu index olarak algılıyor ve hata veriyor.
        System.out.println(nums);// 200'ü siler




    }
}

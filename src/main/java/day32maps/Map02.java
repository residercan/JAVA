package day32maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Map02 {

    public static void main(String[] args) {

        //Size verilen bir kelimede kullanılan harflerin kacar kere kullanıldığını gösteren kodu yazınız.
        //abbcaa

        String kelime = "abbcaa";
        String[] harfler = kelime.split("");
        System.out.println(Arrays.toString(harfler));

        HashMap<String, Integer> gorunum = new HashMap<>();

        for(String w: harfler){
            Integer gorunumSayisi = gorunum.get(w);

            if(gorunumSayisi==null){
                gorunum.put(w,1);
            } else {
                gorunum.put(w, gorunumSayisi+1);
            }
        }

        System.out.println(gorunum);



    }
}

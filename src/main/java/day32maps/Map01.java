package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Map01 {

    public static void main(String[] args) {

    //Size verilen bir cümledeki her kelimenin kaç kere kullanıldığını gösteren kodu yazınız.
    //"I like to move it, move it." ==>

    String str = "I like to move it, move it.";

    //Noktalama işaretlerini sil
    str = str.replaceAll("\\p{Punct}", "");
        System.out.println(str);

        //Kelimeleri almak için split kullanalım

        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        HashMap<String, Integer> gorunum = new HashMap<>();

        for(String w: kelimeler){
            Integer gorunumSayisi = gorunum.get(w);
            if(gorunumSayisi==null){
                gorunum.put(w, 1);
            } else {
                gorunum.put(w, gorunumSayisi+1);
            }
        }

        System.out.println(gorunum);//{move=2, like=1, I=1, to=1, it=2}


    }
}

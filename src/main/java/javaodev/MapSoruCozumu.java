package javaodev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MapSoruCozumu {

    public static void main(String[] args) {

        //Size verilen bir cümledeki her kelimenin kaç kere kullanıldığını gösteren kodu yazınız.
        //"I like to move it, move it." ==>

        String str = "I like to move it, move it.";
        str = str.replaceAll("\\p{Punct}", "");
        System.out.println(str);
        String[] strNew = str.split(" ");
        System.out.println(Arrays.toString(strNew));

        HashMap<String, Integer> gorunum = new HashMap<>();


        for (String w : strNew) {
            Integer gorunumSayisi = gorunum.get(w);
            if (gorunumSayisi == null){
                gorunum.put(w, 1);
            } else {
                gorunum.put(w, gorunumSayisi+1);
            }

        }
        System.out.println(gorunum);



        //Size verilen bir kelimede kullanılan harflerin kacar kere kullanıldığını gösteren kodu yazınız.
        //abbcaa

        String kelime = "abbcaa";
        String[] yeniKelime = kelime.split("");
        System.out.println(Arrays.toString(yeniKelime));

        HashMap<String, Integer> gorunum1 = new HashMap<>();

        for (String w: yeniKelime){
            Integer gorunumSayisi = gorunum1.get(w);
            if (gorunumSayisi==null){
                gorunum1.put(w, 1);
            } else {
                gorunum1.put(w, gorunumSayisi+1);
            }
        }

        System.out.println(gorunum1);
















    }
}

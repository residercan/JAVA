package day08stringmanipulation;

import java.util.Scanner;

public class StringManipulation02 {

    public static void main(String[] args) {

        //Example 4: Bir Stringdeki space hariç kaç tane karakter kullanıldığını gösteren kodu yazınız
        //"Ali okula gitti." ==> 14

        String str = "Ali okula gitti.";

        int num = str.replace(" ", "").length();

        System.out.println(num);

        //Note : replace() methodu bir Stringdeki herhangi bir karakteri veya karakterleri değiştirmek için kullanılır.





        //Example 5: Bir Stringdeki tüm 'a' harflerini 'A' ya çeviriniz

        String s = "Ankara'nin taşina gozlerinin yaşina bak.";

        String S = s.replace("a", "A");

        System.out.println(S);


        //Example 6: Bir Stringdeki "kara" kelimesinin yerine "*" koyunuz

        String kara = "Kara kara dusunme Ankara";
        String yeniKara = kara.replace("kara", "*");
        System.out.println(yeniKara);//Kara * dusunme An*

        //Example 7 : Bir Stringdeki tüm sayıları "*" a çeviriniz

        String stdId = "MRE1020116743";
        String newstdId = stdId.replaceAll("[0-9]", "*");
        System.out.println(newstdId);

        /*
            Bir grup datayi ifade eden kodlara "Regex" denir
            "Regex" Regular Expressions in kısaltılmış halidir.
            1-) tüm rakamları ifade etmek isterseniz [0-9]
            2-) tüm küçük harfler ==> [a-z]
            3-) tüm büyük harfler ==> [A-Z]
            4-) tüm harfler ==> [a-zA-Z]
            5-) Sesli harfler ==> [aeiouAEIOU]
            6-) Space ==> [ ]
            7-) Tüm rakamlar ve tüm harfler ==> [0-9a-zA-Z]
            8-) tüm noktalama işaretleri ==> \\p{Punct} --- Noktalama işaretleri için regex


            1-) Rakamlar hariç tüm karakterler [^0-9]
            2-) Küçük harfler hariç tüm karakterler [^a-z]
            3-) Büyük harfler hariç tüm karakterler [^A-Z]
            4-) Tüm harfler hariç tüm karakterler [^a-zA-Z]
            5-) space hariç [^ ]

         */


        //Example 8: Verilen bir Stringde kullanılan noktalama işareti ve rakamlar ve space karakteri haric
        //           tüm karakterlerin sayısını bulan kodu yazınız

        String u = "Ali 13 yasinda, dersem inanma!...";
        int U = u.replaceAll("[0-9]", "").
                replace(" ", "").
                replaceAll("\\p{Punct}", "").
                length();
        System.out.println(U);



        //Example 9: Bir passwordun geçerli olup olmadığını aşağıdaki kurallara göre test eden kodu yazınız
            // 1- Space haric en az sekiz karakter olmali
            // 2- En az 1 sembol içermeli
            // 3- En az 1 rakam içermeli
            // 4- En az 1 büyük harf içermeli
            // 5- En az 1 küçük harf içermeli

        String pwd = "B78c? K!m";

        // 1- Space haric en az sekiz karakter olmali
        boolean first = pwd.replace(" ", "").length()>7;

        // 2- En az 1 sembol içermeli
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]", "").length()>0;

        // 3- En az 1 rakam içermeli
        boolean thirt = pwd.replaceAll("[^0-9]", "").length()>0;

        // 4- En az 1 büyük harf içermeli
        boolean fourth = pwd.replaceAll("[^A-Z]", "").length()>0;

        // 5- En az 1 küçük harf içermeli
        boolean fifth = pwd.replaceAll("[^a-z]", "").length()>0;

        boolean pwdGecerli = first && second && thirt && fourth && fifth;

        if(pwdGecerli){
            System.out.println("Password'unuz geçerlidir...");
        } else{
            System.out.println("Password'unuz geçerli değildir...");
        }



        //Example 7: Bir Stringdeki noktalama işaretlerinin karakter sayısını gösteren kodu yazınız

        String cumle = "Sen yapmazsan, ben ?...";
        int number = cumle.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(number);


        //Example 8: Verilen bir String "Al" ile başlıyor ve "x" ile bitiyorsa ekrana "Harika" yazdırın
        //aksi halde normal yazdırın

        String v = "Alex";

        boolean baslangic = v.startsWith("Al");//Bir stringin neyle başladığını kontrol ediyor

        boolean bitis = v.endsWith("x");//Bir stringin neyle bittiğini kontrol ediyor

        String result = baslangic && bitis ? "Harika" : "Normal";

        System.out.println(result);


    }
}

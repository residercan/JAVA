package javaodev;

public class ArraysSoruCozumu {

    public static void main(String[] args) {

        /*String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
        alınız.
         Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJ
        */

        String[] arr = new String[]{"Kemal", "Jonathan", "Mark", "Jackson", "Ali"};

        String brr = "";

        for (String w : arr) {
            if(w.endsWith("n") || w.endsWith("k")){
                brr += w.substring(0,1);
            }

        }
        System.out.println(brr);



        //String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
        //Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26

        String[] crr = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int sum = 0;
        for (String w :crr){
            sum += w.length();
        }
        System.out.println(sum);


        //Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz

        String s = "Apex is an object oriented programming language";

        String[] drr = s.split(" ");
        int counter = 0;

        for(String w : drr){
            if(w.startsWith("a")||w.startsWith("A")){
                counter++;
            }
        }
        System.out.println(counter);











    }



}

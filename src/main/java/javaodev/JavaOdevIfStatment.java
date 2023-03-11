package javaodev;

import java.util.Scanner;

public class JavaOdevIfStatment {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir ay adı giriniz");

        String ayAdi = input.nextLine();

        if(ayAdi.equalsIgnoreCase("Aralık") ||
                ayAdi.equalsIgnoreCase("Ocak") ||
                ayAdi.equalsIgnoreCase("Şubat")){
        System.out.println("Kış");}
        else if (ayAdi.equalsIgnoreCase("Mart") ||
                ayAdi.equalsIgnoreCase("Nisan") ||
                ayAdi.equalsIgnoreCase("Mayıs")){
        System.out.println("İlkbahar");}
        else if (ayAdi.equalsIgnoreCase("Haziran") ||
                ayAdi.equalsIgnoreCase("Temmuz") ||
                ayAdi.equalsIgnoreCase("Agustos")){
        System.out.println("Yaz");}
        else if (ayAdi.equalsIgnoreCase("Eylül") ||
                ayAdi.equalsIgnoreCase("Ekim") ||
                ayAdi.equalsIgnoreCase("Kasım")){
            System.out.println("Sonbahar");}
        else {
            System.out.println("Geçerli bir ay ismi giriniz");
        }




    }




}

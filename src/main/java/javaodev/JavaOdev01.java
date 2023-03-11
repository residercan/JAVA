package javaodev;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class JavaOdev01 {

    public static void main(String[] args) {

        JavaOdev01 Odev = new JavaOdev01();

        System.out.println(toplamFiyat(12.99, 23.99, 15.99));
        System.out.println(Odev.ayakkabiFiyat);
        System.out.println(Odev.gomlekFiyat);
        System.out.println(Odev.sapkaFiyat);

        System.out.println(degiskenlerinCarpimi(15.99F,13,12));
        System.out.println(Odev.y);
        System.out.println(Odev.z);
        System.out.println(Odev.x);

        System.out.println(basitFaizDegeri(10000, 6, 3));
        System.out.println(Odev.anapara);
        System.out.println(Odev.oran);
        System.out.println(Odev.yilDegeri);

        System.out.println(degiskenToplami("Sonuc", 123, 923456782));
        System.out.println(degiskenCarpimi("Sonuc", 123, 9123456782L));

    }
    public double gomlekFiyat =12.99;
    public double sapkaFiyat =23.99;
    public double ayakkabiFiyat =15.99;
    public static double toplamFiyat(double gomlekFiyat, double sapkaFiyat, double ayakkabiFiyat){
        return gomlekFiyat+sapkaFiyat+ayakkabiFiyat;
    }


    public float x = 15.99F;
    public long y = 13L;
    public int z = 12;

    public static double degiskenlerinCarpimi (float x, long y, int z){
        return x*y*z;
    }

    public int anapara = 10000;
    public int oran = 6;
    public int yilDegeri = 3;

    public static int basitFaizDegeri (int anapara, int oran, int yilDegeri){
        return anapara*oran*yilDegeri/100;
    }

    public String s = "Sonuc";
    public long a = 123L;
    public long b = 9123456782L;

    public static String degiskenToplami (String s, long a, long b){
        return (s+(a+b));
    }

    public static String degiskenCarpimi (String s, long a, long b){
        return (s+(a*b));
    }






    }









package javaodev;

public class JavaOdevSwitch {

    public static void main(String[] args) {

        String cinsiyet = "Kadin";

        switch (cinsiyet.toLowerCase()){
            case "kadin":
                System.out.println("Kadin");
                break;
            case "erkek":
                System.out.println("Erkek");
                break;
            default:
                System.out.println("diğerleri");


        }






    }

}


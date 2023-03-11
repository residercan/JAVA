package day24statickeywordencapsulation;

public class StudentRunner {

    public static void main(String[] args) {


        Student std1 = new Student();//obje oluşturduk.

        //Getter
        System.out.println(std1.getStdId());//TH202201

        System.out.println(std1.getGpa());//3.8

        System.out.println(std1.isRetired());//false

        //Setter
        //Değişimler obje üzerinde olur.
        // Studen Class'a gidip bakarsak herhangi bir değişim olmadığını görmüş oluruz.
        std1.setStdId("AB");//set değişimi yapar

        System.out.println(std1.getStdId());//AB //okuma get ile olur.

        std1.setGpa(4.0);

        System.out.println(std1.getGpa());//4.0

        std1.setRetired(true);

        System.out.println(std1.isRetired());//true




    }


}

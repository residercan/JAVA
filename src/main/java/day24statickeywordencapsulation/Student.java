package day24statickeywordencapsulation;

//Encapsulation : "Data Hiding(gizlemek)" demektir.

//Data'yi niçin gizlersiniz? Data'yi dış etkenlerden korumak için.

//Data'yi nasıl gizlersiniz? Access modifierını "private" yaparak gizlerim.

//Data'yi gizledikten sonra başka Class'lardan okumak istersen ne yaparsın?
//"get method"'lar(getter) oluşturarak gizlediğimiz dataları okunur hale getirebiliriz.

//Data'yi gizledikten sonra başka Class'lardan değiştirmek istersen ne yaparsın?
//"set method"'lar(setter) oluşturarak gizlediğimiz dataları değiştirebiliriz.


public class Student {

    //4 adet gizlenmiş data oluşturduk.

    public String stdName = "Tom Hanks";

    private String stdId = "TH202201";//Datayi private yaparak gizledik.

    private double gpa = 3.8;

    private boolean retired = false;

    //Getter "get method"
    //Variable'ın "data type" ile get method'un "return type" aynı olmalıdır.
    //stdId==getStdId==> isimlendirme methodu denir. get methoduna çevirdiğimiz için başına get ekliyor.
    //booleanlarda cevap true false olduğu için "isRetired" yani başına "is" ekliyor.
    //get method'lari isimlendirirken "get + <variable name>" ancak
    // variable'ın data type "boolean" ise "is + <variable name>"
    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    //Setter "set method"


    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}

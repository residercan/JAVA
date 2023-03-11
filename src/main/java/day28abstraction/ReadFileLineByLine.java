package day28abstraction;

import java.io.*;

public class ReadFileLineByLine {

    /*
    Note: "throw" ile "throws" arasındaki farklar nelerdir?
    1)"throw" method'un body'si içinde kullanılır. "throws" ise method'un isminden sonra kullanılır.
    2)"throw"'dan sonra obje oluşturulur. "throws"'dan sonra ise sadece Exception Class'in ismi yazılır.
    3)"throw" method'un içinde istediğimiz yerde Exception atmak için kullanılır. "throws" ise var olan
    checked Exception'ı atmak için kullanılır.
    Yani "throw" Exception üretir. "throws" var olan Exception'i atar.
    4)"throw" dan sonra sadece bir tane Exception olabilir. "throws"'dan sonra birden fazla Exception olabilir.

    -Bir dosyayı satır satır okumak için "readLine() " kullanılır. readLine() methodu nu kullanabilmek için BufferedReader
    objesine ihtiyaç duyarız.
     RuntimeException'larda throws kullanılmaz. CompileTimeException'larda throws kullanılır.
     */
    public static void main(String[] args) {

    readFileLineByLine();


    }

    public static void readFileLineByLine(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\day27exceptions\\File1.txt"));

            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ya path yanlis ya da dosya silinmis - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Okunamayacak character veya charecterler var - " + e.getMessage());
        }
    }



}

package team15;

public class LoopsWith01 {
    public static void main(String[] args) {

        /*
         * * * * *
          * * * *
           * * *
            * *
             *
         */
        int s = 10;
        for (int i = 1; i<=s; i++){
            for (int b = 2; b<=i; b++){
                System.out.print(" ");
            }
            for (int y = s; y>=i; y--){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}

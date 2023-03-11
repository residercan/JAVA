package team15;

public class LoopsWith02 {
    public static void main(String[] args) {


        /*
             *
            * *
           * * *
          * * * *
         * * * * *

         */
        int s = 8;
        for (int i = 1; i<=s; i++){
            for (int b = s-1; b>=i; b--){
                System.out.print(" ");
            }
            for (int y = 1; y<=i; y++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}

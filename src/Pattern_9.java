/**
      *
     **
    ***
   ****
  *****
   ****
    ***
     **
      *
 */
public class Pattern_9 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 6 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
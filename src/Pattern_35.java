/**
   *  *  *
    *  *
   *  *  *
    *  *
   *  *  *
 */
public class Pattern_35 {
    public static void main(String[] args) {
        for(int i=1; i<= 5; i++)
        {
            if(i%2 != 0)
            {
                for(int j=1; j<= 5/2+1; j++)
                {
                    System.out.print("*  ");
                }
            }
            else
            {
                for(int j=1; j<= 5/2; j++)
                {
                    System.out.print(" * ");
                }
            }
            System.out.println("");
        }
    }
}

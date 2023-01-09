/*    1  1  1  1  1   
      2  2  2  2   
      3  3  3   
      4  4   
      5            */

public class pattern_12

{
    public static void main(String args[])
    {
        int i,j,c=0;
        for(i=5;i>0;i--)
        {
            c++;
            for(j=0;j<i;j++)
            {
                
                System.out.print(c+  "  ");
                
            }
            
            System.out.println(" ");
        }
    }
}

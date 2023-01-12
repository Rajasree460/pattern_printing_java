/* right triangle number */
import java.util.*;
public class patt_23
{
    public static void main(String args[])
    {
        int n,i,j,k;
        System.out.println("enter the value of n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=1;j<n-i;j++)
            {
                 System.out.print(" ");
            }
            for(k=0;k<=i;k++)
            {
                 System.out.print(k+1);
            }
             System.out.println("");
        }
    }
}





/*
  
(for example if n=5)
        1
       12
      123
     1234
    12345
 
  
 */

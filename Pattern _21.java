/* right down triangle */
import java.util.*;
public class patt_21
{
    public static void main(String args[])
    {
        int n,i,j,k;
        System.out.println("enter the value of n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
              System.out.print(" ");  
            }
            for(k=n;k>i;k--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}







/*
  
(for example if n=5)
    *****
     ****
      ***
       **
        *
 
 */

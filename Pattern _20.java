/* hollow square */
import java.util.*;
public class patt_20
{
    public static void main(String args[])
    {
        int n,i,j;
        System.out.println("enter the value of n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0||i==n-1)
                System.out.print("*");
                else
                {
                    if(j==0||j==n-1)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

/*
 
(for example if n=5)
*****
*   *
*   *
*   * 
*****
 
 */ 

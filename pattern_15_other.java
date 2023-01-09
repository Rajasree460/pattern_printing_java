import java.util.*;
public class patt_15_user_other_way
{
    public static void main(String args[])
    {
        int n,i,j;
        System.out.println("enter the value of n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(i=n-1;i>0;i--)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}




/*   (for example if n=5)
            *
            **
            ***
            ****
            *****
            ****
            ***
            **
            *       */

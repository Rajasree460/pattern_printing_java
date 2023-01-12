import java.util.*;
public class patt_18
{
    public static void main(String args[])
    {
        int n,i,j;
        System.out.println("enter the value of n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
          for(j=1;j<=i;j++)
          {
              System.out.print(j+ " ");
          }
          System.out.println(" ");
        }
    }
}
/*  (for example if n=5)

1 2 3 4 5  
1 2 3 4  
1 2 3  
1 2  
1  
          */

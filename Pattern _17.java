import java.util.*;
public class patt_17

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
                
                if(j%2==0)
                System.out.print("1");
                else
                System.out.print("0");
            }
            System.out.println(" ");
        }
    }
}






/*  (for example if n=5)
1 
10 
101 
1010 
10101   
       */

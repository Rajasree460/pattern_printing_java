import java.util.*;
public class pattern_11_other_way
{
    public static void main(String args[])
    {
        int n,i,j,c=1;
        System.out.println("enter the value of n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i;j++)
            {
                System.out.print(c+  "  ");
                
            }
            System.out.println(" ");
        }
    }
}
/*  (for example if n=5)
    1  1  1  1  1   
    1  1  1  1   
    1  1  1   
    1  1   
    1            */

import java.util.Scanner;
public class pattern_11

{
    public static void main(String args[])
    {
        int i,j,n;
        System.out.println("enter the value of n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            int c=1;
            for(j=0;j<n-i;j++)
            {
                
                System.out.print(c+  "  ");
                
                
            }
            c++;
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

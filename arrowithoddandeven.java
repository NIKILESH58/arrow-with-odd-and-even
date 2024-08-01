import java.util.Scanner;
public class arrowithoddandeven
{
    public static void main(String[] args) 

    {
        Scanner sc = new Scanner(System.in);      
        int n = 5;
        for(int i=0;i<n;i++)
        {
            int j=1;
            for(int k=0;k<=i;k++)
            {
              System.out.print(j+" ");
              j=j+2;
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            int j=2;
            for(int k=0;k<=n-i-1;k++)
            {
              System.out.print(j+" ");
              j=j+2;
            }
            System.out.println();
        }
    }
}
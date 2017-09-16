import java.util.*;
public class prime
{
public static void main(String args[])
{
    int n,i,j,k;
  	Scanner s=new Scanner(System.in);
    System.out.println("Enter a number\n");
    n=s.nextInt();
    for(i=2;i<n;i++)
    {
        k=0;
        for(j=2;j<i;j++)
        {
            if(i%j==0)
                k=1;
        }
        if(k==0)
            System.out.println("    "+i);
    }
}
}

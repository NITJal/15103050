import java.util.*;
  
public class Sort
{
    public static void main(String args[])
    {
        String temp;
        int i,j,n;
        Scanner s = new Scanner(System.in);
         
        System.out.print("Enter number of names\n");
        n= s.nextInt();
        s.nextLine();
        
        String names[] = new String[n];
             
        for( i=0; i<n; i++)
        {
            System.out.print("Enter name number " + (i+1) + "  ");
            names[i] = s.nextLine();
        }
         
        
        for( i=0; i<n; i++)
        {
            for( j=1; j<n; j++)
            {
                if(names[j-1].compareTo(names[j])>0)
                {
                    temp=names[j-1];
                    names[j-1]=names[j];
                    names[j]=temp;
                }
            }
        }
         
         
        System.out.println("\nSorted names are\n");
        for(i=0;i<n;i++)
        {
            System.out.println(names[i]);
        }
    }
}

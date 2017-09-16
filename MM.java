import java.util.*;
 
public class MM
{
   public static void main(String args[])
   {
      int m, n, p, q, sum = 0, i, j, k;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of rows and columns of first matrix\n");
      m = in.nextInt();
      n = in.nextInt();
 
      int a[][] = new int[m][n];
     
      System.out.println("Enter the elements of first matrix\n");
 
      for ( i = 0 ; i < m ; i++ )
         for ( j = 0 ; j < n ; j++ )
            a[i][j] = in.nextInt();
 
      System.out.println("Enter the number of rows and columns of second matrix\n");
      p = in.nextInt();
      q = in.nextInt();
      int b[][] = new int[p][q];
      int c[][] = new int[m][q];
 
      if ( n != p )
         System.out.println("Matrices can't be multiplied with each other\n");
      else
      {
         System.out.println("Enter the elements of second matrix");
 
         for ( i = 0 ; i < p ; i++ )
            for ( j = 0 ; j < q ; j++ )
               b[i][j] = in.nextInt();
 
         for ( i = 0 ; i < m ; i++ )
         {
            for ( j = 0 ; j < q ; j++ )
            {   
               for ( k = 0 ; k < p ; k++ )
               {
                  sum = sum + a[i][k]*b[k][j];
               }
 
               c[i][j] = sum;
               sum = 0;
            }
         }
 
         System.out.println("Product is:-");
 
         for ( i = 0 ; i < m ; i++ )
         {
            for ( j = 0 ; j < q ; j++ )
               System.out.print(c[i][j]+"   ");
 
            System.out.print("\n");
         }
      }
   }
}

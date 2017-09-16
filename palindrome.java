import java.util.*;
 
public class palindrome
{
   public static void main(String args[])
   {
      String s, r = "";
      Scanner in = new Scanner(System.in);
      int i,l;
    
      System.out.println("Enter the string\n");
      s = in.nextLine();
 
      l = s.length();
 
      for ( i = l - 1; i >= 0; i-- )
         r = r + s.charAt(i);
 
      if (s.equals(r))
         System.out.println("The String is a palindrome.");
      else
         System.out.println("The string is not a palindrome.");
   }
}

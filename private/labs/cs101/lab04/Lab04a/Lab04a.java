import java.util.Scanner;

/**
 * Program name: Lab04a
 * Description: This program outputs values using while structure .
 * @author Aldo Tali 21500097
 * version 1.00, 2015/10/22
 * */

public class Lab04a
{
   public static void main (String [] args)
   {
     Scanner scan = new Scanner (System.in);
     
     //constants
     final int LIMIT_1 = 11;
     final int LIMIT_2 = -6;
     final int FIXED_MAX = 25;
     final int FIXED_MIN = 0;
     final int NUM_OF_ROWS = 5;
     final int START_1 = -10;
     
     //variables
     int number1 = START_1 ;
     int number2 = NUM_OF_ROWS ;
     int number3 = FIXED_MIN;
     int n;
     int count = FIXED_MIN;
    
     System.out.println("Please enter the value of a number n");
     n = scan.nextInt();
    
     //print numbers from Start_1 to Limit_1
     while (number1 < LIMIT_1)
     {
       System.out.print (number1 + " ");
       number1++;
     }
     
     System.out.println();
     
     //print numbers from Num_Of_Rows to Limit_2
     while (number2 > LIMIT_2)
     {
       System.out.print(number2 + " ");
       number2--;
     }
     
     System.out.println();
     
     // print integer values until n with a tab charachter
     if (n < FIXED_MIN || n > FIXED_MAX)
     {
       System.out.print("The value you entered for n is invalid. N must be greater than 0 and less than 25");
     }
     else
     {
       while (number3 < n )
       {
         System.out.print( n-number3 +"\t");
         number3++;
         count++;
         if ((count % NUM_OF_ROWS) == FIXED_MIN)
         {
           System.out.println();
         }
       }
     }
   }
}
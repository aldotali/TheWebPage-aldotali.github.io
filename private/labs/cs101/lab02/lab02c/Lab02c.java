import java.util.Scanner;
/**
 * Program name: Lab02c
 * Description: This program does basic mathematical calculations and finds the minimum and maximum of two numbers, by getting two integer values from the user.
 * @author Aldo Tali 21500097
 * version 1.00, 2015/10/08
 * */

public class Lab02c
{
  public static void main ( String[] args)
  {
    Scanner scan = new Scanner ( System.in);
    //constants
    
    //variables
    int    number1;
    int    number2;
   
    //program code
    
    System.out.println ( "welcome to the mathematical operator Lab02c.");
    //Get the numbers from the user
    System.out.print ("Please enter two integer values:");
    number1 = scan.nextInt();
    number2 = scan.nextInt();
    
   
    // Print user friendly language and compute basic mathematical operations.   
    System.out.println ("The sum of the numbers is: " + number1 + " + " + number2 + " = " +  (number1 + number2));
    System.out.println ("The difference of the numbers is: " + number1 + " - " + number2 + " = " + (number1 - number2));
    System.out.println ("The product of the numbers is: " + number1 + " * " + number2 + " = " + (number1 * number2));
    System.out.println ("The division of the numbers is: " + number1 + " / " + number2 + " = " + (number1 / number2));
    System.out.println ("The remainder of the division of the numbers is: " + (number1) + " % " + (number2) + " = " + (number1 % number2));  
    System.out.println ("The maxýmum value function is: " + Math.max(number1, number2) );
    System.out.println ("The minimum value function is: " + Math.min(number1, number2) );
    System.out.println ();  
                      
   }
}
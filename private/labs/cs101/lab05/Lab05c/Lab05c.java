import java.util.Scanner;

/**
 * Program name: Lab05c
 * Description: This program outputs simple calculator with a menu
 * @author Aldo Tali 21500097
 * version 1.00, 2015/11/05
 * */

public class Lab05c
{
  public static void main ( String [] args )
{
    Scanner scan = new Scanner (System.in) ;
    
    //initialization of constants
    final double ZERO = 0.0;
    final int VA = 0;
    final int VA1 = 10;
    final int VA2 = 1;

    
    //variables
    double sum; 
    double number;
    int n;
    String a;
    int fact = VA2; 
    
    System.out.println ("Welcome to SimpleCalc...");
    sum = ZERO; //initialize sum
    
    // run the program at least once
    do  
    {
      // print the menu 
      System.out.println ( "------------------" );
      System.out.println ( "[" + sum + "]" );
      System.out.println ( "------------------" );
      System.out.println ( "+,-,*,/,sin value" );
      System.out.println ( "Clear" );
      System.out.println ( "Quit" );
      System.out.println ( "------------------" );
      System.out.println ( "Select: " );
      
      // get the string
      a = scan.next(); 
      
      // check the charachter inputed in the string and based on it perform the operations
      // check if user wants to clear
      if (new String(a).equals("Clear") || new String(a).equals("clear") || new String(a).equals("C") || new String(a).equals("c") ) 
      {
        // make sum 0
        sum = ZERO;
       
      }
      // if the user wants to quit terminate the loop
      else if (new String(a).equals("quit") || new String(a).equals("Quit") || new String(a).equals("Q") || new String(a).equals("q") ) 
      {
        System.out.println ("Thanks for using \"SimpleCalc\", goodbye."); 
        
      }
      
      // check if user enters + 
      else if ( new String(a).equals("+"))
      {
        number = scan.nextDouble();
        // add number to the sum
        sum = sum + number; 
      }
      // check if user enters -
      else if ( new String(a).equals("-")) 
      {
        number = scan.nextDouble(); 
        // decrease number from the sum
        sum = sum - number; 
      }
      
      // check if user enters /
      else if ( new String(a).equals("/")) 
      {
        number = scan.nextDouble();
        // divide sum by the number
        sum = sum / number; 
      }
      // check if user enters *
      else if ( new String(a).equals("*")) 
      {
        number = scan.nextDouble();
        // multiply the sum by the number
        sum = sum * number; 
      }
      // check if the user enters sin
      else if ( new String(a).equals("sin")) 
      {
        // compute the sin of sum
        sum = Math.sin ( sum );
        n= scan.nextInt ();
        
        //tayler series
        /*for (int j = VA2; j <= (2*n+VA2); j++) 
        {
            fact *= j;
        }

        for (int i = VA; i < n; i++)
        {
          sum = sum + (Math.pow ( -1,n )/fact) * Math.pow(n,2*n + VA2);
        }
      } */ 
      // decrease k so that the loop is performed at least one more time
      
      }
    }while ( new String(a).equals("Clear") || new String(a).equals("clear") || new String(a).equals("C") || new String(a).equals("c") || new String(a).equals("+") || new String(a).equals("-") || new String(a).equals("/") || new String(a).equals("*") || new String(a).equals("sin" ));
}
}

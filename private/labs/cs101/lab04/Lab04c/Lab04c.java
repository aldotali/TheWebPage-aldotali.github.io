import java.util.Scanner;

/**
 * Program name: Lab04c
 * Description: This program prints a triangle with a charachter the user enters .
 * @author Aldo Tali 21500097
 * version 1.00, 2015/10/22
 * */

public class Lab04c
{
  public static void main (String [] args)
  {
    Scanner scan = new Scanner (System.in);
    
    //constants
    final int START_VALUE = 0; 
    final int START_VALUE1 =1;
    
    //variables
    char ch;
    int width;
    int count;
    int space = START_VALUE;
    int print = START_VALUE1 ;
    
    System.out.println("Please enter a charachter and the width of the triangle: ");
    
    ch = scan.next().charAt(0);  // enter a charachter
    width = scan.nextInt();  // enter an integer

    count = START_VALUE;   //inititialize count
    
    while (space < width) //loop until space reaches the value of integer entered
    {
      count = START_VALUE;
      while (count < print) //loop until cunt reaches the value of print
      {
        System.out.print (ch); // print charachter
        count ++;
      }
      
      print ++;
      space++;
      System.out.println(); // print a line
      
      //test program
      /*double d;
      d = 0.1;
      while ( d < 1.0 )
      {
        System.out.println( d);
        d = d + 0.1;
      }
      System.out.println( d + " <- final value after loop!");*/
    }
  }
}
  
  
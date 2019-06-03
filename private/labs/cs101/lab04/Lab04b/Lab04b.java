import java.util.Scanner;

/**
 * Program name: Lab04b
 * Description: This program gets integers from the user and sums them without storing them. .
 * @author Aldo Tali 21500097
 * version 1.00, 2015/10/22
 * */


public class Lab04b
{
  
  public static void main (String [] args)
  {
    Scanner scan = new Scanner (System.in);
    
    //constants
    final int NUM_OF_INT = 8;
    final int START_VALUE = 0;
    final int NUM_OF_VALUES = 100;
    
    //variables
    int count = START_VALUE;
    int count1 = START_VALUE;
    int sum = START_VALUE;
    int n;
    int min = START_VALUE;
    int max = START_VALUE;
    double average;
    
    //get a number of n integers and sum them
    /*System.out.println ("Please enter " + NUM_OF_INT + " integer values");
    
    while (count < Num_Of_Int)
    {
      n = scan.nextInt();
      sum = sum + n;
      count++;
    }
    
    System.out.println ("The value of count is " + count);
    System.out.println ("The sum of the numbers you have entered is: " + sum );*/
    
    // get n integers and find min max and average of the numbers 
    /*System.out.println ("Please enter " + NUM_OF_VALUES + " integer values");
    count = START_VALUE;
    sum = START_VALUE;
    while  (count < NUM_OF_VALUES)
    {
      n = scan.nextInt();
      if (count == START_VALUE)
      {
        min = n;
        max = n;
      }
      if (n <= min)
      {
        min = n;
      }
      if (n >= max)
      {
        max = n;
      }
      sum = sum + n;
      count++;
    }
    average = (double) sum/NUM_OF_VALUES; 
    System.out.println ("The average of the first " + Num_Of_Values + " values is: " + average);
    System.out.println ("The minimum of the values is: " + min);
    System.out.println ("The maximum of the values is: " + max);*/
    
    
    //Enter integers until you enter a negative value
    System.out.println ("Please enter integer values");
    count = START_VALUE;
    sum = START_VALUE;
    while (count1 == START_VALUE)
    {
      n = scan.nextInt();
      if (n >= START_VALUE)
      {
        if (count == START_VALUE)
        {
          min = n;
          max = n;
        }
        if (n <= min)
        {
          min = n;
        }
        if (n >= max)
        {
          max = n;
        }
        sum = sum + n;
        count++;
      }
      else
      {
        count1 = START_VALUE;
        count1--;
      }
    }
    
    
    average = (double)sum/count; 
    System.out.println ("The average of the first " + count + " values is: " + average);
    System.out.println ("The minimum of the values is: " + min);
    System.out.println ("The maximum of the values is: " + max);
    
  }
}
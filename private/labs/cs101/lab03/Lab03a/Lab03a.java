import java.util.Scanner;

/**a
  * Program name: Lab03a
  * Description: This program uses a loop to print numbers based on conditions
  * @author Aldo Tali 21500097
  * version 1.00, 2015/10/15
  * */


public class Lab03a
  
  
{ 
  public static void main (String[] args)
  {
    Scanner scan = new Scanner (System.in) ;
    
    int n;
    int sum=0;
    int countpositive = 0;
    int countnegative = 0;
    
    System.out.println("Plese enter an integer less than or equal to 10: ");
    n= scan.nextInt();
    for ( int  x = -10; x <= 10; x++ ) //repetition loop from -10 to 10.
    {
      if (x>=4 && x<=8) //check if x is between and 8
      {
        System.out.print("In range "); //print the message if the condition is satistified.
        System.out.println(x + " ");// print the value of x
      }
      else
      {
        System.out.println(x + " ");// print the value of x
      }
      if (x>0)
      {
        countpositive ++ ; //increase the value of countpositive by 1 each time x takes a positive value
      }
      else if (x<0)
      {
        countnegative ++ ; //increase the value of countpositive by 1 each time x takes a positive value
      }
      if (x<-5)
      {
        System.out.println("Too Low"); //if the statement is true print the message
      }    
      if (x>-5 && x<5)
      {
        System.out.println("Acceptable"); //if the statement is true print the message
      }
      if (x==5)
      {
        System.out.println("Right on!"); //if the statement is true print the message
      }
      if (x>5)
      {
        System.out.println("Too High"); //if the statement is true print the message
      }
      if (x>0 && x<=n)
      {
        sum = sum + x; //if the statement is true add the number to the sum
      }
      
    }
    System.out.println("The number of pozitive numbers is " + countpositive);
    System.out.println("The number of negative numbers is " + countnegative);
    if (n>10)
    {
      System.out.println("The number n is not between 1 and 10");
    }
    else
    {    
      System.out.println("The sum of the integers is: " + sum);
      System.out.println("The formula n*(n+1)/2 is: " + n*(n+1)/2);
      if (sum == (n*(n+1)/2)) // check if the sum matches the formula
      {
        System.out.print("The sum and the formula are the same"); //print the message
      }
      else
      { System.out.print("The sum and the formula are not the same");} //print the message
    }
    
    
  }
}
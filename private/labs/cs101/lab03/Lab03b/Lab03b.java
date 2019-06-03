import java.util.Scanner;

/**
 * Program name: Lab03b
 * Description: This program takes the lengths checks �f they are s�des of a triangle of the sides of a garden (triangle) and finds the maximum number of flowers that can be planted in the garden .
 * @author Aldo Tali 21500097
 * version 1.00, 2015/10/15
 * */


public class Lab03b
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner (System.in) ;
    
    //constants
    final int NUMBER_OF_FLOWERS = 17;
    //variables
    int sidea;
    int sideb;
    int sidec;
    double area;
    double semiperimeter;
    int maxflowers;
    
    //program code
    
    //print welcome message and ask the user to enter the sides of the triangle.
    System.out.println ("Welcome to the Garden program Lab03b.");
    System.out.print ("Please enter the lengths of the sdes of the Garden");
    
    //Get the sides of the triangle from the user
    sidea = scan.nextInt();
    sideb = scan.nextInt();
    sidec = scan.nextInt();
    
    //check if the sides form a triangle
    if ((sidea<(sideb + sidec)) && (sideb<(sidea + sidec)) && (sidec<(sidea + sideb)) )
    {
      //make the mathematical computeations by Heron`s formula
      semiperimeter = (sidea + sideb + sidec)/2.0;
      area = ( semiperimeter * (semiperimeter - sidea) * (semiperimeter - sideb) * (semiperimeter - sidec) ) ;
      maxflowers = (int) ( Math.sqrt(area) * NUMBER_OF_FLOWERS );
      
      //print out the result
      System.out.println ("The area of triangle is: " +area );
      System.out.println ("The maximum number of flowers that can be planted in the garden is: " + maxflowers ) ;
      
      
      System.out.println ();
    }
    
    //if the condition of the triangle is not fulfilled print error message
    else
    {
      System.out.println("The sides that you entered do not form a triangle!");
    }
  }
}
import java.util.Scanner;

/**
 * Program name: Lab02d
 * Description: This program takes the lengths of the sides of a garden (triangle) and finds the maximum number of flowers that can be planted in the garden .
 * @author Aldo Tali 21500097
 * version 1.00, 2015/10/08
 * */


public class Lab02d
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner (System.in) ;
    
    //constants
    //variables
    int sidea;
    int sideb;
    int sidec;
    double area;
    double semiperimeter;
    int maxflowers;
   
        //program code
    
    //print welcome message and ask the user to enter the sides of the triangle.
    System.out.println ("Welcome to the Garden program Lab02d.");
    System.out.print ("Please enter the lengths of the sdes of the Garden");
    
    //Get the sides of the triangle from the user
    sidea = scan.nextInt();
    sideb = scan.nextInt();
    sidec = scan.nextInt();
    
    //make the mathematical computeations by Heron`s formula
    semiperimeter = (sidea + sideb + sidec)/2.0;
    area = ( semiperimeter * (semiperimeter - sidea) * (semiperimeter - sideb) * (semiperimeter - sidec) ) ;
    maxflowers = (int) ( Math.sqrt(area) * 17 );
    
    //print out the result
    System.out.println ("The maximum number of flowers that can be planted in the garden is: " + maxflowers ) ;
                       
                                                                
    System.out.println ();
                                                                                                          
   }
}
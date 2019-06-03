import java.util.Scanner;

/**
 * Program name: Lab05a
 * Description: This program outputs a rectangle of a gýven heýght wýdth and thýckness
 * @author Aldo Tali 21500097
 * version 1.00, 2015/11/05
 * */

public class Lab05a
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner (System.in) ;
    
    // initialize the values of the constants
    final int VA = 0;
    final int VA1 = 1;
    final int VA2 = 2;
    final char VA3 = 'a';
    
    //variables
    int width;
    int height;
    int thickness;
    char c = VA3;
      
    do
    {
      // print message
      System.out.println ( "Enter the width, height and thickness of the rectangle" ); 
      
      //get the values from the user
      width = scan.nextInt ();       
      height = scan.nextInt ();
      thickness = scan.nextInt ();
      
      // check if the values are not valid
      if ( width <= VA || height <= VA || thickness <= VA ) // check if the values are not valid
      {
        System.out.println ( "Sorry you have entered a negative value" );
      }
      // if the values are valid run the program
      else 
      {
        //print the rows of stars which have no spaces
        for ( int i = VA; i < thickness; i++ ) 
        {
          //print stars for each row until the width is reached
          for ( int j = VA; j < width; j++ ) 
          {
            System.out.print( "*" );
          }
          // go to the next line
          System.out.println (); 
        }
        
        // print the rows which are composed of stars and spaces
        for ( int i = VA; i < ( height-( VA2 * thickness ) ); i++ ) 
        {
          // loop for printing spaces and stars in a row
          for ( int j = VA; j < width; j++ ) 
          {
            // check if printing spaces should start
            if ( j == thickness ) 
            {
              // loop for printing spaces
              for ( int space = VA; space < ( width-( VA2*thickness )); space++ ) 
              {
                System.out.print( " " );
                j++;
              }
              
            }
            //print stars
            System.out.print( "*" ); 
            
          }
          // new line at the end of each row
          System.out.println (); 
        }
        
        // loop printing the second part which contains only stars
        for ( int i = VA; i < thickness; i++ ) 
        {
          // loop that prints stars in a row
          for ( int j = VA; j < width; j++ ) 
          {
            // print stars
            System.out.print( "*" ); 
          }
          // go to the next line
          System.out.println (); 
          
        }
        // check if there are any spaces in the program
        if (( height-( VA2 * thickness )) <= VA ) 
        {
          // print  message
          System.out.println ( "Oopss no hole" ); 
        }
        //print message
        System.out.println( "Do you want to create another pattern? " ); 
        // get a character from the user
        c = scan.next().charAt(0); 
        // check if the user wants to run the program one more time
      }
    }while ( c == 'Y' || c == 'y' );
  }
  
}


  
  
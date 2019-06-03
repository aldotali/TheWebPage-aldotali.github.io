import java.util.Scanner;

/**
 * Program name: Lab05b
 * Description: This program runs loops to print rows and columns
 * @author Aldo Tali 21500097
 * version 1.00, 2015/11/05
 * */

public class Lab05b
{

public static void main (String[] args)
{
  Scanner scan = new Scanner (System.in);
  
  //initialization of constants
  final int VA = 0;
  final int VA1 = 1;
  final int VA2 = 2;
  final int COL = 6;
  
  //variables
  int row;
  int column;
  int k = VA;
  
  //print message
  System.out.println("Please enter the number of rows and columns: "); 
  
  // get the number of rows
  row = scan.nextInt(); 
  // get the number of columns
  column = scan.nextInt(); 
  
  // first loop
  for ( int i = VA; i <= row; i++ ) 
  {
    // run a loop for the output in each row
    for ( int j = VA; j <= column; j++ ) 
    {
      int lengthj = String.valueOf (j).length ();
      int lengthi = String.valueOf (i).length ();
      
      for ( int h = VA; h < (COL - ( lengthj + lengthi + VA1 )); h++)
      {
        System.out.print( " " );
      }
 
      System.out.print( i + "," + j ); 
      
 
      
    }
    // go to the next line
    System.out.println (); 
  }
  // go to the next line
  System.out.println (); 
  
  // second loop
  for ( int i = VA; i <= row; i++ ) 
  {
    // run a loop for each row 
    for ( int j = VA; j <= column; j++ ) 
    {
      int lengthij = String.valueOf ( i*j ).length ();
      
      for ( int h = VA; h < ( COL - lengthij ); h++)
      {
        System.out.print( " " );
      }
      System.out.print ( i * j );
      
    }
    // go to the next line
    System.out.println(); 
  }
  //go to the next line
  System.out.println(); 
  
  // third loop
  for ( int i = VA; i <= row; i++ ) 
  {
    // run a loop for each row
    for (int j = VA; j <= column; j++) 
    {
      int lengthk = String.valueOf ( k ).length ();
      int lengthj = String.valueOf ( j ).length ();
      
      for ( int h = VA; h < ( COL - lengthk ); h++)
      {
        System.out.print( " " );
      }
      System.out.print ( k );
      
      k++;
    }
    //go to the next line
    System.out.println (); 

  }
  //go to the next line
  System.out.println (); 
  
    // fourth loop
    for ( int i = VA ; i <= row; i++ ) 
    {
      
        for ( int j = VA; j <= column; j++ ) 
        {
          if ( j == VA )
          {
            int lengthi = String.valueOf ( i ).length ();
            int lengthj = String.valueOf ( j ).length ();
            
            for ( int h = VA; h < (COL - ( lengthj + lengthi + VA1 )); h++)
            {
              System.out.print( " " );
            }
            System.out.print(i + "," + j);
          }
          
          int lengthi = String.valueOf ( i ).length ();
          int lengthj = String.valueOf ( j ).length ();
          
          for ( int h = VA1; h < (COL - ( lengthj + VA2   )); h++)
          {
            System.out.print( " " );
          }
          System.out.print ( "-," + j );
        }
        System.out.println ();
      }
   
      //go to the next line
      System.out.println(); 
  }
}

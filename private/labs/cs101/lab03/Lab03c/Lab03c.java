import java.util.Scanner;
import java.nio.file.*;   
import java.io.*;

/**
 * Program name: Lab03c
 * Description: This program ecorporates java in Html file by asking the user of the name ,age , salary and comments and prints an image in the HTMl page .
 * @author Aldo Tali 21500097
 * version 1.00, 2015/10/15
 * */


public class Lab03c
{
  public static void main (String[] args)
  {
    Scanner scan1 = new Scanner (System.in) ;
    Scanner scan2 = new Scanner (System.in) ;
    
    //constant
    final double TAX_RATE_1 = 0.95;
    final double TAX_RATE_2 = 0.75;
    final double TAX_RATE_3 = 0.85;
    //variables
    String name;
    int age;
    double salary;
    double usedtax;
    double copysalary;
    String comments;
    String filename;
    
    //Print out mmessage
    //System.out.println ("Welcome to Lab02e assignment - Html encorporated code" );
    //print out message ang get the string value for name 
    // System.out.println ("Please enter the name");
    
    name = scan2.next();
    filename = name;
    
    //print out message ang get the integer value for age
    //System.out.println ("Please enter the age");
    age = scan1.nextInt();
    if (age >0)
    {
      //print out message ang get the double value for salary 
      // System.out.println ("Please enter the salary");
      salary = scan1.nextDouble();
      copysalary = salary;
      if (salary>0 && salary<10000)
      {
        if (salary<1000)
        {
          salary = (salary-100) *TAX_RATE_1;
        }
        else if (salary>5000)
        {
          salary= (salary-100)*TAX_RATE_2;
        }
        else
        {
          salary= (salary-100)*TAX_RATE_3;
          
        }
        
        usedtax= 100-((salary/(copysalary-100)) *100);   
        
        //print out message ang get the string value for comments 
        //System.out.println ("Please enter the comments");
        comments = scan1.next();
        final String HTML = "<html>";
        final String HEAD = "<head>";
        final String TITLE = "<title>";
        final String HOMEPAGE = "'s Home Page</title>";
        final String END_HEAD = "</head>";
        final String BODY = "<body>";
        final String HR = "<hr>";
        final String IMAGE1 = "<img src=\"";
        final String IMAGE2 =  "\".gif align=\"left\">";
        final String H1 = "<h1>";
        final String END_H1 = "</h1>";
        final String PARAGRAPH1 = "<p>Age: ";
        final String END_PARAGRAPH1 = "</p>";
        final String PARAGRAPH2 = "<p>Salary: ";
        final String BRACKETS1 = " (";
        final String BRACKETS2 = "%) ";
        final String COMMENTS = "<p>Comments: ";
        final String BR = "<br clear= \"all\">";
        final String END_BODY = "</body>";
        final String END_HTML = "</html>";
        //print the Html code.
        System.out.println (HTML);
        System.out.println ();
        System.out.println ();
        System.out.println (HEAD);
        System.out.println ();
        System.out.println ();
        System.out.println (TITLE + name + HOMEPAGE);
        System.out.println (END_HEAD);
        System.out.println (BODY);
        System.out.println ();
        System.out.println ();
        System.out.println (HR);
        if (Files.exists( Paths.get( filename + ".gif" ) ))
        {    
          System.out.println (IMAGE1 + name + IMAGE2);
        }
        System.out.println (H1 + name + END_H1);
        System.out.println (PARAGRAPH1 + age + END_PARAGRAPH1);
        System.out.println (PARAGRAPH2 + salary + BRACKETS1 + usedtax + BRACKETS2 + END_PARAGRAPH1 );
        System.out.println (COMMENTS + comments + END_PARAGRAPH1); 
        System.out.println (BR);
        System.out.println (HR);
        System.out.println (END_BODY);
        System.out.println (END_HTML);  
        System.out.println ();
        
      }
      else
      {
        System.out.println ("Salary must be positive and less than 10000!");
      }
      
    }
    else 
    {
      System.out.println("Age must be positive ");
    }
    
    
  }
}
import java.util.Scanner;

/**
 * Program name: Lab02e
 * Description: This program ecorporates java in Html file by asking the user of the name ,age , salary and comments .
 * @author Aldo Tali 21500097
 * version 1.00, 2015/10/08
 * */


public class Lab02e
{
  public static void main (String[] args)
  {
    Scanner scan1 = new Scanner (System.in) ;
    Scanner scan2 = new Scanner (System.in) ;
    //variables
    String name;
    int age;
    double salary;
    String comments;
    
    //Print out mmessage
    //System.out.println ("Welcome to Lab02e assignment - Html encorporated code" );
    //print out message ang get the string value for name 
   // System.out.println ("Please enter the name");
    name = scan2.next();
    //print out message ang get the integer value for age
    //System.out.println ("Please enter the age");
    age = scan1.nextInt();
    //print out message ang get the double value for salary 
   // System.out.println ("Please enter the salary");
    salary = scan1.nextDouble();
    
    //print out message ang get the string value for comments 
    //System.out.println ("Please enter the comments");
    comments = scan1.next();
    
    //print the Html code.
    System.out.println ("<html>");
    System.out.println ();
    System.out.println ();
    System.out.println ("<head>");
    System.out.println ();
    System.out.println ();
    System.out.println ("<title>" + name + "'s Home Page</title>");
    System.out.println ("</head>");
    System.out.println ("<body>");
    System.out.println ();
    System.out.println ();
    System.out.println ("<hr>");
    System.out.println ("<h1>" + name + "</h1>");
    System.out.println ("<p>Age: " + age + "</p>");
    System.out.println ("<p>Salary: " + salary + "</p>");
    System.out.println ("<p>Comments: " + comments + "</p>");
    System.out.println ("<br clear= \"all\">");
    System.out.println ("<hr>");
    System.out.println ("</body>");
    System.out.println ("</html>");
    
    System.out.println ();
  }
}
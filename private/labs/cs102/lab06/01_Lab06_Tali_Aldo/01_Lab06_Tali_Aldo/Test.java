import java.util.Scanner;

/*
 * Progam name : Test Lab06a
 * Description : tests the countChar recurrsive method
 * @author : Aldo Tali 2150009
 * Version: 1.0;
 * 
 * */

public class Test
{
    public static void main ( String[] args)
    {
        Scanner scan = new Scanner ( System.in);
        
        //properties
        String input;
        Lab06a dummy;
        
        dummy = new Lab06a();
        
        do
        {
        System.out.println("Please enter the string you want to check");
        input = scan.next();
        
        if (!input.equals("-1"))
        System.out.println("The number of times the character a apperars in " + input + " is " + (dummy.countChar(  input)));
        }while(!input.equals( "-1"));
}
}
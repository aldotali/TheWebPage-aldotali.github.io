import java.util.Scanner;

/*
 * Progam name : Test Lab06b
 * Description : tests the countChar recurrsive method
 * @author : Aldo Tali 2150009
 * Version: 1.0;
 * 
 * */

public class Testd
{
    public static void main ( String[] args)
    {
        Scanner scan = new Scanner ( System.in);
        
        //properties
        int input;
        Lab06d dummy;
        
        dummy = new Lab06d();
        
        do
        {
        System.out.println("Please enter the number of digits");
        input = scan.nextInt();
        
        System.out.println("The numbers are  \n" + (dummy.evenNo(  input)));
        }while(input != -1);
}
}
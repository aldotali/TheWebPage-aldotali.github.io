import java.util.Scanner;

/*
 * Progam name : Test Lab06b
 * Description : tests the countChar recurrsive method
 * @author : Aldo Tali 2150009
 * Version: 1.0;
 * 
 * */

public class Testb
{
    public static void main ( String[] args)
    {
        Scanner scan = new Scanner ( System.in);
        
        //properties
        int input;
        Lab06b dummy;
        
        dummy = new Lab06b();
        
        do
        {
        System.out.println("Please enter the integer you want to convert");
        input = scan.nextInt();
        
        System.out.println("The conversion of " + input + "  to binary is " + (dummy.decToBinary(  input)));
        }while(input != -1);
}
}
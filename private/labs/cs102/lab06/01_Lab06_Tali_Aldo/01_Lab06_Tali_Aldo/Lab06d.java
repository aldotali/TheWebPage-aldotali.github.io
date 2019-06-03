/*
 * Progam name : Lab06d
 * Description : returns the ascending numbers with a given number of digits
 * @author : Aldo Tali 21500097
 * Version: 1.0;
 * 
 * */
import java.util.*;

public class Lab06d
{
    //properties
    int generator = 0;
    String s = "";
    
    //checks the  digits of the number
    public boolean checkDigit( int num, int n)
    {
        if ( n <= 1) // checks for a single digit
            return true;
        else if ( n <=2 ) // checks for two digits
            return ( num/10 < num%10);
        else if ((int)(num/(Math.pow(10,n-1))) < ((int)(num/Math.pow(10,n-2)))%10) // checksthe first and the second digit
            return checkDigit((int)(num%(Math.pow(10,n-1))), n-1);//checks the second with the procedding and so on
        else
        {
            generator = generator + 6;
            return false;
        }
    }
    
    public String evenNo( int n)
    {
        generator += 2;
        
        //pass to the number of digits needed
        if ( generator < Math.pow(10,n-1))
        { 
            generator = (int)(Math.pow(10,n-1));
        }
        
        //stops the generation
        if ( generator >= Math.pow(10,n))
        {
            generator = 0;
            return s;
        }
        
        else if ( checkDigit( generator, n))
            return s + generator + " " + evenNo(n) +" ";
        else
            return s + ""+ evenNo(n) +" ";

    }  
}
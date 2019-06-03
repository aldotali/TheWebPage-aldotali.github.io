/*
 * Progam name : Lab06b
 * Description : returns the binary representation of a decimal as a String
 * @author : Aldo Tali 21500097
 * Version: 1.0;
 * 
 * */

public class Lab06b
{
    //returns the binary representation of a decimal number as a String
    public String decToBinary( int x)
    {
        if( x == 0 || x == 1) // stop case is either 1 or 0
            return x + "";
        else
             return ( decToBinary ( x/2) + "" + x % 2); // divide by 2 and add the remainder to the new number
    }
}
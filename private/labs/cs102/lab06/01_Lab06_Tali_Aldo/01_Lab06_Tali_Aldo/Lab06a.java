/*
 * Progam name : Lab06a
 * Description : returns the number of times char 'a' is repeated in a string using recursion
 * @author : Aldo Tali 21500097
 * Version: 1.0;
 * 
 * */

public class Lab06a
{
    //counts the number of times the charachter 'a' apperars in a given String
    public int countChar( String x)
    {
        //the stop case when empty String  is given
        if (x.length() < 1)
                return 0;
            else if (x.charAt(0) == 'a')
                return 1 + countChar( x.substring(1,x.length())); // adds one for the first letter and counts the remaining substring
            else
                return countChar( x.substring(1,x.length())); //conts the remaiing substring
            }
}
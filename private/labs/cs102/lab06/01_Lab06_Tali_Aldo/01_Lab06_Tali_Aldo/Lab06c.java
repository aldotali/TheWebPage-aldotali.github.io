/*
 * Progam name : Lab06b
 * Description : checks wether the strings are in lexographical order
 * @author : Aldo Tali 21500097
 * Version: 1.0;
 * 
 * */
import java.util.*;

public class Lab06c
{
    public boolean compareString( ArrayList<String> x, int start)
    {
        //the stop case is when the start index exceeds the Arraylist size
        if (start >= x.size() -1 )
            return true;
        else if ( x.get(start +1).compareTo( x.get(start)) < start)
        { 
            return false;
        }
        else 
        {
            return compareString(x, start +1);
        }
    }
}
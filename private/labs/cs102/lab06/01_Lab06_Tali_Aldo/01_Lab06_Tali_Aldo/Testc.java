import java.util.Scanner;

/*
 * Progam name : Test Lab06b
 * Description : tests the countChar recurrsive method
 * @author : Aldo Tali 2150009
 * Version: 1.0;
 * 
 * */
import java.util.*;

public class Testc
{
    public static void main ( String[] args)
    {
        Scanner scan = new Scanner ( System.in);
        
        //properties
        ArrayList<String> input;
        String word;
        Lab06c dummy;
        
        dummy = new Lab06c();
        input = new ArrayList<String>();
        word = "";
        
        while(!(word.equals("-1")))
        {
        System.out.println("Please enter the words and pres -1 when finished");
        word = scan.next();
        input.add(word);
        
        }
        
        input.remove(input.size()-1);
        System.out.println(input);
        
        System.out.println("Are the words in order? " + dummy.compareString(input,0));
               
      }
}
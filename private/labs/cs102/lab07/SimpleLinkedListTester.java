/*
 * @author: Aldo Tali
 * Id: 21500097
 * Program Description: Tester for the SimpleLinkedList
 * Date: 19/04/2016
 * 
 * */

public class SimpleLinkedListTester
{
    public static void main ( String[] args )
    {
        //properties
        SimpleLinkedList test;
        
        test = new SimpleLinkedList();
        
        //populates the list
        test.addToHead("Aldo");
        test.addToHead("Redi");
        test.addToHead("Laerti");
        test.addToHead("Igli");
        
        //checks the methods are working
        System.out.println("The index 1 is: " + test.get(1));
        System.out.println("Is it empty: " + test.isEmpty());
        System.out.println(test);
        System.out.println("First remove " + test.removeFromHead());
        System.out.println("Second remove " + test.removeFromHead());
        System.out.println("Third remove " + test.removeFromHead());
        System.out.println("Fourth remove " + test.removeFromHead());
        
    }
}
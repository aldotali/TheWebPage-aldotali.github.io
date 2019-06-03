/*
 * @author: Aldo Tali
 * Id: 21500097
 * Program description: creates a stack using the SimpleList class
 * 
 * */

public class SimpleStack extends SimpleLinkedList
{
    //constructor
    public SimpleStack()
    {
       super();
    }
    
    //adds a new  item to the list
    public void push( String item)
    {
        super.addToHead( item);
    }
    
    //removes /pops out an item from the list
    public String pop()
    {
        return super.removeFromHead();
    }
    
        
}
/*
 * @author: Aldo Tali
 * Id: 21500097
 * Program description: Creates a lists of items
 * Date: 19/04/2016
 * 
 * */

public class SimpleLinkedList 
{
    private ItemNode list;
    
    //initializes an empty list
    public SimpleLinkedList ()
    {
        list = null;
    }
    
    
    //adds a node at the beginiong of the list
    public void addToHead( String item)
    {
        //properties
        ItemNode temp;
        ItemNode current;
        
        temp = new ItemNode( new Item( item));
        
        if ( list == null)
            list = temp;
        else
        {
            temp.next = list;
            list = temp;
        }
    }
    
    //adds a node at the beginiong of the list
//    public void addToHead( String item)
//    {
//        //properties
//        ItemNode temp;
//        ItemNode current;
//        
//        temp = new ItemNode( new Item( item) );
//        
//        if ( list == null)
//            list = temp;
//        else
//        {
//            current = list;
//            while ( current != null )
//            {
//                current = current.next;
//            }
//            
//            current.next = temp;
//        }
    
//    }
    
    //returns the string representation of the nodes in the list;
    public String toString()
    {
        String output = "";
        ItemNode current;
        
        current = list;
        
        while( current != null )
        {
            output += current.item + "\n";
            current = current.next;
        }
        
        return output;
    }
    
//    //removes the first node 
//    public String removeFromHead()
//    {
//        String s = "";
//        if ( list == null)
//            return s;
//        else
//        {
//            while(list.next != null)
//            {
//                //temp = list.next;
//                list = list.next;
//                
//                s = s + list.toString();
//            }
//        }
//        return s;
//    }
    
    //checks if list is empty
    public boolean isEmpty()
    {
        return ( list == null);
    }
    
    //returns the node at a given index
    public String get( int index)
    {
        //properties
        int count = 0;
        ItemNode current;
        
        current = list;
        
        //concats the Strings
        while ( count <= index)
        {
            if ( count == index )
            {
                return (current.item).toString();
            }
            else
            {
                count++;
                current = current.next;
            }
        }
        return "";
    }
    
    //removes an item from the list and return its String representation
    public String removeFromHead()
    {
        if (isEmpty())
            return "";
        else
        {
            ItemNode temp = list;
            list = list.next;
            return temp.item +"";
        }
    }
    //creates a node as the first in the list
    private class ItemNode
    {
        public Item item;
        public ItemNode next;
        
        // creates the node appropriately
        public ItemNode ( Item i)
        {
            //System.out.println("   " + i); 
            item = i;
            //System.out.println("   " + item); 
            next = null;
        }
    }
}
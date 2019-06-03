/*
 * @author: Aldo Tali 
 * Id: 21500097
 * Program description: Building a list of nodes
 * Date: 19/04/2016
 * 
 * */

public class Item
{
    //properties 
    private String title;
    
    //constructor to set up the item with its title
    public Item ( String title)
    {
        this.title = new String(title);
    }
    
    //returns the title of the item as a String
    public String toString()
    {
        return title;
    }
    
}
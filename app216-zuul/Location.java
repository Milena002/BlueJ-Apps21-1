import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Class Location - a location on the map of an adventure game.
 *
 * This class is part of the CANDY WORLD application. 
 * CANDY WORLD is a very simple, text based adventure game.  
 *
 * A "Location" represents one place in the scenery of the game.  It is 
 * connected to other locations via exits.  For each existing exit, the 
 * location stores a reference to the neighboring locations.
 * 
 * @author  Michael Kölling and David J. Barnes
 * Milena Michalska
 * @version 2016.02.29
 */

public class Location 
{
    private String description;
    private HashMap<String, Location> exits; // stores exits of this room.
    private Item item;
    private HashMap<String,Item> items;
    /**
     * 
     * description about locations
     */
    public Location(String description) 
    {
        this.description = description;
        
        exits = new HashMap<>();
        items= new HashMap<>();
    }
     
    /**
     * Define an exit from this room.
     * @param direction The direction of the exit.
     * @param neighbor  The room to which the exit leads.
     */
    public void setExit(String direction, Location neighbor) 
    {
        exits.put(direction, neighbor);
    }
    
    public void setItem(Item item)
    {
        this.item=item;
    }

    /**
     * @return The short description of the room
     * (the one that was defined in the constructor).
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * Return a description of the room in the form:
     *     You are in the kitchen.
     *     Exits: north west
     * @return A long description of this room
     */
    public String getLongDescription()
    {
        String returnString = " You are " + description + "\n" + getExitString() ;
        if(item!= null){
            returnString = returnString.concat("\n Items include: " + item.getName());
        }
       
        return returnString;
        
    }

    /**
     * Return a string describing the locations's exits, 
     * for example "Exits: north west".
     */
    private String getExitString()
    {
        String returnString = " Exits:";
        Set<String> keys = exits.keySet();
        
        for(String exit : keys) 
        {
            returnString += " " + exit;
        }
        return returnString;
    }
      
    public Item remove(String itemName)
    {
        Item oldItem = item;
        if(this.item.getName().equals(itemName))
        {
            item=null;
            return oldItem;
        
        }
        else
        return null;
    }
    
     private String getItemString(){
           if (item != null){
           String returnString="Items : ";
           returnString += item.getName() + " ";
           return returnString;
       }
       return null ;
    }
       
    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     * @param direction The exit's direction.
     * @return The room in the given direction.
     */
    public Location getExit(String direction) 
    {
        return exits.get(direction);
    }
}


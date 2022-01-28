
/**
 *This  is a class Item with for items useful for SWEETS WORLD game
 *
 * Milena Michalska
 * version 1.0
 */
public class Item
{
    String name;
    String description;
    int id;
    
    public Item(String name,String description, int id)
    {
    this.name=name;
    this.description=description;
    this.id=id; 
    }
    
    public String getName()
    {
        return name;
    }
    
    public void getShortDescription()
    {
        System.out.println(name);
        
    }
    
    public void getLongDescription()
    {
        System.out.println(name + " " + description);
        
    }
    
}

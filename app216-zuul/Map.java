
/**
 * This class is reponsible for creating and
 * linking all the Locations in the game to
 * form a 2D or 3D network
 *
 *  [Cotton Candy Meadow]---->[Chocolate Forrest]     [Cola Brook]----->[Gingerbread House]
 *                                      |                   ^                   |
 *                                      v                   |                   v
 *                               [Lollies Cave]---->[Cookies Mine]       [Jellies Cage]----> [Besom Fire]
 *             
 * @author Milena Michalska
 * @version 1.0 12/2021
 */
public class Map
{
    // Need to add a list of exits
    
    private Location meadow, forrest, cave, brook, mine, house, cage, fire;

    private Location currentLocation;

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        createLocations();
    }

    /**
     * Create all the Locations and link their exits together.
     * Set the current location to the outside.
     * Both locations need to have been created before
     * their exists are linked.
     */
    private void createLocations()
    {
        createMeadow();
        createForrest();
        createCave();
        createBrook();
        createMine();
        createHouse();
        createCage();
        createFire();

        currentLocation = meadow;  // start game in cotton candy meadow
    }
    
    /**
     * Create the meadow and link it to the
     * chocolate forrset - next location
     */
    private void createMeadow()
    {
        meadow = new Location("Cotton Candy Meadow - At the edge to the Chocolate Forrest");
        meadow.setItem(new Item("CottonCandy","This CottonCandy allows you to come safety across the edge",101));
    }
    
    /**
     * Create the pub and link it to the outside
     */
    private void createForrest()
    {
        forrest= new Location("Chocolate Forrest");
        
        forrest.setExit("west", meadow);
        meadow.setExit("east", forrest);
    }
    
    /**
     * Create the pub and link it to the outside
     */
    private void createCave()
    {
        cave= new Location("Lollies Cave");
        
        cave.setExit("north", forrest);
        cave.setExit("east",mine);
        forrest.setExit("south", cave);
        
        cave.setItem(new Item("Lolly","This Lolly giving you a unlimited eating lollies whole life in game",102));
    }
    
    /**
     * Create the theatre linked to the outside
     */
    private void createMine()
    {
        mine = new Location("Cookies Mine");
        
        brook.setExit("south",mine);
        mine.setExit("north",brook);
        mine.setExit("west", cave);
        cave.setExit("east",mine);
    }
    
    /**
     * Create the office linked to the lab
     */
    private void createBrook()
    {
        brook= new Location("Cola Brook");
        
        brook.setExit("east",house);
        brook.setExit("south",mine);
        
        
        
    }
    
    /**
     * Create the Gingerbread house and link it to other locations
     */
    private void createHouse()
    {
        // create the Locations
        house= new Location("Gingerbread House");
        
        brook.setExit("east", house);
        house.setExit("south", cage);
        house.setExit("west", brook);
        
        
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createCage()
    {
        // create the Locations
        cage= new Location("Jellies Cage");
        
        house.setExit("south", cage);
        cage.setExit("east", fire);
        
        cage.setExit("north", house);
        
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createFire()
    {
        // create the Locations
        fire= new Location("Besom Fire!");
        
        
        fire.setExit("west", cage);
        cage.setExit("east", fire);
    }
    
    public Location getCurrentLocation()
    {
        return currentLocation;
    }
    
    public void enterLocation(Location nextLocation)
    {
        currentLocation = nextLocation;
    }
}

/**
 * Model some details of song.
 *
 * @author Milena Michalska
 * @version 1.0 03/12/21
 */
public class Song
{
     // The name of song.
    private String name;
    // The artist of song.
    private String artist;
    // The number of times the song was played.
    private int plays;
    //unique number of song
    private int id;
    /**
     * Constructor for objects of class Song.
     * The initial song plays is zero.
     * @param id The song's name.
     * @param name The song's artist.
     */
    public Song(int id, String name, String artist, int plays)
    {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.plays = plays;
        //plays = 0;
    }

     /**
     * @return The song's id number.
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * @return The song's name.
     */
    public String getName()
    {
        return name;
    }
    
      /**
     * @return The song's artist.
     */
    public String getArtist()
    {
        return artist;
    }

    /**
     * @return The song's plays.
     */
    public int getPlays()
    {
        return plays;
    }

    public void setPlays(int plays)
    {
        this.plays = plays;
    }
    
    public void increasePlays(int amount)
    {
        plays = plays + amount;
    }
    
    public void decreasePlays(int amount)
    {
        if(plays >= amount)
            plays = plays - amount;
    }
    
    /**
     * @return The id, name and quantity in stock.
     */
    public String toString()
    {
        return id + " Name of song: " + name + "  Artist:  " +  artist + " Number of plays:  " + plays;
    }

    public void print()
    {
        System.out.println(toString());
    }
}
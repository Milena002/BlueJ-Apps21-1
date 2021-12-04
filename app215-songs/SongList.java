import java.util.ArrayList;
/**
 * Manage the song list.
 * The song list is described by zero or more Songs.
 * 
 * @motified by  Milena Michalska
 * @version 03.12.2021
 */
public class SongList
{
    // A list of the products.
    public ArrayList<Song> songs;
    
    /**
     * Initialise the song manager.
     */
    public SongList()
    {
        songs = new ArrayList<Song>();
    }

    /**
     * Add a song to the song list.
     * @param item The song item to be added.
     */
    public void add(Song item )
    {
        songs.add(item);
    }
        
    /**
     * A method to remove the song from song list
     */
    public void remove(int songID)
    {
        Song song = findSong(songID);
        if(song != null)
        {
            songs.remove(song);
            System.out.println("Removed song: " + songID);
        }
        else
        {
            System.out.println ("This song not exist on this list! ");
        }
    }

      /**
     * Find a product to match the product id,
     * if not found return null
     */
    public Song findSong(int songID)
    {   
        for(Song song : songs)
        {
            if(song.getID() == songID)
            {
                return song;
            }
        }
        return null;
    }
    
    public void search(String phrase)
    {
        for (Song song : songs)
        {
            if(song.getName().contains(phrase) || song.getArtist().contains(phrase))
            {
                System.out.println(song.toString());
            }
        }
    }
    
      /** Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printSong(int songID)
    {
        Song song = findSong(songID);
         
        if(song != null) 
        {
            System.out.println(song.toString());
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void print()
    {
        printHeading();
        
        for(Song song: songs)
        {
            System.out.println(song);
        }

        System.out.println();
    }
     //"Song tittle: " + song.getName() + "Artist: " + song.getArtist());
    
    public void printHeading()
    {
        System.out.println();
        System.out.println(" Milena's MusicApp ♫ ");
        System.out.println(" ====================");
        System.out.println();
    }
}

/**
 * This app provides a user interface to the
 * song list so that users can add, edit,
 * print and remove songs
 *
 * @author Milena Michalska
 * @version 0.1 - 03/12/21
 */
public class SongApp
{
    private InputReader reader;
    
    private SongList songs;
    
    /**
     * Constructor for objects of class SongApp
     */
    public SongApp()
    {
        reader = new InputReader();
        
        songs = new SongList();
        SongDemo demo = new SongDemo(songs);
    }

    /**
     *  Display a list of menu choices and execute
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getString("Please enter your choice > ");
            
            finished = executeChoice(choice.toLowerCase());
        }
    }
    
    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit"))
        {
            return true;
        }
        else if(choice.equals("print"))
        {
            songs.print();
        }
        else if(choice.equals("add"))
        {
           addSong();
        }
        else if(choice.equals("remove"))
        {
          removeSong();
        }
         else if(choice.equals("search"))
        {
          searchSongs();
        }
        return false;
    }
    
    private void addSong()
    {
        System.out.println(" Adding a new Song ♪ ");
        System.out.println();
        
        int id = reader.getInt("Please enter a song id/number : >");
        String name = reader.getString("Please enter a song tittle: > ");
        String artist = reader.getString("Please enter a song author: >");
        int plays =  reader.getInt("Please enter how many plays this song has: >");
        
        Song song = new Song(id,name,artist,plays);
        songs.add(song);
        System.out.println("Song --" + song.getID()+ "-- Tittle: "+ song.getName() + " -- " + "Artist: "+
        song.getArtist() +" -- " + "Plays: "+ song.getPlays() + "has been added to the list ");
        songs.print();
    } 
    
    private void removeSong()
    {
        System.out.println("Removing an old Song");
        System.out.println();
        songs.print();
        
        int id = reader.getInt ("Please enter a song ID which you want to remove:  > ");
        Song song = songs.findSong(id);
        
        if(song != null)
        {
            songs.remove(id);
         System.out.println("Song has been removed from the list "); 
        }
        else
        {
            System.out.println ("This song not exist on the list !"); 
        }
        songs.print();
    }
        
     private void searchSongs()
    {
        System.out.println("Searching a Song(s) by name or artist: ");
        System.out.println();
        System.out.println ("Here is song(s) contains this phrase");
        
        String phrase = reader.getString("Please enter a tittle or artist of the song are you looking for > ");
        
        songs.search(phrase);
    
    }
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new song");
        System.out.println("    Remove:     Remove an old song");
        System.out.println("    Print:      Print all songs");
        System.out.println("    Quit:       Quit the program");
        System.out.println("    Search:     Search the songs(s) by tittle or artist ");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("    App21-05: ♫ MusicApp ♫    ");
        System.out.println("           by Milena          ");
        System.out.println("********************************");
    }
}
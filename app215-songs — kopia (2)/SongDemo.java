/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes
 * @ motyfied by Milena Michalska
 * @version 1.0, date 03/12/2021
 */
public class SongDemo
{
    // The stock manager.
    private SongList songs;
   
    /**
     * Here is my list of songs .
     */
    public SongDemo(SongList songs)
    {
        this.songs = songs;
         //here is  my list of songs from testing stage:
        songs.add(new Song (100,"Beautiful               ","Anne-Marie                ",836015));
        songs.add(new Song (101,"Bad Habits              ","Ed Sheeran                ",127191452));
        songs.add(new Song (102,"Halo                    ","Beyonce                   ",991888598));
        songs.add(new Song (103,"Clash                   ","Dave,(feat.Stormzy)       ",7070513));
        songs.add(new Song (104,"It Gets Better          ","Swedish House Mafia       ",7563930));
        songs.add(new Song (105,"You for me              ","Rita Ora                  ",7277470));
        songs.add(new Song (106,"Don't delete the kisses ","Wolf Alice                ",40759558));
        songs.add(new Song (107,"Holier Than Thou        ","Biffy Clyro               ",333054));
        songs.add(new Song (108,"Plastic Hearts          ","Miley Cyrus               ",78086810));
        songs.add(new Song (109,"Prisoner                ","Miley Cyrus(feat.Dua Lipa)",354144868));
    }
    
    /**
     * Provide a demonstration of how the SongList meets all
     * the user requirements by making a delivery of each song
     * adding it and then remove each
     * songs. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        songs.print();       
    }
    
}

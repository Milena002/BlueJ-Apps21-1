
/**
 *This class models a BNU module with forms part 
 *of a course.
 *
 * @author Milena Michalska
 * @version 23/10/2021
 */
public class Module
{
    // Variables
    private String code;
    private String title;
    private int credit;
    /**
     * Constructor for objects of class Module
     */
    public Module(String code, String title)
    {  
            //initialise instance variables
        credit=15;
        this.code=code;
        this.title=title;
    }
    public String getCode()
    {
        return code;
    }
    
     public String getTitle()
    {
        return title;
    }

    public void setCredit(int credit)
    {
    this.credit=credit;
    }
/**
 * this method will printout the module code and
 * title
 */
    public void print()
    {
        System.out.println(" Module Code: " + code + ":"
                                + title + " Credit " + credit);
      System.out.println();
    }
    /**
     * Print out the details of the course to the terminal
     */
    private void printHeading()
    {
        System.out.println("-----------------------------");
        System.out.println("   App211: Module Details");
        System.out.println("-----------------------------");
        System.out.println();
        
    }
}

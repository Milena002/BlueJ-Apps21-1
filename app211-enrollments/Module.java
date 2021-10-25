
/**
 *This class Module represents the code, title and credit value
 *of a given module.
 *
 * @author Milena Michalska
 * @version 1.0 25/10/2021
 */
public class Module
{
    // Variables
    private String code;
    private String title;
    private int credit;
    /**
     *  Module Constructor assigns the code and title 
     *  for a module, it also initialistes the credit value 
     *  to 0
     */
    public Module(String code, String title)
    {  
        this.code=code;
        this.title=title;
        this.credit=0;
    }
    /** This method returns the code for the module
     * @return code represent the module code
     */
    public String getCode()
    {
        return code;
    }
    
     public String getTitle()
    {
        return title;
    }

    public int getCredit()
    {
    return credit;
    }
    public void setCredit (int credit)
    {
        this.credit=credit;
    }
/**
 * print the details of the module which indludes the code,
 * title and credits
 * 
 */
    public void print()
    {
    System.out.println(" Module Code: " + code + ":" + title );
    System.out.println("Credit: " + credit);
    System.out.println();
    }
    
}

import java.util.*;
/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Michael Kölling and David Barnes
 * Modified by Milena Michalska
 * @version 29/10/2021
 */
public class Student
{
    // the student ID
    private int id;
    // the student's full name
    private String name;
    // The course the student is enrolled on
    private Course course;
    // The marks awarded for the modules on the course
    private ArrayList<ModuleMark> marks;
    
    /**
     * This constructor creates a new student with a
     * fixed name and id. 
     */
    public Student()
    {
        this("Milena Michalska", 22143664);
    }
    
    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
        
        marks = new ArrayList<ModuleMark>();
        
        
    }

    public void addMark(ModuleMark mark)
    {
        marks.add(mark);
    }
    
    /**
     * Award a different pass mark for each of the
     * modules on the enrolled course
     */
    public void createMarks()
    {
        int value=70; 
        for(Module module : course.modules)
        {
            ModuleMark mark = new ModuleMark(module);
            mark.setMark(value);
            
            value=value - 10;
            
            marks.add(mark);
        }
    }
    
    /**
     * Find the module by the moduleCode and
     * set its mark to the value
     */
    public void awardMark(String moduleCode, int value)
    {

    }
    
    /**
     * Set the student's course
     */
    public void enrol(Course course)
    {
        this.course = course;
        createMarks();
        
    }
    
    /**
     * Award a different pass mark for each of the
     * modules on the enrolled course
     */
    public void awardTestMarks()
    {
        
        
    }
    
    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Return the student ID of this student.
     */
    public int getID()
    {
        return id;
    }

        
    /**
     * Print the student's name and ID number to the 
     * output terminal.
     */
    public void print()
    {
        System.out.println(" Student ID: " + id + ", " + name);
    }
    
    public void printCourse()
    {
        this.print();
        course.print();
    }
    
    public void printModules()
    {
        for(ModuleMark mark : marks)
        {
            mark.print();
            System.out.println("\t"+ course.convertToGrade(mark.getValue()));
            //System.out.println("\t   " +course.convertToGrade(mark.getValue()));
            //System.out.println(mark.getModule().getCode());
            //System.out.print(" :");
            //System.out.println(mark.getModule().getTitle());
            //System.out.print("\t");
            //System.out.println(mark.getCredit());
            
        }
        

    }
    
    public void printTranscript()
    {
        System.out.println(" ------------------------------------");
        System.out.println(" App21-02: Exam Board Transcript 2021");
        System.out.println("        by Milena Michalska");
        System.out.println(" ------------------------------------");
        
        printCourse();
        
        System.out.println();
        System.out.println();
        System.out.println(" ---- \t ------------------\t ------\t ---- \t -----");
        System.out.println(" Code \t       Module      \t Credit\t Mark \t Grade");
        System.out.println(" ---- \t ------------------\t ------\t ---- \t -----");
        
        printModules();
       
        Grades finalGrade = course.calculateGrade(marks);
        
        System.out.println();
        System.out.println();
        
        if(finalGrade == Grades.NS)
        {
            System.out.println(" No Final Course Grade Yet!");
        }
        else
        {
            System.out.println(" Final Course Grade = " + finalGrade);
        }
    }
}
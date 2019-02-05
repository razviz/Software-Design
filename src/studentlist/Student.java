package studentlist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaim
 */
public class Student {
    private String name;
    private int ID;
    private String DoB;
    
    private int maxHrs;
    
    // Default constructor for Student class
    public Student()
    {
        this.name = "Name Not Set";
        this.ID = 0;
    }
    public Student(String givenName, int givenID)
    {
          this.name = givenName;
          this.ID = givenID;
    }
    
    // This method sets the value of the name property
    public void setName(String givenName)
    {
       this.name = givenName;
    }
    
    public String getName()
    {
           return this.name;
    }
    
    public void setID (int givenID)
    {
        this.ID = givenID;
    }
    
    public int getID ()
    {   
        return ID;
    }

    /**
     * @return the DoB
     */
    public String getDoB() {
        return DoB;
    }

    /**
     * @param DoB the DoB to set
     */
    public void setDoB(String DoB) {
        this.DoB = DoB;
    }
}

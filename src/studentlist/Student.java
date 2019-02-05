package studentlist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaim
 * Date: Feb 5th, 2019
 */
public class Student {
    private String name;
    private int id;
    private String DoB;
    
    private int maxHrs;
    
    // Default constructor for Student class
    public Student()
    {
        this.name = "Name Not Set";
        this.id = 0;
    }
    //main constructor that takes a name and an id
    public Student(String givenName, int givenid)
    {
          this.name = givenName;
          this.id = givenid;
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
    
    public void setID (int givenid)
    {
        this.id= givenid;
    }
    
    public int getID ()
    {   
        return id;
    }

    /**
     * @return the DoB
     */
    public String getDoB() {
        return DoB;
    }
    
    public String toString()
    {
        return "Student";
    }
    // this was the DoB setter
}

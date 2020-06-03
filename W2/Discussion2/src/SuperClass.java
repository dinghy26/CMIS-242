 /*
* File: SuperClass.java
 * Author: Brian Miranda Perez
 * Date: May 27, 2020
 * This class describes the use of super keyword
 * and the inheritance of variables and methods.
 * */

public class SuperClass {
    
    private String fName;
    private String lName;
    private int userID;

    //SuperClass constructor
    public SuperClass(String fName, String lName, int userID) {
        this.fName = fName;
        this.lName = lName;
        this.userID =userID;
    }

    // Super fields getters
    public String getfName() {
        return fName;
    }


    public String getlName() {
        return lName;
    }

    public int getUserID() {
        return userID;
    }

    // Super toString
    public String toString() {
        return "\n\nThe super class instance variable values are: \n" + "fName = " + fName + "\nlName = " + lName + "\nuserID = " + userID;
    }

}
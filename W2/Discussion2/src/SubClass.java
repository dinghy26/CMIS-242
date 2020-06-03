 /*
* File: SubClass.java
 * Author: Brian Miranda Perez
 * Date: May 27, 2020
 * This class describes the use of super keyword
 * and the inheritance of variables and methods.
 * */

public class SubClass extends SuperClass {

    private String stationName;
    private String location;
    private int zipcode;

    public SubClass(String fName, String lName, int userID, String stationName, String location, int zipcode) {
        //super to gain the values from the constructor of superClass;
        super(fName, lName, userID);

        // subclass instance valuea
        this.stationName = stationName;
        this.location = location;
        this.zipcode = zipcode;
    }

    // cunjuction of SuperClass and subclass
    public String toString() {
        String msg1 = "The conjunction of values from Superclass and SubClass is: \n"; // Header
        String msg2 = "fName = " + getfName() + "\nlName = " + getlName() + "\nuserID = " + getUserID(); //super class values
        String msg3 = "\nstationName = " + stationName + "\nlocation = " + location + "\nzipcode = " + zipcode; // sub class values

        // Store sperClass to string method
        String super_toString = super.toString();

        return msg1 + msg2 + msg3 + super_toString;

    }

    public static void main(String[] args) {
        SubClass WorkerInfo = new SubClass("Brian", "Miranda", 234234, "Mayport Station", "Jacksonville FL", 32218);
        System.out.println(WorkerInfo.toString());
    }
}
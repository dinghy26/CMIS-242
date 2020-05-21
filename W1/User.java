
 /*
* File: User.java
 * Author: Brian Miranda Perez
 * Date: May 20, 2020
 * this class describe the differences from Static
 * and instance variables and methods.
 * */

public class User {

    private String fName;
    private String lName;
    private int uCount;
    // Static field persistant value
    private static int userCount;

    // Getters an setters
    public void setFName(String firstName) {
        this.fName = firstName;
    }

    public String getFName() {
        return fName;
    }
    
    public void setLName(String lastName) {
        this.lName = lastName;
    }

    public String getLName() {
        return lName;
    }

    public void setUCount(int ucount) {
        this.uCount = ucount;
    }

    public int getUcount() {
        return uCount;
    }

    // the value of userCount stays persistant because is a static value 
    User() {
        userCount++;
        uCount++;
    }

    // return the users full name and the users count
    public String userFullName() {
        return "User " + userCount +" = " + getFName() + " " + getLName();
    }

    public static void main(String[] args) {
        // First instance of User
        User user1 = new User();
        user1.fName = "Joe";
        user1.lName = "Exotic";
        System.out.println(user1.userFullName());
        // instance count
        System.out.println("User count = " + user1.uCount);

        // Second instance of User
        User user2 = new User();
        user2.fName = "Carole";
        user2.lName = "Baskin";
        System.out.println(user2.userFullName());
        // instance count
        System.out.println("User count = " + user2.uCount);

        /**
        For this assignment, I use a program called User as an example to explain the difference between 
          a static variable or method and an instance variable or method. In this program, I use a 
          static variable call userCount to record how many instances of users I have in the program. 
          Because a static variable  maintains the value giving I'm able to record every instance I create.
          This result can't be achieved using an instance variable because every time I initialize a new user 
          it will create a separate copy of the value.
         */

    }
}


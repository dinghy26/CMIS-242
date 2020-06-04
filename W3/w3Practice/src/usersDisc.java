 /*
* File: usersDisc.java
 * Author: Brian Miranda Perez
 * Date: June 03, 2020
 * this class describe Exeption Propagation
 * */
public class usersDisc {


    
    public void username (){
        String[] names = {"Brian", "Joe", "Carlos"};
        String[] names2 = {"Niko", "Alton", "Jen", "Maria", "Padilla", "Jose"};
        System.out.println("The user in position #5 is: "+ names[5]);
        /** this bottom line is for testing */
        //System.out.println("The user in position #5 is: "+ names2[5]);
    }

    public void middleMan() {
        username();
    }
    
    public void check() {
        try {
            middleMan(); //call the middle man that calls username
            /**
             * middleMan calls username and username have a out of bounds error
             * because username have no way to handel this it comes down the stack to middleMan 
             * but MiddleMan it dose not have a way to handle it and it movesdown to check that have 
             * a checked exception that dysplays the problem in the program.
             */
           
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + "\n Please enter an array of 6 or more. \n Exepotion handled");
        }
    }
}
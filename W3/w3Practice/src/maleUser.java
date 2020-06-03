import java.util.*;

public class maleUser extends TheUser {
    
    @Override
    public int getAge() {
        return super.getAge();
    }
    
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    void chek(int age) {
        
        try {
            System.out.println("Your age is: " + age);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage() + "\nPlease Enter a number!");
            
        }
    }
 
}
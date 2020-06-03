import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class TheUser implements IUser {
    
    public String getName() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Ente your First name: ");
        String name = myScanner.nextLine();
        return name;
    }

 

    public int getAge() {
        Scanner myAge = new Scanner(System.in);
        System.out.print("Enter your age: ");
        while(true) {
            try {
                return myAge.nextInt();
            
            } catch (InputMismatchException e) {
                myAge.nextLine();
               System.out.println( e.getMessage() + "\nEnter a real number");
            }
        }
        
    }

    abstract void chek (int age);
}
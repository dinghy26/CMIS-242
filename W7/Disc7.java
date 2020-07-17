import java.util.*;

public class Disc7 {
    

    // Non Generic arrayList
    ArrayList rTExceptionArray = new ArrayList();

    // Generic ArrayList
    ArrayList <String> cPExceptionArray = new ArrayList<>();



    // method's that add to the list
    public void addtolistrT(String item) {
        rTExceptionArray.add(item);
    }

    public void addtolistrT(int item) {
        rTExceptionArray.add(item);
    }
    
    // method to get the values
    public void getlistrT() {

        for(Object e : rTExceptionArray) {
            System.out.println(e);
        }
    }

    // method's that add to the list
    public void addtolistcP(String item) {
        cPExceptionArray.add(item);
    }

    //public void addtolistcP(int item) {
    //    cPExceptionArray.add(item);
    //}
    
    // method to get the values
    public void getlistcP() {

        for(Object e : cPExceptionArray) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Disc7 runTimeErrors = new Disc7();

        // this portion of code will compile 
        runTimeErrors.addtolistrT("Hello World");
        runTimeErrors.addtolistrT("Testing");
        runTimeErrors.getlistrT();
        runTimeErrors.addtolistrT(10); // this add will not display

        // this section will not compile
        //runTimeErrors.addtolistcP("Hello");
        //runTimeErrors.addtolistcP(10);

    
    }
}
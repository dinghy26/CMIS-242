/* 
 * File: Student.java
 * Author: Brian Miranda Perez
 * Date: June 17, 2020
 * This class contains the implementation of the interface
 * W5DiscInter.java to add, remove or print the Classes 
 * from the ArrayList Classes.
 * */

import java.util.ArrayList;
import java.util.List;

public class Classes implements W5DiscInter {

    private List<String> classes = new ArrayList<>();

    @Override
    public void addToArray(String item) {
        classes.add(item);
    }

    @Override
    public void removeFromArray(String item) {

        if (classes.contains(item)) {
            classes.remove(item);
        } else {
            System.out.println("\n" + item + " is not in the list!\n");
        }
    }

    @Override
    public void printArray() {
        System.out.println("\nClass: ");
        for (int i = 0; i < classes.size(); i++) {
            System.out.println((i + 1) + ". " + classes.get(i));
        }
    }

}
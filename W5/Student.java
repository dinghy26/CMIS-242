/* 
 * File: Student.java
 * Author: Brian Miranda Perez
 * Date: June 17, 2020
 * This class contains the implementation of the interface
 * W5DiscInter.java to add, remove or print the students 
 * from the ArrayList student.
 * */

import java.util.ArrayList;
import java.util.List;

public class Student implements W5DiscInter {

    private List<String> student = new ArrayList<>();

    @Override
    public void addToArray(String item) {
        student.add(item);
    }

    @Override
    public void removeFromArray(String item) {

        if (student.contains(item)) {
            student.remove(item);
        } else {
            System.out.println("\n" + item + " is not in the list!\n");
        }
    }

    @Override
    public void printArray() {
        System.out.println("\nStudent list: ");
        for (int i = 0; i < student.size(); i++) {
            System.out.println((i + 1) + ". " + student.get(i));
        }
    }

}
/* 
 * File: Student.java
 * Author: Brian Miranda Perez
 * Date: June 17, 2020
 * This class contains the test for 
 * the implementation of the interface
 * W5DiscInter.java.
 * */

import java.util.Scanner;

public class testStudentClasses {

    public static void main(String[] args) {

        // while loops check
        boolean check = true;
        boolean check2 = true;

        // class instance
        W5DiscInter studentList;
        W5DiscInter classList;

        studentList = new Student();
        Scanner mainScanner = new Scanner(System.in);

        // for loop to enter the number of students
        System.out.print("\nHow many students do you want to enter? ");
        int entry = mainScanner.nextInt(); // set the number of iterations
        mainScanner.nextLine();
        for (int i = 0; i < entry; i++) {
            System.out.print("Enter Student #" + (i + 1) + ": ");
            String name = mainScanner.nextLine();
            studentList.addToArray(name);
        }

        // while loop for remove students
        while (check) {

            System.out.print("\nDo you want to remove a student? (Y/N) : ");
            String removeAsw = mainScanner.nextLine().toUpperCase();

            if (removeAsw.equals("Y")) {
                String eraseName;
                System.out.print("Enter Name:");
                eraseName = mainScanner.nextLine();
                studentList.removeFromArray(eraseName);
                studentList.printArray();
            } else if (removeAsw.equals("N")) {
                check = false;
            }

        }

        classList = new Classes();
        // while loop to add classes
        while (check2) {

            System.out.print("\nDo you want to add a class? (Y/N) : ");
            String Class = mainScanner.nextLine().toUpperCase();

            if (Class.equals("Y")) {
                String addClass;
                System.out.print("Enter Class: ");
                addClass = mainScanner.nextLine();
                classList.addToArray(addClass);

            } else if (Class.equals("N")) {
                System.out.println("Final Result:");
                classList.printArray();
                studentList.printArray();

                check2 = false;
            }
        }
        mainScanner.close();
    }
}
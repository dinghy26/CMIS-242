/*
* File: Project1.java
 * Author: Brian Miranda Perez
 * Date: May 27, 2020
 * this class contains the main and static methods
 * for project 1.
 * */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import java.util.*;

public class Project1 {

    public static void main(String[] args) {

        // initial store for the values
        ArrayList<String> list1 = new ArrayList<>();
        // main array wit the weights
        Weight[] weightList = new Weight[25];
        // Source file stored from the fileChooser
        String sourceFile = null;

        // File Chooser
        JFileChooser jChoose = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jChoose.setDialogTitle("CMIS-242 Project 1");

        int returnV = jChoose.showOpenDialog(null);

        if (returnV == JFileChooser.APPROVE_OPTION) {
            File myFile = jChoose.getSelectedFile();
            System.out.println("\nYou choose: " + myFile.getAbsolutePath() + "\n");
            sourceFile = myFile.getAbsolutePath();
        } // end of file chooser

        // sourceFile = "valuesXXX.txt";

        // reader for the use file
        BufferedReader sourceReader = null;

        String values;

        try {
            sourceReader = new BufferedReader(new FileReader(sourceFile));

            // local list for the split values
            String[] returnList = null;

            while ((values = sourceReader.readLine()) != null) {

                returnList = values.split(" ");

                for (String a : returnList) {
                    list1.add(a); // items transfer to list 1
                }
            }

            // for loop to terminate program if we have more then 25 weights
            /**
             * This for loop check list1 after the split of the values i use spaces to split
             * the values if my list is 25 weights after split is 50 numbers this is the reason why
             * i use 50 as the value to check.
             */
            for (int i = 0; i < list1.size(); i++) {
                if (list1.size() > 50) {
                    System.out.println("Your list have more then 25 weights.");
                    System.exit(0);
                }
            }

            /**
             * For this for loop i use to exta fields to achive the right position of the
             * values in the weightList.
             */
            // int for parse the values to the list
            int z = 0;
            int t = 1;
            // for loop for add the values from list1 to weightlist
            for (int i = 0; i < weightList.length; i++) {
                weightList[i] = new Weight(Integer.parseInt(list1.get(z)), Double.parseDouble(list1.get(t)));
                z += 2;
                t += 2;

            }
            

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } // end of try and catch

        /**
         * This lines bellow display the methods after the file is choose. the average
         * in OZ wiil display before AVG because is call by toOunces method in
         * Weight.class. The total Weights is print inside findAverage.
         */
        System.out.println("The Results of the file you choose are: ");
        System.out.println("Min. Weight = " + findMinimum(weightList));
        System.out.println("Max. Weight = " + findMaximum(weightList));
        System.out.println("Average = " + findAverage(weightList));

    }

    /** Methods for Project 1 */

    /**
     * this method find the minimum weight in the list using the method lessThan
     * located in the weight class
     */
    private static Weight findMinimum(Weight[] WeightsMin) {
        Weight min = WeightsMin[0];
        for (int i = 0; i < WeightsMin.length; i++) {

            // set check true for better visual
            if (min.lessThan(WeightsMin[i]) == true) {
                min = WeightsMin[i];
            }

        }
        return min;
    }

    /** Find Maximum method */
    /**
     * this method find the maximum weight in the list using the method lessThan
     * located in the weight class
     */
    private static Weight findMaximum(Weight[] WeightsMax) {
        Weight check = new Weight(1, 1.0);
        for (int i = 0; i < WeightsMax.length; i++) {

            // set check true for better visual
            if (WeightsMax[i].lessThan(check) == true) {
                check = WeightsMax[i];
            }

        }
        return check;
    }

    /**
     * This method gets the average of all the weigths using addTo metod to sum all
     * the values and the divide the final sum using the divide method. this methods
     * are in weight.class. *** int i = 1; for the math accuracy *** the final
     * values are normalize see the private normalize method for more info.
     */
    private static Weight findAverage(Weight[] WeightsAvg) {
        Weight max = WeightsAvg[0];
        //Weight max = new Weight(0, 0.0);
        for (int i = 1; i < WeightsAvg.length; i++) {
            //addTo Method
            max.addTo(WeightsAvg[i]);
            max = WeightsAvg[i];

        }
        System.out.println("\nTotal Weights = " + max + "\n Divided by = " + WeightsAvg.length); //print total Weight and divisor Num.
        // divide Method
        max.divide(max, WeightsAvg.length);

        return max;
    }
}

/** End of Program */

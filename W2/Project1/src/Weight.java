/*
* File: Weight.java
 * Author: Brian Miranda Perez
 * Date: May 27, 2020
 * this class contains the public an provate methods
 * use to create the weight array an perfome the calculations
 * in Projec1.java.
 * */
public class Weight {

    private static final int OUNCES_IN_A_POUND = 16; // constant
    private int pounds;
    private double ounces;

    // constructor to initialize the values
    public Weight(int pounds, double ounces) {
        this.pounds = pounds;
        this.ounces = ounces;

    }

    // Lessthen Method assepts a weight and return if weight is less then the giving weight
    public boolean lessThan(Weight enterWeight) {
        //normalize(test);
        return (enterWeight.pounds < pounds); 
    }

    // add the weights an normalized
    public void addTo (Weight enterWeight) {

        enterWeight.pounds += pounds;
        enterWeight.ounces += ounces;
        normalize(enterWeight);

    }

    // divide the weight by the giving number
    public void divide(Weight enterWeight , int divisor) {

        enterWeight.pounds /= divisor;
        enterWeight.ounces /= divisor;
        normalize(enterWeight);
        System.out.println("\nThe Average in OZ. = " + toOunces(enterWeight)); // print the average in ounces
    }

    // conver the weights to ounces it return the value as a string
    private String toOunces(Weight converToOunces) {
      double returnValue = converToOunces.pounds * OUNCES_IN_A_POUND + converToOunces.ounces;
        return String.format("%.1f", returnValue); 
    }

    // normalized the weight to prevent the ounces going over 16
    private void normalize(Weight testWeight) {
        // while statement to normalize the values
        while (testWeight.ounces >= OUNCES_IN_A_POUND) {
            testWeight.pounds ++;// increse the pounds until the ounces are less then 16
            testWeight.ounces -= OUNCES_IN_A_POUND; //substract 16 till the value become less then 16
            
        }
    }

    // toString disply the values using String.format
    public String toString() {
        String mesg = String.format("%d lbs %.3f oz.", pounds, ounces);
        return mesg;
    }
}
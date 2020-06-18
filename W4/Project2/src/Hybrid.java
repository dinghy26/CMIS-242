/*
* File: Hybrid.java
 * Author: Brian Miranda Perez
 * Date: June 10, 2020
 * this class contains the Hybrid vehicle methods
 * for project 2 this class Extends from the super class
 * Automobile.
 * */
public class Hybrid extends Automobile {


    //extra field for display MPG
    private int milesPerGallon;

    //costructor that add MPG to the super class 
    public Hybrid(String make, int purchasePrice, int milesPerGallon) {
        super(make, purchasePrice);
        this.milesPerGallon = milesPerGallon;
    }

    /**
     * override the super class method salestax if 
     * the MPG of the car is less then 40 the sales tax
     * have a discount of 100 for any mile pass 40 add 2$
     * to the discount of 100 (if MPG is 41 discount = 102).
     */
    @Override
    public Double salesTax() {
        int disc = 100;
        int exess = 0;
        int finalDiscount = 0;
        if (milesPerGallon <= 40) {
            return super.salesTax() - disc;
        } else {
            for (int i = 40; i < milesPerGallon; i++) {
                exess++;
            }
            finalDiscount = (exess * 2) + disc;
            return super.salesTax() - finalDiscount;
        }
    }

    // overide the super class toString to add MPG
    @Override
    public String toString() {

        return super.toString() + "\nHybrid Vehicle" + "\nMPG: " + milesPerGallon;
    }
}
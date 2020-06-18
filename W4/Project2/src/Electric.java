/*
* File: Electric.java
 * Author: Brian Miranda Perez
 * Date: June 10, 2020
 * this class contains the Electric vehicle methods
 * for project 2 this class Extends from the super class
 * Automobile.
 * */
public class Electric extends Automobile {

    //extra field for display Weight
    private int weight;

    //constructor that add weight to the super class
    public Electric(String make, int purchasePrice, int weight) {
        super(make, purchasePrice);
        this.weight = weight;
    }

    /**
     * override the super class method salestax
     * for electric cars if the weight is less then 
     * 3000 the discount is $200 of the salestax else 
     * is $150.
     */
    @Override
    public Double salesTax() {
        if (weight < 3000) {
            return super.salesTax() - 200;
        } else {
            return super.salesTax() - 150;
        }
    }

    // overide the super class toString to add weight to the string
    @Override
    public String toString() {

        return super.toString() + "\nElectric Vehicle" + "\nWeight: " + weight;
    }

    
}
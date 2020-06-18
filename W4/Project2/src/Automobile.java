/** File: Automobile.java
 * Author: Brian Miranda Perez
 * Date: June 10, 2020
 * this class contains the superclass methods
 * for project 2.
 * */
public class Automobile {

    private static final Double TAX = 0.05; 
    private String make;
    private int purchasePrice;

    // super class constructor
    public Automobile(String make, int purchasePrice) {
        this.make = make;
        this.purchasePrice = purchasePrice;
    }

    // cal sales tax
    public Double salesTax() {
        Double SalesTax = purchasePrice * TAX;
        return SalesTax;
    }

    // super class toString method 
    public String toString() {
        String makeAndPrice = String.format("Make and Model: %s \nSales Price: %d \nSales Tax: %.2f", make, purchasePrice, salesTax());
        return makeAndPrice;
    }
}
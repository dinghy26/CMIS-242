/**
 * File: Property.java
 * Author: Brian Miranda Perez
 * Date: July 02, 2020
 * this class contains the Property class methods
 * to initialize the property object, change status 
 * of the property and display the property data.
 * this class extends the StateChangeable interface.
 * */

public class Property implements StateChangeable <Status>  {

    // instance variables for property class
    private String propertyAddress;
    private int numOfBedrooms;
    private int propSquareFootage;
    private int price;
    private Status propStatus;

    // Property main constructor.
    public Property(String propertyAddress, int numOfBedrooms, int propSquareFootage, int price) {

        this.propertyAddress = propertyAddress;
        this.numOfBedrooms = numOfBedrooms;
        this.propSquareFootage = propSquareFootage;
        this.price = price;

        // Set the initial state of the property as for sale.
        propStatus = Status.FOR_SALE;
    }

    /**
     * @return Method that change the status of the Property.
     */
    public void changeState(Status state) {
        this.propStatus = state;
    }

    // A toString method to display the property data.
    public String toString() {
        String Msg = "Address: " + propertyAddress + "\nNumber Of Bedrooms: " + numOfBedrooms +
        "\nSquare Footage: " + propSquareFootage + "\nPrice: " + price + "\nCurrent Status: " + propStatus;

        return Msg;
    }

    
    

}
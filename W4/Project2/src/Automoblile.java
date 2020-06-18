
public class Automoblile {

    private static final Double TAX = 0.05; 
    private String make;
    private int purchasePrice;

    public Automoblile(String make, int purchasePrice) {
        this.make = make;
        this.purchasePrice = purchasePrice;
    }

    public Double salesTax() {
        Double SalesTax = purchasePrice * TAX;
        return SalesTax;
    }

    public String toString() {
        String makeAndPrice = String.format("Make and Model = %s \nSales Price = %d \nSales Tax = %.2f", make, purchasePrice, salesTax());
        return makeAndPrice;
    }
}
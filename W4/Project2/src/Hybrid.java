
public class Hybrid extends Automoblile {


    private int milesPerGallon;

    public Hybrid(String make, int purchasePrice, int milesPerGallon) {
        super(make, purchasePrice);
        this.milesPerGallon = milesPerGallon;
    }

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

    @Override
    public String toString() {

        return super.toString() + "\nHybrid Vehicle" + "\nMPG = " + milesPerGallon;
    }
}
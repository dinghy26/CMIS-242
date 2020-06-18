
public class Electric extends Automoblile {

    private int weight;

    public Electric(String make, int purchasePrice, int weight) {
        super(make, purchasePrice);
        this.weight = weight;
    }

    @Override
    public Double salesTax() {
        if (weight < 3000) {
            return super.salesTax() - 200;
        } else {
            return super.salesTax() - 150;
        }
    }

    @Override
    public String toString() {

        return super.toString() + "\nElectric Vehicle" + "\nWeight = " + weight;
    }

    
}
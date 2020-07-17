import java.util.ArrayList;

/**
 * Dealer
 */
public class Dealer <T extends Cars> {

    private String DealershipName;

    private ArrayList <T> carsA = new ArrayList<>();

    public Dealer(String DealerName) {
        this.DealershipName = DealerName;
    }

        /**
     * @return String return the DealershipName
     */
    public String getDealershipName() {
        return DealershipName;
    }

    /**
     * 
     * @return the  size of the arraylist
     */
    public int inventoryNum() {
        return this.carsA.size();
    }

    


    public boolean addCar (T car) {

        if(carsA.contains(car)) {
            System.out.println(car.getBrand() + " is in the " + this.DealershipName + " invetory.");
            return false;
        } else {
            carsA.add(car);
            System.out.println(car.getBrand() + " added to " + this.DealershipName + " inventory.");
            return true;
        }
    }



}
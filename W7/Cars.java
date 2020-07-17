
/**
 * Cars
 */
public abstract class Cars {

    private String brand;
    private int doors;
    private int year;

    public Cars(String brand, int year, int doors) {
        this.brand = brand;
        this.doors = doors;
        this.year = year;
    }
    

    /**
     * @return String return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return int return the doors
     */
    public int getDoors() {
        return doors;
    }

    /**
     * @param doors the doors to set
     */
    public void setDoors(int doors) {
        this.doors = doors;
    }

    /**
     * @return Year return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

}
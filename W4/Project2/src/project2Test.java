public class project2Test {
    
    public static void main(String[] args) {
        
        Electric thecar = new Electric("Jeep Wrangler", 20000, 2000);

        Hybrid theOtherCar = new Hybrid("Dodge Ram", 40000, 41);

        System.out.println(thecar.toString());
        System.out.println("-----------------------------");
        System.out.println(theOtherCar.toString());
    }
}
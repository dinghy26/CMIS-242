public class CarTest {

    public static void main(String[] args) {
        SportCar hondaCivic = new SportCar("Honda Civic", 2012, 2);
        SportCar Nissan360Z = new SportCar("Nissan", 2014, 2);
        SportCar VWGti = new SportCar("VW GTI", 2010, 4);
        SedaCar HondaAcord = new SedaCar("Honda Acord", 2016, 4);
        SedaCar BMW325 = new SedaCar("BMW 325", 2013, 4);

        /**
         * using the Generic type I'm able to spesifide the class of car i want in 
         * the dealership if i use a regular class i can add any car to any dealership 
         * now just sedan cars get added to nortSedanDealer and so on.
         */
        Dealer<SportCar> southSportDealer = new Dealer<>("Sport Dealer");
        Dealer<SedaCar> northSedanDealer = new Dealer<>("Sedan Dealer");

        // add Sedan cars
        northSedanDealer.addCar(HondaAcord);
        northSedanDealer.addCar(BMW325);

        // add Sport cars
        southSportDealer.addCar(VWGti);
        southSportDealer.addCar(hondaCivic);
        southSportDealer.addCar(Nissan360Z);
        

        //debug...
        // the line bellow shows the comment discused above 
        //northSedanDealer.addCar(hondaCivic);

        System.out.println("Inventory for South Sport Dealership: " + southSportDealer.inventoryNum());
        System.out.println("Inventory for North Sedan Dealership: " + northSedanDealer.inventoryNum());
        



    }
    
}
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Animal animal = new Animal("Animal", 1, 1, 5, 20);
        Dog dog = new Dog("Yorkie", 8, 4, 2, 4, 1, 22, "Long Silky");

        dog.eat();
    }
}
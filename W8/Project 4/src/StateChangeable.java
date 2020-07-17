/**
 * File: StateChangeable.java
 * Author: Brian Miranda Perez
 * Date: July 02, 2020
 * This class is a Generic interface with a
 * bounded type parameter of enum type use for 
 * the Property class.
 * */
public interface StateChangeable<T extends Enum<T>> {
    
    // changeState abstract method with a generic Parameter.
    public abstract void changeState(T state);

}
/** File: Shape.java
 * Author: Brian Miranda Perez
 * Date: June 20, 2020
 * this class contains the superclass methods
 * for project 3.
 * */

import java.awt.*;

public abstract class Shape extends Rectangle {


    // super class fields
    private Color shapeColor;
    private boolean shapeFill;
    private static int shapeNo;


    // superclass constructor this class extend Rectangle.
    // The values of myRec has to be pass to the Rectangle class.
    public Shape(Rectangle myRec, Color shapeColor, boolean shapeFill) {
        super(myRec);// Prof. recommendation
        this.shapeColor = shapeColor;
        this.shapeFill = shapeFill;
        shapeNo++;

    }

    // method to set the current shape color
    public void setColor(Graphics e) {
        e.setColor(shapeColor);
    }

    // method use to verified if the current shape is solid or hollow
    public boolean GetSolid() {
        return shapeFill;
    }

    // Static method that keeps track of the amount of shapes build
    public static int getNOOfShapes() {
        return shapeNo;
    }

    // abstract method draw
    abstract void draw(Graphics e);


}



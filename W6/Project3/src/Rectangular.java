/**
 * File: Rectangular.java
 * Author: Brian Miranda Perez
 * Date: June 20, 2020
 * this class contains the Rectangular shape methods
 * for project 3 this class Extends from the super class
 * Shape.
 * */

import java.awt.*;

public class Rectangular extends Shape {


    // Rectangular constructor inherited Shape super class values
    public Rectangular(Rectangle myRec, Color shapeColor, boolean shapeFill) {
        super(myRec, shapeColor, shapeFill);

    }

    // draw the current shape and check if is solid or hollow
    @Override
    void draw(Graphics e) {
        setColor(e);
        if(GetSolid()) {
            e.fillRect(x,y,width,height);

        } else {
            e.drawRect(x,y,width,height);
        }

    }

}
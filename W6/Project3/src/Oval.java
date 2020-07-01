/**
 * File: Oval.java
 * Author: Brian Miranda Perez
 * Date: June 20, 2020
 * this class contains the Oval shape methods
 * for project 3 this class Extends from the super class
 * Shape.
 * */
import java.awt.*;

public class Oval extends Shape {

    // Oval constructor inherited Shape super class values
    public Oval(Rectangle myRec, Color shapeColor, boolean shapeFill) {
        super(myRec, shapeColor, shapeFill);

    }

    // draw the current shape and check if is solid or hollow
    @Override
    public void draw(Graphics e) {
        setColor(e);
        if(GetSolid()) {
            e.fillOval(x,y,width,height);

        } else {
            e.drawOval(x,y,width,height);
        }

    }

}

    
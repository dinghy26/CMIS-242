/**
 * File: Drawing.java
 * Author: Brian Miranda Perez
 * Date: June 20, 2020
 * this class contains the Drawing methods
 * for project 3 this class Extends from JPanel.
 * */

import javax.swing.JPanel;
import java.awt.*;

public class Drawing extends JPanel {

    // instance Shape
    private Shape currentShape;

    // method to display the current shape is the values are not null
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(String.valueOf(Shape.getNOOfShapes()), 5, 10);
        if (currentShape != null) {
            currentShape.draw(g);

        }

    }

    // method to set the desire dimensions
    @Override
    public Dimension getPreferredSize() {
        return (new Dimension(200,200));

    }

    /**
     * Method that takes the current shape as a parameter and check if the shape is inside
     * the desire dimensions. if true, sets the shape entered to the instance shape ins this class.
     **/
    public void drawShape(Shape enterShape) throws OutsideBounds {
        if (enterShape.getSize().width <= getPreferredSize().width && enterShape.getSize().height <= getPreferredSize().height){
            currentShape = enterShape;
            repaint();

        } else {
            throw new OutsideBounds("The Size of the shape has to be less then : " + String.valueOf(getPreferredSize()));

        }

    }

}
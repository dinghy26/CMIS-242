/**
 * File: Project3.java
 * Author: Brian Miranda Perez
 * Date: June 20, 2020
 * this class contains the main and GUI
 * for project 3.
 * */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.*;
import javax.swing.*;

public class Project3 implements ActionListener {

    // init all fields
    private static Shape newShape;
    private static Drawing mainDraw = new Drawing();

    private static Object[] shapes = {"Rectangle", "Oval"};
    private static String[] fillTypes = {"Hollow", "Solid"};
    private static String[] colors = {"Black", "Red", "Orange", "Yellow", "Green", "Blue", "Magenta"};
    private static JFrame appFrame = new JFrame();
    private static JPanel appPanelLeft = new JPanel();
    private static JPanel appPanelRight = new JPanel();
    private static JPanel appPanelCenter = new JPanel();
    private static JPanel appPanelLower = new JPanel();
    private static JPanel nestLayout = new JPanel();
    private static JButton drawButton = new JButton("Draw");
    private static JLabel appLableShapeType = new JLabel("Shape Type");
    private static JLabel appLableFillType = new JLabel("Fill Type");
    private static JLabel appLableColor = new JLabel("Color");
    private static JLabel appLableWidth = new JLabel("Width");
    private static JLabel appLableHight = new JLabel("Height");
    private static JLabel appLableX = new JLabel("x coordinate");
    private static JLabel appLableY = new JLabel("y Coordinate");
    private static JComboBox comboShapeType = new JComboBox(shapes);
    private static JComboBox comboFillType = new JComboBox(fillTypes);
    private static JComboBox comboColors = new JComboBox(colors);
    private static JTextField appTextWidth = new JTextField("");
    private static JTextField appTextHeight = new JTextField("");
    private static JTextField appTextX = new JTextField("");
    private static JTextField appTextY = new JTextField("");

    // method to get width
    public static int getWidth() {
        return Integer.parseInt(appTextWidth.getText());
    }

    // method to get Height
    public static int getHeight() {
        return Integer.parseInt(appTextHeight.getText());
    }

    // method to get X
    public static int getX() {
        return Integer.parseInt(appTextX.getText());
    }

    // method to get Y
    public static int getY() {
        return Integer.parseInt(appTextY.getText());
    }

    // method to get value of color jBox and return a Color Value
    public static Color getColor() {
        String rtnColor = String.valueOf(comboColors.getSelectedItem());
        Color finalColor = null;

        switch (rtnColor) {
            case "Black":
                finalColor = Color.BLACK;
                break;

            case "Red":
                finalColor = Color.RED;
                break;

            case "Orange":
                finalColor = Color.ORANGE;
                break;

            case "Yellow":
                finalColor = Color.YELLOW;
                break;

            case "Green":
                finalColor = Color.GREEN;
                break;

            case "Blue":
                finalColor = Color.BLUE;
                break;

            case "Magenta":
                finalColor = Color.MAGENTA;
                break;
        }
        return finalColor;
    }


    // method to get if the shape is fill or not
    public static boolean getFill() {
        if (String.valueOf(comboFillType.getSelectedItem()) == "Solid") {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        // Main frame
        appFrame.setSize(620, 380);
        appFrame.setTitle("Geometric Drawing");
        appFrame.setBackground(Color.LIGHT_GRAY);
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appFrame.setLocationRelativeTo(null);
        appFrame.add(nestLayout);

        // Nest tht host al the panels
        nestLayout.setLayout(new BorderLayout());
        nestLayout.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        nestLayout.add(appPanelLeft, BorderLayout.WEST);
        nestLayout.add(appPanelCenter, BorderLayout.CENTER);
        nestLayout.add(appPanelRight, BorderLayout.EAST);
        nestLayout.add(appPanelLower, BorderLayout.SOUTH);

        // panel Left
        appPanelLeft.setLayout(new GridLayout(7, 1));
        appPanelLeft.add(appLableShapeType);
        appPanelLeft.add(appLableFillType);
        appPanelLeft.add(appLableColor);
        appPanelLeft.add(appLableWidth);
        appPanelLeft.add(appLableHight);
        appPanelLeft.add(appLableX);
        appPanelLeft.add(appLableY);

        // Panel Center
        appPanelCenter.setLayout(new GridLayout(7, 1));
        appPanelCenter.setBorder(BorderFactory.createEmptyBorder(0, 30, 0, 10));
        appPanelCenter.add(comboShapeType);
        appPanelCenter.add(comboFillType);
        appPanelCenter.add(comboColors);
        appPanelCenter.add(appTextWidth);
        appPanelCenter.add(appTextHeight);
        appPanelCenter.add(appTextX);
        appPanelCenter.add(appTextY);

        // Panel Right
        appPanelRight.setLayout(new BorderLayout());
        appPanelRight.setPreferredSize(mainDraw.getPreferredSize());
        appPanelRight.setBorder(BorderFactory.createTitledBorder("Shape Drawing"));
        appPanelRight.add(mainDraw); // add drawing to the panel


        // Panel Bottom
        appPanelLower.setLayout(new FlowLayout());
        appPanelLower.add(drawButton);

        // pack and set the GUI visible
        appFrame.pack();
        appFrame.setVisible(true);

        drawButton.addActionListener(new Project3());
    }


    // implementation of the actionListener
    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            // check if fields are empty when draw button is pressed and build the shapes
            if (e.getSource() == drawButton && !appTextHeight.equals("") || !appTextWidth.equals("") || !appTextX.equals("") || !appTextY.equals("")) {

                // build Rectangular shape
                if (comboShapeType.getSelectedItem() == "Rectangle") {
                    newShape = new Rectangular(new Rectangle(getX(), getY(), getWidth(), getHeight()), getColor(), getFill());
                    mainDraw.drawShape(newShape);

                    // build Oval shape
                } else if (comboShapeType.getSelectedItem() == "Oval") {
                    newShape = new Oval(new Rectangle(getX(), getY(), getWidth(), getHeight()), getColor(), getFill());
                    mainDraw.drawShape(newShape);
                }
            }


        } catch (NumberFormatException num) {
            JOptionPane.showMessageDialog(appFrame, "Please enter the dimension values.", "Alert", JOptionPane.WARNING_MESSAGE);
            System.out.println(num.getMessage());

        } catch (OutsideBounds num) {
            JOptionPane.showMessageDialog(appFrame, String.format("The values of width or height are above %d ", mainDraw.getPreferredSize().height), "Alert", JOptionPane.WARNING_MESSAGE);
            System.out.println(num.getMessage());
        }
    }
}



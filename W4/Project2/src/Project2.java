/*
* File: Project2.java
 * Author: Brian Miranda Perez
 * Date: June 10, 2020
 * this class contains the main and GUI
 * for project 2.
 * */
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Project2 implements ActionListener {

    // init all fields
    private static JFrame appFrame = new JFrame();
    private static JPanel appPanelTop = new JPanel();
    private static JPanel appPanelCenter = new JPanel();
    private static JPanel appPanelLower = new JPanel();
    private static JPanel nestLayout  = new JPanel();
    private static JButton compSalesTax = new JButton("Compute Sales Tax");
    private static JButton clearFields = new JButton("Clear Fields");
    private static JButton dysplayReports = new JButton("Display Reports");
    private static JLabel appLableMake = new JLabel("Make and Model", JLabel.CENTER);
    private static JLabel appLablePrice = new JLabel("Sales Price", JLabel.CENTER);
    private static JRadioButton appRadioHybrid = new JRadioButton("Hybrid");
    private static JRadioButton appRadioElectric = new JRadioButton("Electric");
    private static JRadioButton appRadioOther = new JRadioButton("Other");
    private static JLabel appLableMPG = new JLabel("Miles per Gallon");
    private static JLabel appLableWeight = new JLabel("Weight in Pounds");
    private static JTextField appTextMake = new JTextField("");
    private static JTextField appTextPrice = new JTextField("");
    private static JTextField appTextMPG = new JTextField("");
    private static JTextField appTextWeight = new JTextField("");
    private static JTextField appTextSalesTax = new JTextField("");
    private static ArrayList<Automobile> autostore = new ArrayList<>(5);

    // methid to get make and model
    public static String getMake() {
        return appTextMake.getText();
    }

    /** thos metods return the vaalues as an INT */
    // method to get Price
    public static int getPrice() {
        return Integer.parseInt(appTextPrice.getText());
    }

    // Method to get MPG
    public int getMPG() {
        return Integer.parseInt(appTextMPG.getText());
    }

    // Method to get weight
    public int getWeight() {
        return Integer.parseInt(appTextWeight.getText());
    }
    /** -------------------------------------------------- */

    // method to clear all fields
    public void clear() {
        appTextMake.setText("");
        appTextPrice.setText("");
        appTextMPG.setText("");
        appTextSalesTax.setText("");
        appTextWeight.setText("");
    }

    // Method to add every entry to autostore arrayList
    public void store(Automobile test) {
        autostore.add(test);
    }

    public static void main(String[] args) {

        // set Frame
        appFrame.setSize(420, 260);
        appFrame.setTitle("Automobile Sales Tax Calculator");
        appFrame.setBackground(Color.LIGHT_GRAY);
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appFrame.add(nestLayout);

        // this is the panel that holds all other panels
        nestLayout.setLayout(new BorderLayout());
        nestLayout.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        nestLayout.add(appPanelTop, BorderLayout.NORTH);
        nestLayout.add(appPanelCenter, BorderLayout.CENTER);
        nestLayout.add(appPanelLower, BorderLayout.SOUTH);

        // set top Panel that holds the make and price
        appPanelTop.setLayout(new GridLayout(2, 2));
        appPanelTop.setBorder(BorderFactory.createEmptyBorder(0, 0, 8, 45));
        appPanelTop.add(appLableMake);
        appPanelTop.add(appTextMake);
        appPanelTop.add(appLablePrice);
        appPanelTop.add(appTextPrice);

        // set center Panel that holds all fields inside automobile type frame
        appPanelCenter.setLayout(new GridLayout(3, 3, 0, 0));
        appPanelCenter.setBorder(BorderFactory.createTitledBorder("Automobile Type"));
        appPanelCenter.add(appRadioHybrid);
        appPanelCenter.add(appLableMPG);
        appPanelCenter.add(appTextMPG);
        appPanelCenter.add(appRadioElectric);
        appPanelCenter.add(appLableWeight);
        appPanelCenter.add(appTextWeight);
        appPanelCenter.add(appRadioOther, true);

        // Group buttons so each radial button is aware of the other
        ButtonGroup bg = new ButtonGroup();
        bg.add(appRadioHybrid);
        bg.add(appRadioElectric);
        bg.add(appRadioOther);

        // Lower panel that holds all the buttons and the tax output field
        appPanelLower.setLayout(new GridLayout(2, 2, 5, 5));
        appPanelLower.setBorder(BorderFactory.createEmptyBorder(8, 30, 0, 30));
        appPanelLower.add(compSalesTax);
        appPanelLower.add(appTextSalesTax);
        appTextSalesTax.setBackground(Color.LIGHT_GRAY);
        appTextSalesTax.setEditable(false);
        appPanelLower.add(clearFields);
        appPanelLower.add(dysplayReports);

        appFrame.pack();
        appFrame.setVisible(true);

        // Action listeners setters for each button
        appRadioHybrid.addActionListener(new Project2());
        appRadioElectric.addActionListener(new Project2());
        appRadioOther.addActionListener(new Project2());
        compSalesTax.addActionListener(new Project2());
        clearFields.addActionListener(new Project2());
        dysplayReports.addActionListener(new Project2());

    }

    // implemetation of the actionListener
    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            if (appRadioHybrid.isSelected()) {
                Automobile selectHybrid = new Hybrid(getMake(), getPrice(), getMPG());
                if (e.getSource() == compSalesTax) {
                    appTextSalesTax.setText(String.valueOf(selectHybrid.salesTax()));
                    store(selectHybrid);
                } else if (e.getSource() == clearFields) {
                    clear();

                }

            }

            if (appRadioElectric.isSelected()) {
                Automobile selectElectric = new Electric(getMake(), getPrice(), getWeight());
                if (e.getSource() == compSalesTax) {
                    appTextSalesTax.setText(String.valueOf(selectElectric.salesTax()));
                    store(selectElectric);
                } else if (e.getSource() == clearFields) {
                    clear();

                }

            }

            if (appRadioOther.isSelected()) {
                Automobile selectOther = new Automobile(getMake(), getPrice());
                if (e.getSource() == compSalesTax) {
                    appTextSalesTax.setText(String.valueOf(selectOther.salesTax()));
                    store(selectOther);
                } else if (e.getSource() == clearFields) {
                    clear();
                }
            }

            if (e.getSource() == dysplayReports) {
                for (Automobile auto : autostore) {
                    System.out.println("---------------------");
                    System.out.println(auto.toString() + "\n");

                }
            }

        } catch (NumberFormatException num) {
            JOptionPane.showMessageDialog(appFrame, "Please enter the values first!", "Alert", JOptionPane.WARNING_MESSAGE);
        }

    }

}
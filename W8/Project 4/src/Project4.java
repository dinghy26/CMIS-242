/**
 * File: Project4.java
 * Author: Brian Miranda Perez
 * Date: July 02, 2020
 * TShis class contains the main and GUI
 * for project 4.
 * */

import java.awt.*;
import javax.swing.*;
import java.util.TreeMap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Project4 implements ActionListener {

    /**
     * @see TreeMap main database for the program that stores a property using 
     *  the transaction number as a key. 
     */
    private static TreeMap<Integer, Property> mainData = new TreeMap<>();

    // private fields for program GUI.
    private static String[] process = { "Insert", "Delete", "Find" };
    private static Status[] status = { Status.FOR_SALE, Status.UNDER_CONTRACT, Status.SOLD };
    private static JFrame appFrame = new JFrame();
    private static JPanel appPanelLeft = new JPanel();
    private static JPanel appPanelRight = new JPanel();
    private static JPanel appPanelLower = new JPanel();
    private static JPanel nestLayout = new JPanel();
    private static JLabel appLabelTransactionNo = new JLabel("Transaction No:");
    private static JLabel appLabelAddress = new JLabel("Address:");
    private static JLabel appLabelBedrooms = new JLabel("Bedrooms:");
    private static JLabel appLabelSqFootage = new JLabel("Square Footage:");
    private static JLabel appLabelPrice = new JLabel("Price:");
    private static JButton processButton = new JButton("Process");
    private static JButton statusButton = new JButton("Change Status");
    private static JComboBox comboProcess = new JComboBox(process);
    private static JComboBox comboStatus = new JComboBox(status);
    private static JTextField appTextTransacNo = new JTextField(14);
    private static JTextField appTextAddress = new JTextField(14);
    private static JTextField appTextBedrooms = new JTextField(14);
    private static JTextField appTextSqFootage = new JTextField(14);
    private static JTextField appTextPrice = new JTextField(14);

    /**
     * @return Method that returns the transaction number 
     * from text field as an integer.
     */
    public static int getTransNo() {
        return Integer.parseInt(appTextTransacNo.getText());
    }

    /**
     * @return Method that returns the address from text field.
     */
    public static String getAddress() {
        return appTextAddress.getText();
    }

    /**
     * @return method that returns the number of bedrooms as na integer.
     */
    public static int getBedrooms() {
        return Integer.parseInt(appTextBedrooms.getText());
    }

    /**
     * @return method that returns the SqFt of the property as an integer.
     */
    public static int getSqFt() {
        return Integer.parseInt(appTextSqFootage.getText());
    }

    /**
     * @return method that returns the Price of the property as an integer.
     */
    public static int getPrice() {
        return Integer.parseInt(appTextPrice.getText());
    }

    /**
     * @param key
     * @param houseInfo
     * @see method check if the main database contains the key entered.
     * If key is already in the data base displays n alert msg.
     * If key is nit in the database this add the key with the property entered
     * and display a successful added msg.
     */
    public static void addData(int key, Property houseInfo) {
        if (mainData.containsKey(key)) {
            JOptionPane.showMessageDialog(appFrame, "This transaction No. already exist.", "Alert",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            mainData.put(key, houseInfo);
            JOptionPane.showMessageDialog(appFrame, "Transaction No. " + key + " added to database.");
        }
    }

    /**
     * @param key
     * @see method first check if the key entered is in the database.
     * if the key is not in the database it displays an alert.
     * if key is in the database it remove the key pair from the database
     * and display a successful msg. 
     */
    public static void removeData(int key) {
        if (!mainData.containsKey(key)) {
            JOptionPane.showMessageDialog(appFrame, "The transaction No. entered does not exist.", "Alert",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            mainData.remove(key);
            JOptionPane.showMessageDialog(appFrame, "Transaction No. " + key + " remove from database.");
        }
    }

        /**
     * @param key
     * @see method first check if the key entered is in the database.
     * if the key is not in the database it displays an alert.
     * if key is in the database it display the toString method from the property
     * class in a pop-up window.
     */
    public static void findData(int key) {
        if (!mainData.containsKey(key)) {
            JOptionPane.showMessageDialog(appFrame, "The transaction No. entered does not exist.", "Alert",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(appFrame, "No. " + key + "\n" + mainData.get(key), "Database Request", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    public static void main(String[] args) {

        // Main frame
        appFrame.setSize(625, 390);
        appFrame.setTitle("Real Estate Database");
        appFrame.setBackground(Color.LIGHT_GRAY);
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appFrame.setLocationRelativeTo(null);
        appFrame.add(nestLayout);

        // Nest tht host al the panels
        nestLayout.setLayout(new BorderLayout());
        nestLayout.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        nestLayout.add(appPanelLeft, BorderLayout.WEST);
        nestLayout.add(appPanelRight, BorderLayout.EAST);
        nestLayout.add(appPanelLower, BorderLayout.SOUTH);

        // panel Left
        appPanelLeft.setLayout(new GridLayout(5, 1, 2, 2));
        appPanelLeft.add(appLabelTransactionNo);
        appPanelLeft.add(appLabelAddress);
        appPanelLeft.add(appLabelBedrooms);
        appPanelLeft.add(appLabelSqFootage);
        appPanelLeft.add(appLabelPrice);

        // panel Right
        appPanelRight.setLayout(new GridLayout(5, 1, 3, 1));
        appPanelRight.add(appTextTransacNo);
        appPanelRight.add(appTextAddress);
        appPanelRight.add(appTextBedrooms);
        appPanelRight.add(appTextSqFootage);
        appPanelRight.add(appTextPrice);

        // panel Lower
        appPanelLower.setLayout(new GridLayout(2, 2, 8, 9));
        appPanelLower.setBorder(BorderFactory.createEmptyBorder(9, 1, 1, 1));
        appPanelLower.add(processButton);
        appPanelLower.add(comboProcess);
        appPanelLower.add(statusButton);
        appPanelLower.add(comboStatus);

        // pack and set the GUI visible
        appFrame.pack();
        appFrame.setVisible(true);

        //add Buttons to actionListener
        processButton.addActionListener(new Project4());
        statusButton.addActionListener(new Project4());

    }

    // implementation of the actionListener
    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            // applies the process selected in the Process comboBox.
            if (e.getSource() == processButton) {

                if (comboProcess.getSelectedItem() == "Insert") {
                    addData(getTransNo(), new Property(getAddress(), getBedrooms(), getSqFt(), getPrice()));

                } else if (comboProcess.getSelectedItem() == "Delete") {
                    removeData(getTransNo());

                } else if (comboProcess.getSelectedItem() == "Find") {
                    findData(getTransNo());
                }
            }

            // applies the Status selected in the Change status comboBox.
            if (e.getSource() == statusButton) {

                if (comboStatus.getSelectedItem() == Status.UNDER_CONTRACT) {
                    mainData.get(getTransNo()).changeState(Status.UNDER_CONTRACT);

                } else if (comboStatus.getSelectedItem() == Status.SOLD) {
                    mainData.get(getTransNo()).changeState(Status.SOLD);

                } else if (comboStatus.getSelectedItem() == Status.FOR_SALE) {
                    mainData.get(getTransNo()).changeState(Status.FOR_SALE);
                }
            }

        } catch (NumberFormatException numVal) {
            JOptionPane.showMessageDialog(appFrame, "Please enter the values.", "Alert", JOptionPane.WARNING_MESSAGE);
        }
    }

}
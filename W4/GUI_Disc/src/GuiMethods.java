import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiMethods extends JPanel {
    
    private JLabel fName = new JLabel("First Name", JLabel.CENTER);
    private JLabel lName = new JLabel("Last Name", JLabel.CENTER);
    private JLabel value1 = new JLabel("Value #1", JLabel.CENTER);
    private JLabel value2 = new JLabel("Value #2", JLabel.CENTER);
    private JLabel output = new JLabel("Output", JLabel.CENTER);
    
    // text fields 
    private JTextField fNameIn = new JTextField("");
    private JTextField lNameIn = new JTextField("");
    private JTextField value1In = new JTextField("");
    private JTextField value2In = new JTextField("");
    private JTextField outputOut = new JTextField("");
    private JButton result = new JButton("Result");

    public String getFullName() {
        return fNameIn.getText() + " " + lNameIn.getText(); 
    }

    public int getValue1() {
        return Integer.parseInt(value1In.getText());
    }

    public int getValue2() {
        return Integer.parseInt(value2In.getText());
    }

    public void setResultlbl(String lable) {
        output.setText(lable);
    }

    public void resultText(int result) {
        outputOut.setText(String.valueOf(result));
    }

    public GuiMethods() {
        
        setLayout(new BorderLayout());
        setBackground(Color.lightGray);
        JPanel IOP =  new JPanel();
        IOP.setLayout(new GridLayout(5,2,0,5));
        outputOut.setBackground(Color.lightGray);
        outputOut.setEditable(false);

        IOP.add(fName);
        IOP.add(lName);
        IOP.add(fNameIn);
        IOP.add(lNameIn);
        IOP.add(value1);
        IOP.add(value2);
        IOP.add(value1In);
        IOP.add(value2In);
        IOP.add(output);
        IOP.add(outputOut);

        add(IOP, BorderLayout.CENTER);

        JPanel buttonP = new JPanel();
        buttonP.setLayout(new FlowLayout(FlowLayout.CENTER));
        result.setToolTipText("Outputs the your name and the addition of 2 numbers");
        buttonP.add(result);
        result.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setResultlbl(getFullName());
                int sum = getValue1() + getValue2();
                resultText(sum);
            }
        });
        //buttonP.add(outputOut);
        add(buttonP, BorderLayout.SOUTH);
    }
    

}
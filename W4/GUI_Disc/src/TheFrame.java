import javax.swing.*;

public class TheFrame extends JFrame {
    
    static final int WIDHT = 500, HEIGHT = 500;

    public TheFrame() {
        super("The Frame");
        setFrtame(WIDHT, HEIGHT);
    }

    public TheFrame(String title) {
        super(title);
        setFrtame(WIDHT, HEIGHT);
    }

    public TheFrame(String title, int width, int height) {
        super(title);
        setFrtame(width, height);
    }

    public void display() {
        setVisible(true);
    }

    private void setFrtame(int width, int height) {
        setSize(width,height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
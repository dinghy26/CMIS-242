import java.awt.*;
import javax.swing.*;
public class GuiApp extends TheFrame {

    public GuiApp() {
        super("Brian's App", 300, 300);
        add(new GuiMethods());
    }

    public static void main(String[] args) {
        GuiApp theApp = new GuiApp();
        theApp.display();
        
    }
    
}
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class chooserMethods {

    public void chooser1() {

        JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        int returnVal = chooser.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File selectFile = chooser.getSelectedFile();
            System.out.println(selectFile.getAbsolutePath());
        }
    }
}
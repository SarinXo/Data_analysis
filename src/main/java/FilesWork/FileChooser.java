package FilesWork;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

public class FileChooser {

    public static JFileChooser openFileDialog(){
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("*.txt", "txt");
        JFileChooser fileDialog = new JFileChooser();
        fileDialog.addChoosableFileFilter(fileFilter);
        fileDialog.setCurrentDirectory(new File("C:/", "D:/"));
        fileDialog.setDialogTitle("Чикибамбони");
        fileDialog.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        return fileDialog;

    }
}

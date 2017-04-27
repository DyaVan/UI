package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.io.*;
import java.nio.file.*;

public class Controller {

    private File f1;
    private File f2;
    private File resultFile;

    @FXML
    Label lblF1Name;

    @FXML
    Label lblF2Name;


    public void importFile1(ActionEvent event){
        JFileChooser chooser = getFileChooser();
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            f1 = chooser.getSelectedFile();
            String fileName = f1.getName();
            lblF1Name.setText(fileName);
        }

    }

    public void importFile2(ActionEvent event){
        JFileChooser chooser = getFileChooser();
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            f2 = chooser.getSelectedFile();
            String fileName = f2.getName();
            lblF2Name.setText(fileName);
        }
    }

    public void export(ActionEvent event){
        JFileChooser chooser = getFileChooser();

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            resultFile = chooser.getSelectedFile();
//            new FileInputStream(f1);
//            new FileInputStream(f2);
//            new FileOutputStream(resultFile);
            System.out.println(resultFile.getAbsolutePath());
        }



    }


    private JFileChooser getFileChooser(){
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Формат файлов - .xls, .xlsx, .csv.", "xls", "xlsx", "csv");
        chooser.setFileFilter(filter);
        chooser.setAcceptAllFileFilterUsed(false);
        return chooser;
    }


}

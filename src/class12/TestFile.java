/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class12;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 *
 * @author shahzad
 */
public class TestFile {

    public static void main(String[] args) throws IOException {
        File nf = new File("c:/abc.txt");

        // Get All Drive 
        File[] drives = File.listRoots();
//        // List 
//        for (File d : drives) {
//            System.out.println("--DRIVE[=" + d.getPath() + "=]");
//            if (d.listFiles() != null) {
//                for (File f : d.listFiles()) {
//                    System.out.println((f.isFile() ? "[File]" : "[DIR]") + f.getName());
//                }
//            }
////        }
//        // Filter List 
//        FilenameFilter txtFile = new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.toLowerCase().endsWith("txt");
//            }
//        };
//        for (File d : drives) {
//            System.out.println("--DRIVE[=" + d.getPath() + "=]");
//            if (d.listFiles() != null) {
//                for (File f : d.listFiles(txtFile)) {
//                    System.out.println((f.isFile() ? "[File]" : "[DIR]") + f.getName());
//                }
//            }
//        }

        // Delete
        File fDel = new File("c:/abc.txt");
//        fDel.createNewFile();
//        if (fDel.exists() == false) {
//            System.out.println(fDel.getName() + " does not exists ... ");
//        }
//        System.out.println(fDel.delete() ? "Success ... " : " Failed ... ");

        // Rename 
        File rName = new File("c:/abc-rename.txt");
        if (rName.exists() == false) {
            System.out.println(rName.getName() + " does not exists ... ");
        }
        fDel.renameTo(rName) ;
    }
}

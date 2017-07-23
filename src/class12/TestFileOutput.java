/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author shahzad
 */
public class TestFileOutput {

    public static void main(String[] args) throws FileNotFoundException, IOException {
//        try {
//            FileOutputStream fout = new FileOutputStream("c:/abc.txt");
//            fout.write("this is my file (12345) .... ".getBytes());
//            fout.close();
//        } catch (Exception e) {
//        }

        RandomAccessFile raf = new RandomAccessFile("c:/abc.txt", "rw");
        raf.writeUTF("string array ");
        raf.close();

        Scanner scan = new Scanner(new FileInputStream("c:/abc.txt"));
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
    }

}

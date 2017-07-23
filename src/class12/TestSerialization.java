/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author shahzad
 */
public class TestSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Write
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:/serial.txt"));
        out.writeObject(new Assignment(1, "shahzad", 10.0f));
        out.close();

        // Read
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("c:/serial.txt"));
        Object o = in.readObject();
        System.out.println(o);
        in.close();
    }
}

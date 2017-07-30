/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author shahzad
 */
public class TestProperties {

    public static void main(String[] args) throws IOException {
//        Properties prop = System.getProperties() ;
        Properties prop = new Properties();
        prop.load(new FileInputStream("c:/prop.txt"));
        // Get
//        System.out.println(prop.getProperty("user.dir"));
        // Add 
        prop.setProperty("my.property", "this is my first value") ;
        // Update
        prop.setProperty("my.property", "second value");
        // Remove
        prop.remove("my.property") ;
        prop.list(System.out);
//        prop.store(new FileOutputStream("c:/prop.txt"), "My Properties");
    }
}

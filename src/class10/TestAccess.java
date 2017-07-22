/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class10;

import class7.Point;
import class9.Dog;

/**
 *
 * @author shahzad
 */
public class TestAccess {

    public static void main ( String[] args ) {
        // scope 
        // <<default>> = Object to access others
        // static = Don't need object
        Dog.main(args) ;
        System.out.println(Dog.objectCounter) ;
        
        // access 
        // <default> = Only accessible in package
        Point p = new Point() ;
        // public = Accessible from all 
        // protected = Package + child class
        // private = only for class
        
    }
}

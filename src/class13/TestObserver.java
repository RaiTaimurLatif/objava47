/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class13;

import java.util.Observer;

/**
 *
 * @author shahzad
 */
public class TestObserver {

    public static void main ( String[] args ) throws InterruptedException {
        Observer[] students = {
            new Student("ahmed", "ahmed@gmail.com"),
            new Student("second", "second@gmail.com"),
            new Student ("third", "third@gmail.com"), 
            new Student( "fourth", "four@gmail.com")
        } ;
        
        Teacher t = new Teacher() ;
        // Binding 
        for ( Observer o : students ) {
            t.addObserver(o);
        }
        
        while ( true ) {
            t.addAssignment("Assignment - " + System.currentTimeMillis() );
            System.out.println("========================") ;
            Thread.sleep(4000);
        }
    }
}

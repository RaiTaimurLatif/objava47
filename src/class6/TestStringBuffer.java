/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6;

/**
 *
 * @author shahzad
 */
public class TestStringBuffer {

    public static void main ( String[] args ) {
        // ahmed.usman@outlook.com
        // hr@i2cinc.com - careers@i2cinc.com
        // kazim.ali@northbaysolutions.net, hr@northbaysolutions.net
        // hr@sensys.com
        
        String name = "shahzad" ;
        name = name + " masud" ;
        name = name + " middle" ;
        
        name.concat("shahzad").concat("masud").concat("middle") ;
        
        StringBuilder builder = new StringBuilder() ;
        builder.append("shahzad") ;
        builder.insert(2, "masud") ;
    }
    
}

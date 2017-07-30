/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class14;

/**
 *
 * @author shahzad
 */
public class Single {

    // Singelton design pattern
    private static Single single;

    public static Single getInt() {
        if (single == null) {
            single = new Single();
        }
        return single;
    }

    private Single() {
    }

}

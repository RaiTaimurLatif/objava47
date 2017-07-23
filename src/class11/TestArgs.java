/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class11;

import class7.Point;

/**
 *
 * @author shahzad
 */
public class TestArgs {

    public static void main(String[] args) {
        print(2);
        print(2, "two", 4, "four", new Point());
        print(25, "Anything", true, 4E4, 12.2, 12311231232l);
    }

    public static void print(int bb, Object... args) {
        System.out.print(bb);
        for (Object a : args) {
            if ( Point.class == a.getClass() ) {
                System.out.print("{{Point}}");
            }
            System.out.print("====" + a + "[" + a.getClass() + "]");
        }
        System.out.println();
    }
}

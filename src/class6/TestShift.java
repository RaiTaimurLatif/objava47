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
public class TestShift {

    public static void main(String[] args) {

        // Bitwise Operator
        // Right Shift >> Insert sign bit from left
        // Left Shift << Insert zeros from right
        // Bitwise Right Shift >>> Insert zeros from left
        // And = Both bits are one
        // Or = Either bit is one
        // Ex-Or = Different bits => one, other zero
        int i, j;
        i = j = 0;

        // Binary And 
//        if (i++ == 1 && j++ == 0) {
//            System.out.println("Both Zero");
//        }
//        System.out.println(i + ":" + j);
//        // Bitwise And 
//        if (i++ == 1 & j++ == 0) {
//            System.out.println("Both Zero");
//        }
//        System.out.println(i + ":" + j);
//        || ==> First One true, 
        if (i++ == 0 || j++ == 0) {
            System.out.println("Both Zero");
        }
        System.out.println(i + ":" + j);

        Integer a, b, c, d, e, f;
        a = b = c = d = e = f = 1;
        a += b += c += d += e += f += 1;

    }

}

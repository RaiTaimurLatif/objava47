/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class13;

/**
 *
 * @author shahzad
 */
public class PowerCalc {
    // ATDD = Acceptance Test Driven Development
    // 1. Define a problem / test 
    // 2. Execute that test
    // 3. Develop code, test again if false, add more test if true
    // 4. Repeat step 2 (fail, develop, pass/fail)

    public static void main(String[] args) {
        System.out.println("5.0 ^ 4 = " + power(5.0, 4));
        System.out.println("7.5 ^ 5 = " + power(7.5, 5));
        System.out.println("5.0 ^ 0 = " + power(5.0, 0));
        System.out.println("10.0 ^ -2 = " + power(10.0, -2)) ;
        System.out.println("-5.0 ^ 4 = " + power(-5.0, 4));
        System.out.println("-10.0 ^ -4 = " + power(-10.0, -4));
    }

    public static double power(double x, long y) {
        if (y < 0) {
            return 1 / power(x, -y);
        } else if (y > 0) {
            return x * power(x, y - 1);
        } else {
            if (y == 1) {
                return x;
            } else {
                return 1;
            }
//            return y == 1 ? x : 1 ;
        }
    }
}

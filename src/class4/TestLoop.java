/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4;

import java.util.Scanner;

/**
 *
 * @author shahzad
 */
public class TestLoop {

    public static void main(String[] args) {

        // initialization, condition, increment, statement
        // 1. While
//        int a = 0; // init 
//        while (a < 10) { // expr / condition
//            System.out.println((a + 1) + " X 2 = " + ((a + 1) * 2)); // stmt
//            a++; // increment 
//        }
//
//        // 2. Do While 
//        int b = 0; // init 
//        do {
//            System.out.println(b); // stmt
//            b++; // inc ;
//        } while (b < 10);
//
//        // 3. For Loop
//        // for ( init ; expr ; inc ) 
//        for (int c = 0; c < 10; c++) {
//            System.out.println(c);
//        }
        // 4. For-each Loop
        // TODO: 
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                for (int k = 0; k < 10; k++) {
//                    System.out.println(i + ":" + j + ":" + k);
//                }
//            }
//        }
//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            if ( i == 5 ) break ;
//            System.out.println(i);
//        }
//        
//        int input = 0 ;
//        Scanner scanner = new Scanner(System.in) ;
//        while ( input != 1 ) {
//            System.out.println("Press below options, ") ;
//            System.out.println("Press 0 for continue ... ") ;
//            System.out.println("Press 1 for exit ... " ) ;
//            input = scanner.nextInt() ;
////            if ( input == 1 ) {
////                break ;
////            }
//        }
        // objava47.blogspot.com
//        for (int i = 0; i < 4; i++) {
//            for (int j = i; j < 10; j++) {
//                for (int k = j; k < 10; k++) {
//                    for (int m = k; m < 4; m++) {
//                        for (int n = m; n < 4; n++) {
//                            for (int o = n; o < 10; o++) {
//                                if (i + j + k == m + n + o) {
//                                    continue;
//                                }
//                                System.out.println(i + ":" + j + ":" + k
//                                        + "===" + m + ":" + n + ":" + o);
//                            }
//                            // 3:3:1 === 3:1:3
//                        }
//                    }
//                }
//            }
//        }
        one: for (int i = 0; i < 4; i++) {
            two: for (int j = i; j < 10; j++) {
                three: for (int k = j; k < 10; k++) {
                    if (i + j == j + k) {
                        continue one;
                    }
                }
            }
        }
    }

    // Assignment 1 : 
    // Prime Number Calculation (after user input)
    // Help Console 
//    Scanner scan = new Scanner(System.in) ;
//    int i = scan.nextInt() ;
    // Help GUI
//    int input = Integer.parseInt(userInput.getText()) 
    // Additional: LCF, LCD, Factorial, Fibonnaci. 
    // shahzad.masud@gmail.com
    // 0321 442 8889
    
    // 5 = 1 * 2 * 3 * 4 * 5 
    // 1 1 2 3 5 8
}

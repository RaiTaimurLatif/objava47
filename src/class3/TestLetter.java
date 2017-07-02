/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isWhitespace;

/**
 *
 * @author shahzad
 */
public class TestLetter {

    enum ShirtSize {
        small, medium, large, extra_large, extra_extra_large;
    }

    public static void main(String[] args) {

        char a = 'A'; // 65
        if (isUpperCase(a)) {
//        if ( a > 64 && a < 92 ) {
            System.out.println("Upper");
        } else if (isLowerCase(a)) {
//        else if ( a > 96 && a < 124 ) {
            System.out.println("Lower");
        } else if (isWhitespace(a)) {
            System.out.println("White Space");
        }

//        if ( expression ) {
//            statement(s);
//        } else {
//            statement(s) ;
//        }
        // Helper Functions 
//        Integer i = new Integer(0) ; // 0 ;
//        Float f = 10.0f ; 
//        Long l = 10L ;
//        Double d = 10.0d ;
//        Boolean b = false ;
//        Short s = 10 ;
//        Character c = 'A' ;
        int i, j;
        i = j = 0;
        if (i == 0) {
            j = i + 1;
        } else {
            j = 1;
        }
        // i = 0 
        // j = 1 

        // expression ? true : false ; 
        j = (i == 0) ? i + 1 : 1;

        if (true) {
            j = 10;
        } else {
            i = 100;
        }

        j = true ? 10 : 100;

        if (i == 0) {
            System.out.println("Zero");
        } else if (i == 1) {
            System.out.println("One");
        } else if (i == 2) {
            System.out.println("Two");
        } else {
            System.out.println("Nothing");
        }

        switch (i) {
            case 0:
                System.out.println("Zero");
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
            default:
                System.out.println("Nothing");
                break;
        }

        System.out.println(
                i == 0 ? "Zero"
                        : i == 1 ? "One"
                                : i == 2 ? "Two" : "Nothing"
        );

        ShirtSize size = ShirtSize.small;
        if (size == ShirtSize.small) {
            System.out.println(size);
        }

        switch (size) {
            case small:
                break;
            case medium:
                break;
            case large:
                break;
            case extra_large:
                break;
            case extra_extra_large:
                break;
        }

    }

}

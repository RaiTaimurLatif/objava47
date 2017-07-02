/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;

/**
 *
 * @author shahzad
 */
public class TestVariable {

    public static void main(String[] args) {
//        int a ; // Declare
//        a = 10 ; // Init 
        int no$of$students = 10;

//        int 1a = 10 ;
        // Rule 1: It should start with a letter 
        // Rule 2: It may start with $, _ (underscore)
        // Optional 3: Should be meaningful 
        // Optional 4: Separation, CamelCase, Underscore, Dollar
//        int $1$ = 10 ; // int
//        float f = 10.0f ; // float
//        long l = 10232233454l ; // long
//        double d = 10.0d ; // double
//        boolean b = false ;
//        char c = 97 ; //'a' ;
//        short s = 10 ;
//        short s = 1 ;
//        int a = 1 ;
//        float b = 1 ;
//        long c = 1 ;
//        double d = 1 ;
//        short s1 = 1, s2 = 1 ;
//        
//        s = (short) ( s1 + s2 ) ; // Explicit Cast
//        c = (long) (a + b) ; // E
//        c = a + (int) b ; // E
//        b = a + c ; // Implicit
//        d = a + b + c + d ; // Implicit
//        
        int a, b, c, d, e, f;
        a = b = c = d = e = f = 1;
        
//        a = a + 1 ; // binary addition 
//        a += 1 ; // Self addition 
//        a ++ ; // post increment ; after evaluate add of value
//        ++ a ; // pre increment ; before evaluation add of value
        
//        c = a++ + b++ ; // 1 + 1 = c , 2 = a, 2 = b 
//        c = ++a + ++b ; // 3 + 3 = c, a = 3, b = 3
//        f = a++ + b++ + c++ + d++ + ++d + ++c + f++ ; // 9
        //  1   + 1   + 1   + 1   +   3 +   3 + 1   ; // 11
//        f = --a + b++ + --b - --c - ++d - c-- + f-- + --f + 1 ;
        //    0 + 1   +   1 -   0 -   2 - 0   + 1   -   1 + 1 ; //1
        f = --a - --a - ++d - d++ - a-- - b-- + c-- + f-- - 1 ;
        //    0 +   1 -   2 - 2   + 1   - 1   + 1   + 1   - 1 ; //-2 

    }
}

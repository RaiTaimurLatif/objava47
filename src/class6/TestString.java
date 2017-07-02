/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6;

import java.util.Scanner;

/**
 *
 * @author shahzad
 */
public class TestString {

    public static void main(String[] args) {
        char[] name = {'s', 'h', 'a', 'h', 'z', 'a', 'd'};
        String n1 = "shahzad";
        String n2 = "shahzad";
        String n3 = new String("shahzad");

        if (n1 == n2) ; // reference = True
        if (n1 == n3) ; // reference = False
        if (n1.equals(n3)) ; // value = True

        // False mis-conception 
        n1 = null;
        n2 = null;
        n3 = null;
        System.gc();

        // Input
        Scanner scan = new Scanner(System.in);
//        String input = scan.next() ;

        // Search 
        String string = "a quick brown fox jumps over the lazy dog";

//        string.indexOf("o") ; // search from left 
        for (int idx = 0; idx != -1;) {
            idx = string.indexOf("oo", idx + 1);
            if (idx > -1) {
                System.out.print(idx + " ");
            } else {
                System.out.println();
            }
        }

        // split 
        String[] words = string.split(" ");
        String[] aCount = string.split("a");

        // substring 
        String quick = string.substring(2, 7);
        String other = string.substring(2);

        // Trim
        string.trim();
        
        // Assignment 2
        // input:  a quick brown fox jumps over the lazy doog
        // output: a kciuq nworb xof spmuj revo eht yzal good
        

    }

}

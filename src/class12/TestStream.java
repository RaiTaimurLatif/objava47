/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class12;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author shahzad
 */
public class TestStream {

    public static void main(String[] args) {
        // input stream 
        // a. int read() ; // single byte
        // b. int read(byte[]) ; // multiple bytes 
        // c. int read(byte[], int offset, int length) ; // filter read

        // output stream 
        // void write ( byte ) ; // single byte
        // void write ( byte[]) ; // multiple bytes 
        // void write ( byte[] , int offset, int length ) ; // filter write
//        InputStream is = new BufferedInputStream(System.in);
//        try {
//            byte[] b = new byte[1024];
//            System.out.print(">>");
//            while (true) {
//                int readBytes = is.read(b);
//                if ( readBytes == 0 ) break ;
//                String s = new String(b, 0, readBytes);
//                System.out.print(s);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        String input = read("1. Login", "2. Logout");
        input.split("|") ;
        input = read("1. View Assignment", "2. Submit Assignment", "3. View Marks");
    }

    public static String read(String... commands) {
        for (String c : commands) {
            System.out.println(c);
        }
        System.out.print(">>");
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
}

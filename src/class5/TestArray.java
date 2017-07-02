/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author shahzad
 */
public class TestArray {

    public static void main(String[] args) {
//        int a, b, c, d, e, f, g, h, i, j ; 
        int[] array = new int[10];
        array[0] = 0; // 1 

        // declare + init + assign
        // 1. 
        int[] p1; // delcare
        p1 = new int[10]; // init 
        p1[0] = 10; // assign 

        //2. 
        int[] p2 = new int[10]; // dec + init 
        p2[0] = 10; // assign

        //3. 
        int[] p3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // dec + init + assign
        p3 = new int[]{2, 3, 4, 5};

        // filling 
        for (int i = 0; i < p3.length; i++) {
            p3[i] = 10;
        }
        Arrays.fill(p1, 10);
        Arrays.binarySearch(p3, 4); // -1=not found, * = found

        Random random = new Random();
        for (int i = 0; i < p2.length; i++) {
            p2[i] = random.nextInt(i % 2 == 0 ? 200 : 500);
        }
        System.out.println(Arrays.toString(p2));

        p1 = null;
        p2 = null;
        p3 = null;
        System.gc();

        float[][] f = new float[4][4];
        // fixed = all dimension same 
        // graph, non-linear = different elements in dimension
        // linear = next dimension is bigger than last one
        f[0][0] = 10.0f;

        float[][] f3 = {{1}, {3, 4}, {3, 3, 7}};
        
        // Chess Game 
        // Using Frame
        // Move from one to another
    }

}

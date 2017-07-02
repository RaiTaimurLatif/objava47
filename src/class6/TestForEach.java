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
public class TestForEach {

    public static void main(String[] args) {

        int[] p = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int value = 0;
        for (int i = 0; i < p.length; i++) {
            value = p[i];
            System.out.print(value + " ");
        }
        System.out.println();

        for (int v : p) {
            System.out.print(v + " ");
        }
        System.out.println();

        float[][] t = {{1, 2, 3}, {2, 3, 4}, {4, 4, 4, 4, 4}};
        for (float[] f : t) {
            for (float g : f) {
                System.out.print(g + " ");
            }
            System.out.println();
        }

        char[][] chess = {{'a', 'b', 'c', 'd'}, {'a', 'b', 'c', 'd'}};

    }

}

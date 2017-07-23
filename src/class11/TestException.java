/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class11;

/**
 *
 * @author shahzad
 */
public class TestException {

    public static void main(String[] args) {
        int number = 0;
        try {
            // Evaluate 
            number = getInt("123");
        } catch (MyNumberFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getInt(String str) 
            throws Exception, MyNumberFormatException {
        try {
            return Integer.parseInt(str);
//        } catch (Exception e) {
//            throw new MyNumberFormatException("Something went wrong, please check this code");
        } finally {
            System.out.println("Will execute in any case");
        }
    }

}

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
public class MyNumberFormatException extends Exception {

    /**
     * Creates a new instance of <code>MyNumberFormatException</code> without
     * detail message.
     */
    public MyNumberFormatException() {
    }

    /**
     * Constructs an instance of <code>MyNumberFormatException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MyNumberFormatException(String msg) {
        super(msg);
    }

    public MyNumberFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyNumberFormatException(Throwable cause) {
        super(cause);
    }

    public MyNumberFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

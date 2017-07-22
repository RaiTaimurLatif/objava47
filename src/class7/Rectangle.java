/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class7;

import class7.Line;

/**
 *
 * @author shahzad
 */
public class Rectangle {

    Line width, height;

    public Rectangle() {
//        width = new Line();
//        height = new Line();
        this(new Line(), new Line());
    }

    public Rectangle(Point x1, Point x2, Point y1, Point y2) {
//        width = new Line(x1, y1);
//        height = new Line(x2, y2);
        this(new Line(x1, y1), new Line(x2, y2));
    }

    public Rectangle(Line width, Line height) {
        this.width = new Line(width);
        this.height = new Line(height);
    }

    public Rectangle(Rectangle rec) {
        this(rec.width, rec.height);
    }

    double area() {
        return this.width.length() * this.height.length();
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }
    
    public static void main ( String[] args ) {
        Rectangle rec = new Rectangle() ;
        System.out.println(rec) ;
    }
    
    
}

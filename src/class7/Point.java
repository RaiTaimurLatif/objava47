/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class7;

/**
 *
 * @author shahzad
 */
public class Point {

    // Attributes, variable, fields, literals
    double x;
    double y;

    // (No Argument | Default) Constructor
    Point() {
        this(0.0, 0.0);
    }

    // Argument / Duplicate Constructor
    Point(double x, double y) {
        setX(x); // x = newX ;
        setY(y); // y = newY ;
    }

    // Copy Constructor / Clone Constructor
    Point(Point p) {
//        x = p.x;
//        y = p.y;
        this(p.x, p.y);
    }

    // Propreties, functions, method,
    // return_type property_name ( parameter_list, ) { body }
    double getX() {
        return x;
    }

    void setX(double newX) {
        x = newX;
    }

    double getY() {
        return y;
    }

    void setY(double newY) {
        y = newY;
    }

    double distance(Point p) {
        return Math.sqrt(
                (p.y - this.y) * (p.y - this.y)
                + (p.x - this.x) * (p.x - this.x));
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    public static void main(String[] args) {
        Point p = new Point();
        p.x = 0;
        p.y = 10;
        Point p1 = new Point();
        Point p2 = new Point(10, 10);
        Point p3 = new Point(p2.x, p2.y);
//        p3.x = p2.x;
//        p3.y = p2.y;
        p.setX(10);
        System.out.println(p.getX() + ":" + p.y);
        System.out.println(p1.getX() + ":" + p1.y + "----" + p.distance(p1));
    }

}

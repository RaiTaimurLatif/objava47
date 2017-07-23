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

    // Attribute, variable, field, literals 
    private double x;
    private double y;
    Point next;

    // (No Argument | Default) Constructor
    public Point() {
//        x = 10.0; y = 10.0;
        this(10.0, 10.0);
    }

    // Argument Constructor / Duplicate
    public Point(double x, double y) {
        setX(x);// this.x = x;
        setY(y); // this.y = y;
    }

    // Clone / Copy Constructor
    public Point(Point p) {
//        x = p.x; y = p.y;
        this(p.x, p.y);
    }

    // Property, method, function, behavior
    // return name ( paramter(s) )
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point p) {
        return Math.sqrt(
                (p.y - this.y) * (p.y - this.y)
                + (p.x - this.x) * (p.x - this.x));
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    public static void main(String[] args) {
        Point p1 = new Point(); // permanent memory
        System.out.println(p1.x + ":" + p1.y + ":" + p1.next);
        Point p2 = new Point(5, 5);
        System.out.println(p2.x + ":" + p2.y + ":" + p2.next);
        System.out.println(p1.distance(p2));
    }
}
<<<<<<< HEAD
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
public class Line {
//    double x1, x2 ;
//    double y1, y2 ;

    Point start, end;

    // Default Constructor
    Line() {
//        start = new Point();
//        end = new Point();
        this(new Point(), new Point());
    }

    // Argument Constructor
    Line(double x1, double y1, double x2, double y2) {
//        start = new Point(x1, y1);
//        end = new Point(x2, y2);
        this(new Point(x1, y1), new Point(x2, y2));
    }

    Line(Point start, Point end) {
        this.start = new Point(start);
        this.end = new Point(end);
    }

    Line(Line line) {
//        this.start = new Point(line.start) ;
//        this.end = new Point(line.end) ;
        this(line.start, line.end);
    }

    @Override
    public String toString() {
        return "Line{" + "start=" + start + ", end=" + end + '}';
    }

    double length() {
        return start.distance(end);
    }

    public static void main(String[] args) {
        Line line = new Line(0, 0, 10, 10);
        System.out.println(line.length());
    }
}
=======
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
public class Line {

    Point start; // double x1, y1;
    Point end; // double x2, y2;

    Line() {
        this(new Point(), new Point());
    }

    Line(double x1, double y1, double x2, double y2) {
//        this.x1 = x1;
//        this.y1 = y1;
//        this.x2 = x2;
//        this.y2 = y2;
        this(new Point(x1, y1), new Point(x2, y2));
    }

    Line(Point start, Point end) {
        setStart(new Point(start));
        setEnd(new Point(end));
    }

    Line(Line line) {
        this(line.start, line.end);
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    double length() {
        return start.distance(end);
    }

    @Override
    public String toString() {
        return "Line{" + "start=" + start + ", end=" + end + "--dist=" + length() + '}';
    }

    public static void main(String[] args) {
        Line line = new Line(10, 10, 20, 20);
        System.out.println(line);
    }
  
}
>>>>>>> 4c4865a890960c17bc877322ea2c74f1bc91aeee

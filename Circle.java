/**
 * @author Or Tamir
 *
 *@apiNote Class Line extends Shape abstract class
 */

public class Circle extends Shape{
    // instance variables
    private static String shapeTypeName = "Circle";
    private Point midPoint;
    private double radius;


    public Circle(double x, double y, double radius){
        super(shapeTypeName, x, y);
        this.midPoint = new Point(super.midPoint);
        this.radius = radius;
    }

    public Circle(Point midPoint, double radius){
        super(shapeTypeName, midPoint.getX(), midPoint.getY());
        this.midPoint = new Point(super.midPoint);
        this.radius = radius;
}

    // Methods

    // TODO-FUTURE IMPLEMENTATION
    public void draw(){
        return;
    }

    public void deleteShape(){ // not beauty - need to find a better way
        midPoint = null;
    }

    public String toString(){
        return "mid-point:\t" + midPoint + "\nradius:\t" + radius;
    }
}

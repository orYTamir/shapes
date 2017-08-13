/**
 * @author Or Tamir
 *
 * Rectangle class assume the Rectangle is parallel to the x axis.
 *@apiNote Class Line extends Shape abstract class
 * @apiNote Class Rectangle has self implementations
 */

public class Rectangle extends Shape{

    // instance variables
    private static String shapeTypeName = "Rectangle";
    private Point topLeft;
    private Point bottomRight;

    // TODO change mid-Point implementation
    public Rectangle(double width, double height){
        super(shapeTypeName, (width/2), (height)/2);
        this.topLeft = new Point((midPoint.getX() - (width/2)), (midPoint.getY() + (height/2)));
        this.bottomRight = new Point((midPoint.getX() + (width/2)), (midPoint.getY() - (height/2)));
    }

    public Rectangle(Point topLeft, Point bottomRight){
        super(shapeTypeName,
                (((topLeft.getX() + bottomRight.getX()) / 2)), (topLeft.getY() + bottomRight.getY()) / 2);
        this.topLeft = new Point(topLeft);
        this.bottomRight = new Point(bottomRight);
    }

    // Methods

    // TODO-FUTURE IMPLEMENTATION
    public void draw(){
        return;
    }

    public void deleteShape(){ // not beauty - need to find a better way
        topLeft = null;
        bottomRight = null;
    }

    public String toString(){
      return "top left point:\t" + topLeft + "\nwidth:\t" + getWidth() + "\nheight:\t" + getHeight();
    }


    // self implementations
    public boolean isSquare(){
        return getHeight() == getWidth();
    }


    // return absolute width
    private double getWidth(){
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // return absolute height
    private double getHeight(){
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }
}

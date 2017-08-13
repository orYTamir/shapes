/**
 * @author Or Tamir

 * Lines can be in any position.
 * @apiNote Class Line extends Shape class
 */

public class Line extends Shape {

    // instance variables

    //TODO Change to p1x p2x...
    private static String shapeTypeName = "Line";
    private Point leftPoint;
    private Point rightPoint;

    // constructors

    // TODO change mid-Point implementation
//     Basic constructor - Take only x,y point- mid point default to (0,0)
    public Line(double leftX, double leftY, double rightX, double rightY){
        super(shapeTypeName, ((leftX + rightX)/2),((leftY + rightY)/2));
        this.leftPoint = new Point(leftX, leftY);
        this.rightPoint = new Point(rightX, rightY);
    }

    // Advanced constructor - Take position and Points
    public Line(Point leftPoint, Point rightPoint){
        super(shapeTypeName, ((leftPoint.getX() + rightPoint.getX())/2), ((leftPoint.getY() + rightPoint.getY())/2));
        this.leftPoint = new Point(leftPoint);
        this.rightPoint = new Point(rightPoint);
    }

    // Methods

    public void draw(){ // TODO future implementation
        return;
    }

    @Override // Line cannot have fill-Color
    public void setShapeFillColor(String newColor){
        System.out.println("Line cannot have fill color- set line color as default\n");
        shapeFillColor = shapeLineColor;
    }

    // TODO learn delete in Java
    public void deleteShape(){ // not beauty - need to find a better way
        leftPoint = null;
        rightPoint = null;
    }

    // AVIV- toString is data of the shape not the draw of the shape. Only min data
    public String toString(){
        String dash = "-";
//        int distanceToPrint = (int)leftPoint.distance(rightPoint);
//        for (int i=0; i < distanceToPrint -1 && i < 9; i++) {
//            dash += "-";
//        }
        return leftPoint + dash + rightPoint;
    }
}



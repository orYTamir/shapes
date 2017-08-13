/**
 * Abstract Shape class
 * my main class for extension
 * Currently not all methods are implemented.
 *
 * Known issues:
 * - MidPoint implementation is ugly. Next version each shape's decedent
 *   will implement midPoint as part of the constructor calling
 * - Change-Size, zoom, and rotation are not implemented yet
 * - test class not attached
 */

public abstract class Shape {

    // Instance vars
    protected String shapeType;
    protected Point midPoint;
    protected String shapeLineColor;
    protected String shapeFillColor;
    protected boolean visibilityState;

    // currently all IV are defaults
    Shape(String shapeType, double x, double y){
        this.shapeType = shapeType;
        this.midPoint = new Point(x, y);
        this.shapeLineColor = "black";
        this.shapeFillColor = "black";
        this.visibilityState = true;
    }

    // methods

    // TODO future implementation
    public abstract void draw();

    public String getShapeType(){
        return shapeType;
    }

    public Point getMidPoint(){
        return new Point(midPoint);
    }

    public void setMidPoint(Point newMidPoint){
        midPoint = new Point(newMidPoint);
    }

    public void setMidPoint(double newPosX, double newPosY){
        midPoint = new Point(newPosX, newPosY);
    }

    public String getShapeLineColor(){
        return shapeLineColor;
    }

    public void setShapeLineColor(String newColor){
        shapeLineColor = newColor;
    }

    public String getShapeFillColor(){
        return shapeFillColor;
    }

    public void setShapeFillColor(String newColor){
        shapeFillColor = newColor;
    }

    public boolean getVisibilityState(){
        return visibilityState;
    }

    public void setVisibilityState(boolean isVisible){
        visibilityState = isVisible;
    }

    public void moveHorizontal(int delta) {
        midPoint.moveHorizontal(delta);
    }

    public void moveVertical(int delta) {
        midPoint.moveVertical(delta);
    }

    public abstract void deleteShape();

    public abstract String toString();

    // TODO future implementation
//    public abstract void changeSize();

    // TODO future implementation
//    public abstract void zoom(int delta);

    // TODO future implementation
//    public abstract void rotate(int tilt);

    public void printStatus(){
        System.out.println("shape Type:\t" + shapeType +
                        "\nmidPoint:\t" + midPoint +
                        "\nshape Line Color:\t" + shapeLineColor +
                        "\nshape Fill Color:\t" + shapeFillColor +
                        "\nvisibility State:\t" + visibilityState);
    }
}
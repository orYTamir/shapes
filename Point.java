public class Point {

    // Instance variables
    private double x;
    private double y;

    // Constructor

    // If no entries
    public Point (){
        this.x = 0;
        this.y = 0;
    }

    public Point (double x, double y){
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point (Point other){
        x = other.x;
        y = other.y;
    }

    // Getters and Setters

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(int newX){
        this.x = newX;
    }

    public void setY(int newY){
        this.y = newY;
    }

    public boolean equals(Point other){
        return (x == other.x) && (y == other.y);
    }

    public boolean isAbove(Point other){
        return (y > other.y);
    }

    public boolean isUnder(Point other){
        return other.isAbove(this);
    }

    public boolean isLeft(Point other){
        return (other.isRight(this));
    }

    public boolean isRight(Point other){
        return (x > other.x);
    }

    public void moveHorizontal(double delta){
        x += delta;
    }

    public void moveVertical(double delta){
        y += delta;
    }

    public double distance (Point other){
        double xDist = (this.x - other.x);
        double yDist = (this.y - other.y);
        double xPow = (xDist * xDist);
        double yPow = (yDist * yDist);
        return Math.sqrt(xPow + yPow);
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }
}

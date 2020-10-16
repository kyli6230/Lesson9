package shapeProject;

import TurtleGraphics.Pen;

//abstract = can't make direct objects from Shape class
abstract public class Shape {
    
    protected double xPos, yPos;
    
    //protec
    
    public Shape(){
        xPos = 0;
        yPos = 0;
    }
    
    public Shape (double xp, double yp){
        xPos = xp;
        yPos = yp;
    }
    
    //all shapes have area but its different for each
    //must declare that fact here
    //must make method abstract
    //abstract method is declared like it is in an interface
    //these MUST be defined by Child class
    abstract public double area();
    abstract public void draw(Pen p);
    abstract public void stretchBy(double factor);
    abstract public double perimeter();
    
    //these methods are identical in all shapes
    // so we can provide code here
    //final means childern can NOT over-ride these methods
    final public double getXPos() {
        return xPos;
    }

    final public double getYPos() {
        return yPos;
    }

    final public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }
    //this should not be final because children override this method
    public String toString(){
        String str = ("(x, y) = (" + xPos + ", " + yPos + ")\n");
        str += "Area: " + area();
        str += "\nPerimeter: " + perimeter();
        return str;
    }
}

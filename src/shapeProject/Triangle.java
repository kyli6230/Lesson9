package shapeProject;

import TurtleGraphics.Pen;

public class Triangle extends Shape{

    //private double base, height;
    protected double xPos2, yPos2, xPos3, yPos3;
    //protected double changex, changey;
    
   /*
   public Triangle(){
       super();
       xPos2 = 100;
       yPos2=0;
       xPos3= 50;
       yPos3=100;
   }
    */
   
   public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
       super(x1,y1); //calls Shape (parent) constructor   
       xPos2= x2;
       xPos3 = x3;
       yPos2 = y2;
       yPos3 = y3;
   }
   
   @Override
    public double area() {
        return Math.abs ((xPos*yPos2-xPos2*yPos) + (xPos2*yPos3-xPos3*yPos2) + (xPos3*yPos-xPos*yPos3)) / 2;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos,yPos);
        p.down();
        p.move(xPos2,yPos2);
        p.move(xPos3,yPos3);
        p.move(xPos,yPos);
    }

    @Override
    public void stretchBy(double factor) {
        xPos2 *= factor;
        xPos3 *= factor;
        yPos2 *= factor;
        yPos3 *= factor;
        
    }
    @Override
    public void move(double xLoc, double yLoc) {
        double changex = xLoc - xPos;
        double changey = yLoc - yPos;
        
        xPos = xLoc;
        yPos = yLoc;
        
        xPos2 += changex;
        yPos2 += changey;
        xPos3 += changex;
        yPos3 += changey;
    }
    
    @Override
    public double perimeter() {
        return Math.sqrt((xPos-xPos2) * (xPos-xPos2) + (yPos-yPos2) * (yPos-yPos2)) +
        Math.sqrt((xPos2-xPos3) * (xPos2-xPos3) + (yPos2-yPos3) * (yPos2-yPos3)) + 
        Math.sqrt((xPos3-xPos) * (xPos3-xPos) + (yPos3-yPos) * (yPos3-yPos));
    }
    
    @Override
    public String toString(){
        String str = "TRIANGLE\n";
        str += "Coordinates: (" + xPos + " , " + yPos + "),\n (" + xPos2 + ", " + yPos2 + "),\n (" + xPos3 + ", " + yPos3 + ")\n";
        str += "Area: " + area();
        str += "\nPerimeter: " + perimeter();
        return str;
    }
    
}

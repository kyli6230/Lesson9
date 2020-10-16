package shapeProject;

import TurtleGraphics.Pen;

public class Triangle extends Shape{

    private double base, height;
    protected double xPos2, yPos2, xPos3, yPos3;
   
   public Triangle(){
       super();
       base = xPos2 - xPos;
       height = yPos3-yPos;
   }
   
   public Triangle(double x, double y, double w, double h){
       super(x,y); //calls Shape (parent) constructor       
       base = w;
       height = h;
   }
   
   @Override
    public double area() {
        return base * height / 2;
    }

    @Override
    public void draw(Pen p) {
        
    }

    @Override
    public void stretchBy(double factor) {
        xPos2 = (xPos2-xPos) * factor + xPos;
    }

    @Override
    public double perimeter() {
        return 
    }
    
}

package shapeProject;

import TurtleGraphics.Pen;
//super class and sub class is the same as parent and child clas
public class Wheel extends Circle {
    //Wheel inherits evverything from Circle
    //except constructor
    private int spokes; //wheel has four properties
    
    public Wheel(){
        xPos = 0;
        yPos = 0;
        radius = 0;
        spokes = 3;
    }
    public Wheel(double x, double y, double r, int s){
        super (x,y,r); //super = call parent constructor
        spokes = s;
    }
    
    public void draw(Pen p){
        //call parent draw to get the circle
        super.draw(p);
        //draw spokes
        for (int i = 1; i <= spokes; i++) {
            p.up();
            p.move(xPos, yPos);
            p.down();
            p.setDirection(i * 360 / spokes);
            p.move(radius);
        }
    }
    
    //exclusive method
    public void setSpokes(int s){
        spokes = s;
    }
    
    //over-ride the toString Method()
    public String toString(){
        String str = "WHEEL\n";
        str += "Radius: " + radius + "\n";
        str += ("(x, y) = (" + xPos + ", " + yPos + ")\n");
        str += "Area: " + area();
        str += "\nPerimeter: " + perimeter();
        return str;
    }
}


package InterfaceEx2;

import TurtleGraphics.Pen;

public class Circle implements Shape {

    protected double xPos, yPos, radius;
    //protected = avaiable here and to package only
    
    public Circle(){
     xPos = 0;
     yPos = 0;
     radius = 1;
    }
    
    public Circle(double x, double y, double r){
        xPos = x;
        yPos = y;
        radius = r;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(Pen p) {
        double side = 2 * Math.PI * radius / 120;
        //120 - sided shape
        p.up();
        p.move(xPos, yPos);
        //go to edge
        p.setDirection(0);
        p.move(radius);
        p.setDirection(90);
        p.down();
        for (int i = 1; i <= 120; i++) {
            p.move(side);
            p.turn(3); //120 * 3 =360 degrees
        }
        
    }

    @Override
    public double getXPos() {
        return xPos;
    }

    @Override
    public double getYPos() {
        return yPos;
    }

    @Override
    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }

    @Override
    public void stretchBy(double factor) {
        radius *= factor;
    }
    @Override
    public String toString(){
        String str = "CIRCLE\n";
        str += "Radius: " + radius + "\n";
        str += ("(x, y) = (" + xPos + ", " + yPos + ")\n");
        str += "Area: " + area();
        return str;
    }
    
}

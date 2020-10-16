package InterfaceEx2;

import TurtleGraphics.Pen;
//super class and sub class is the same as parent and child clas
public class Wheel extends Circle {
    //Wheel inherits evverything from Circle
    //except constructor
    private int spokes; //wheel has four properties
    private static int wheelCount = 0;
    private static double avgSize= 0;
    
    public Wheel(){
        super();
        spokes = 3;
        wheelCount++;
        avgSize += area();
    }
    public Wheel(double x, double y, double r, int s){
        super (x,y,r); //super = call parent constructor
        spokes = s;
        wheelCount++;
        avgSize += area();
    }
    
    public static int getWheelCount(){
        return wheelCount;
    }
    
    public static double getAvgSize(){
        return (double) avgSize / wheelCount;
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
        String str = "WHEEl\n";
        str += "Radius: " + radius + "\n";
        str += ("(x, y) = (" + xPos + ", " + yPos + ")\n");
        str += "Number of spokes: " + spokes + "\n";
        str += "Area: " + area();
        return str;
    }
}

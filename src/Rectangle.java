import apcslib.*;
import java.awt.Color;

public class Rectangle {
    private double myX;      // the x coordinate of the rectangle
    private double myY;      // the y coordinate of the rectangle
    private double myWidth;  // the width of the rectangle
    private double myHeight; // the height of the rectangle
    private Color myColor;
    // Creates a 500 x 500 SketchPad with a DrawingTool, pen, that is // used to display Rectangle objects. The DrawingTool is declared // static so that multiple Rectangle objects can be drawn on the // Sketchpad at the same time.

    public static DrawingTool pen = new DrawingTool(new SketchPad(500, 500));

    // Creates a new instance of a Rectangle object with the left and // right edges of the rectangle at x and x + width. The top and // bottom edges are at y and y + height.
    public Rectangle(double x, double y, double width, double height){
        myX = x;
        myY = y;
        myWidth = width;
        myHeight = height;
        myColor = Color.black;
    }

    public Rectangle(double x, double y, double width, double height, Color color){
    	this(x,y,width,height);
    	myColor = color;
    }
    // Calculates and returns the perimeter of the rectangle
    public double getPerimeter(){
        return 2*myWidth + 2*myHeight;
    }

    // Calculates and returns the are of the rectangle.
    public double getArea(){
        return myHeight * myWidth;
    }
    // Draws a new instance of a Rectangle object with the left and // right edges of the rectangle at x and x + width. The top and // bottom edges are at y and y + height.

    public void draw(){
    	
    	pen.setColor(myColor);
        pen.up();
        pen.move(myX,myY);
        pen.down();
        pen.setDirection(270);
        pen.forward(myHeight);
        pen.setDirection(0);
        pen.forward(myWidth);
        pen.setDirection(90);
        pen.forward(myHeight);
        pen.setDirection(180);
        pen.forward(myWidth);
    }
}
import java.awt.Color;

import apcslib.DrawingTool;
import apcslib.SketchPad;

public class Phone {
    private double batteryLife;
    private String os;
    private double volume;
    private String carrier;
    private String person;
    
    public Phone (double newBattery, String newOS, String theCarrier ,String thePerson) {
        batteryLife = newBattery;
        os = newOS;
        carrier = theCarrier;
        volume = 100;
        person = thePerson;
    }

    public void turnUpVolume(double newVol) {
        volume = newVol;
    }

    public String call(String person) {
        return "hello, this is "+person;
    }

    public double getVolume() {
        return volume;
    }
    
    public void draw() {
    	Rectangle.pen = new DrawingTool(new SketchPad(500, 500));
    	DrawingTool pen = Rectangle.pen;

        Rectangle frame = new Rectangle(-220,220, 140,400);
        frame.draw();
        Rectangle battery = new Rectangle(-200,200,batteryLife, 50, Color.yellow);
        battery.draw();
        pen.setColor(Color.black);
        pen.up();
        pen.move(-215,210);
        pen.down();
        pen.drawString(carrier);
        pen.up();
        pen.move(-170,120);
        pen.down();
        pen.drawString(os);
        
        pen.up();
        pen.move(-170,0);
        pen.down();
        pen.drawString(person + System.lineSeparator() + " says hello!");
    }
}
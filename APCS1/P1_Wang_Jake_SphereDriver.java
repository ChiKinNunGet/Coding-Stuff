/*
    Name:       Jake Wang
    Date:       9/10/22
    Period:     1

    Is this lab fully working?  yes
    If not, explain:
*/
import gpdraw.*;
import java.awt.Color;
import java.util.Random;
public class P1_Wang_Jake_SphereDriver
{
    // instance variables - replace the example below with your own
    private int x;
    public static void main(String[] Args)
    {
        SketchPad Paper = new SketchPad(800, 600, 1);
        P1_Wang_Jake_Sphere Ball = new P1_Wang_Jake_Sphere(150, Paper);
        
        Color BGColor = new Color(233,238,238);
        Color FloorColor = new Color(252,254,245);
        
        // background and floor
        DrawingTool Pen1 = new DrawingTool(Paper);
        Pen1.up();
        Pen1.move(0, 150);
        Pen1.down();
        Pen1.setColor(BGColor);
        Pen1.fillRect(800, 300);
        Pen1.up();
        Pen1.move(0, -150);
        Pen1.down();
        Pen1.setColor(FloorColor);
        Pen1.fillRect(800, 300);
        
        Ball.draw();
        
    }

}

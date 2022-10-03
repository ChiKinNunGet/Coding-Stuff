import java.awt.Color;
import gpdraw.*;
public class P1_Wang_Jake_RectangleDriver
{
    public static void main(String[] Args){
        SketchPad matt = new SketchPad(600,600,0);
        
        double sCX = -150.0;
        double sCY = -150.0;
        double sX = 300.0;
        double sY = 300.0;
        
        double hCX = -150.0;
        double hCY = -50.0;
        double hX = 300.0;
        double hY = 100.0;
        
        double vCX = -50.0;
        double VCY = -150.0;
        double vX = 100.0;
        double vY = 300.0;
        
        Rectangle shell = new Rectangle(-150.0,-150.0,300.0,300.0,matt);
        Rectangle hBar = new Rectangle(-150.0, -50.0,300.0,100.0,matt);
        Rectangle vBar = new Rectangle(-50.0, -150.0, 100.0, 300.0, matt);
        
        shell.draw();
        hBar.draw();
        vBar.draw();
        
        System.out.println("shell perimeter, area = " + (2*(sX+sY)) + "," + (sX*sY) + 
                            "\nhorizontal bar perimeter, area = " + (2*(hX+hY)) + "," + (hX*hY) + 
                            "\nvertical bar perimeter, area = " + (2*(vX+vY)) + "," + (vX*vY));
    }
}

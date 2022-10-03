/*
    Name:       Jake Wang
    Date:       9/3/22
    Period:     1

    Is this lab fully working?  yes
    If not, explain:
*/
import gpdraw.*;
import java.awt.Color;
import java.util.Random;
/**
 * Draws a single apartment unit exterior
 */
public class P1_Wang_Jake_DrawUnit
{
    // instance variables - replace the example below with your own
    int xCenter;
    int yCenter;
    SketchPad paper;
    DrawingTool pen;
    double ACChance;
    boolean IsSnowing;

    /**
     * Draws a singular apartment unit exterior
     * 
     * @param Cx x value of the center of block, width is 200 px.
     * @param Cy y value of the center of block, height is 150 px.
     * @param pad the SketchPad object to draw on (imported from gpdraw library).
     * @param ACRate the probability that an air conditioning unit will be drawn on each apartment unit.
     */
    public P1_Wang_Jake_DrawUnit(int Cx, int Cy, SketchPad pad, double ACRate){
        // initialise instance variables
        xCenter = Cx;
        yCenter = Cy;
        paper = pad;
        ACChance = ACRate;
        
    }
    
    /**
     * decides snow status to decide version to draw. must be ran before drawing
     * @param snowing true - draw snowy version of apartments, false - draw without snow
     */
    public void SetSnowing(boolean snowing){
        IsSnowing = snowing;
    }
    
    /**
     * self-explanatory
     */
    public void Draw(){
        pen = new DrawingTool(paper);
        Random rand = new Random();
        
        //since starting location is passed in, all movements should be relative, not absolute
        pen.up();
        pen.move(xCenter, yCenter); //center in middle of frame
        pen.setDirection(90);
        
        Color Concrete = new Color(217,208,193); //not used, just for semi-random color
        Color ConcreteLight = new Color(237,228,213);
        Color ConcreteDark = new Color(207,198,183);
        Color WindowDark = new Color(142,190,216);
        Color WindowLight = new Color(180,212,229);
        Color Black = new Color (40,48,32);
        
        //drawing pen now
        pen.down(); //Centered
        int RedRand = rand.nextInt(30);
        int GreenRand = rand.nextInt(30);
        int BlueRand = rand.nextInt(30);
        pen.setColor(new Color(202+RedRand, 193+GreenRand, 178+BlueRand));
        pen.fillRect(200, 150);
        pen.up();
        
        //windows
        pen.move(20); //(0, 20)
        pen.down();
        pen.setColor(Black);
        pen.fillRect(190, 90);
        pen.setColor(WindowDark);
        pen.fillRect(188, 88);
        pen.setColor(ConcreteLight);
        pen.fillRect(104, 88);
        pen.setColor(WindowLight);
        pen.fillRect(94, 88);
        pen.setColor(ConcreteLight);
        pen.fillRect(5, 88);
        pen.up();
        
        //bars below windows
        pen.move(-70); //(0, -50)
        pen.down();
        pen.setColor(ConcreteDark);
        pen.fillRect(190, 40);
        pen.up();
        pen.move(-20); //(0, -70), 5 from bottom margin
        pen.setDirection(180);
        pen.move(95); //(-95, -70). (5, 5) if origin were at bottom left
        pen.down();
        pen.setColor(Black);
        pen.setWidth(2);
       
        for (int i = 0; i<=9; i++) {
            pen.move((xCenter+i*19-85.5), (yCenter-30));
            pen.move((xCenter+i*19-76), (yCenter-70));
        }  
        
        int RandVal = rand.nextInt(100);
        P1_Wang_Jake_DrawAC DrawAC;
        
        if (RandVal<=100*ACChance){
            if (RandVal%2 != 0){
                DrawAC = new P1_Wang_Jake_DrawAC((xCenter-23), yCenter, IsSnowing, paper, 1);
                DrawAC.draw();
            }
            else {
                DrawAC = new P1_Wang_Jake_DrawAC((xCenter+23), yCenter, IsSnowing, paper, 1);
                DrawAC.draw();
            }
        }
    }
}

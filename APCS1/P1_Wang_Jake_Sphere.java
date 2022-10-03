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
import java.lang.Math.*;
public class P1_Wang_Jake_Sphere {

    // Attributes (also called instance variables)
    SketchPad Paper;
    DrawingTool Pen;
    Color IrisColor;
    int PupilRadius; // 10 to 50
    double Scale; // multiplier for all lengths
        
    // Constructors
    /**
    @param pupilradius The radius of the pupil from 10 to 50 on original scale of 150px radius. Anything above or below becomes closest valid value.
    @param scale The scale to multiply all lengths by. Default 1 for 150 radius eyeball
    @param paper The SketchPad object used to draw on
    */
    public P1_Wang_Jake_Sphere(int radius, SketchPad paper){
        Paper = paper;
        Pen = new DrawingTool(Paper);
        IrisColor = new Color(166,226,228);
        PupilRadius = 25;
        Scale = (double)radius/150;
    }

    // Methods
    /* Getter & Setter methods */
    public double GetRadius(){
        return Scale*150;
    }
    public double GetSurfaceArea(){
        return 4.0* Math.PI *(Scale*150)*(Scale*150);
    }
    public double GetVolume(){
        return (double)4.0/3.0*Math.PI*Math.pow((Scale*150), 3);
    }
    
    /**
     * @param radius Set radius of sphere/eyeball
     */
    public void setRadius(int radius){
        Scale = (double)radius/150;
    }
    /* Other methods */
    public void draw() {
        //Draw shadow
        Pen.move(0, -150*Scale);
        for (int Shell = 20; Shell >=1; Shell--){
            for (int Row=1; Row<=20; Row++){
                int width = (int)((double)4*Shell*Math.log(20-Row));
                Pen.up();
                Pen.move(0, (-150+Row)*Scale);
                Pen.setColor(new Color((int)(126*0.05*Shell), (int)(127*0.05*Shell), (int)(123*0.05*Shell)));
                Pen.down();
                Pen.drawRect(width, Scale);
                Pen.up();
                Pen.move(0, (-150-Row)*Scale);
                Pen.down();
                Pen.drawRect(width, Scale);
            }
        }
        
        //main eyeball structure
        Pen.up();
        Pen.move(0, 0);
        Pen.down();
        Pen.setColor(new Color(232,215,189)); //eyeball border
        Pen.drawCircle(150*Scale);
        Pen.setColor(new Color(252,235,209)); //eyeball 
        Pen.fillCircle(150*Scale - 1);
        Pen.setColor(new Color(235,219,196)); //ring around iris
        Pen.fillCircle(60*Scale);
        Pen.setColor(IrisColor); //iris
        Pen.fillCircle(50*Scale);
        Pen.setColor(new Color(3, 5, 8)); //pupil
        Pen.fillCircle(PupilRadius * Scale);
        Pen.up();
        
        //eyeball arteries
        int ArteryCount = 5;
        Pen.setColor(new Color(179,5,4));
        for (int Artery = 1;Artery<=ArteryCount;Artery++){
            Pen.up();
            Random Richard = new Random();
            int Angle = Artery*360/ArteryCount;
            Pen.move(Scale*50*Math.cos(Math.toRadians(Angle)), Scale*50*Math.sin(Math.toRadians(Angle)));
            Pen.setDirection(Angle);
            Pen.setWidth(3);
            Pen.down();
            for (int Seg=1;Seg<=25;Seg++){
                Pen.move(3);
                Pen.turn(Richard.nextInt(60)-30);
                //Pen.setDirection(Angle + Richard.nextInt(120)-60);
            }
        }
        
        for (int ArteryB = 1;ArteryB<=ArteryCount;ArteryB++){
            Pen.up();
            Random Richard = new Random();
            int Angle = (int)(((double)ArteryB+.5)*360/ArteryCount);
            Pen.move(Scale*150*Math.cos(Math.toRadians(Angle)), Scale*150*Math.sin(Math.toRadians(Angle)));
            Angle-=180;
            Pen.setDirection(Angle);
            Pen.setWidth(3);
            Pen.down();
            for (int Seg=1;Seg<=15;Seg++){
                Pen.move(5);
                Pen.turn(Richard.nextInt(60)-30);
                //Pen.setDirection(Angle + Richard.nextInt(120)-60);
            }
        }
    }

}